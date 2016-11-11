package talk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Talker2 extends JFrame implements ActionListener, KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JLabel lbUser, lbServer, lbServerStatus, lbClient;
	JTextField tfClient, tfMsg;
	JTextArea ta;
	JButton btnConn, btnSend;
	ServerSocket server;
	int count = 0;
	int serverPort = 1979;
	PrintWriter sWriter, cWriter;
	Socket client;
	static InetAddress addr;

	static {
		try {
			addr = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("Talker2 "+"InetAddress error :" + e.getMessage());
		}
	}

	public Talker2() {
		// TODO Auto-generated constructor stub
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 300, 420);

		lbUser = new JLabel(addr.getHostName());
		lbServer = new JLabel("Server : ");
		lbServerStatus = new JLabel("Not start");
		lbClient = new JLabel("Client : ");
		tfClient = new JTextField("192.168.43.79:1978");
		btnConn = new JButton("Connect");
		ta = new JTextArea();
		JScrollPane scr = new JScrollPane(ta);
		tfMsg = new JTextField();
		btnSend = new JButton("Send Message");

		lbUser.setBounds(80, 10, 100, 20);
		lbServer.setBounds(10, 40, 50, 20);
		lbServerStatus.setBounds(70, 40, 100, 20);
		lbClient.setBounds(10, 70, 50, 20);
		tfClient.setBounds(70, 70, 100, 20);
		btnConn.setBounds(180, 40, 90, 50);
		scr.setBounds(10, 100, 260, 200);
		tfMsg.setBounds(10, 310, 260, 20);
		btnSend.setBounds(10, 340, 260, 20);

		add(lbUser);
		add(lbServer);
		add(lbServerStatus);
		add(lbClient);
		add(tfClient);
		add(btnConn);
		add(scr);
		add(tfMsg);
		add(btnSend);

		tfMsg.addKeyListener(this);
		btnConn.addActionListener(this);
		btnSend.addActionListener(this);

		startServer(serverPort);

		setVisible(true);
	}

	public void startServer(int port) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					server = new ServerSocket(port);
					lbServerStatus.setText("Waiting...");
					while (true) {
						Socket socket = server.accept();
						new Thread(new Runnable() {
							@Override
							public void run() {
								// TODO Auto-generated method stub
								try {
									count++;
									btnConn.setEnabled(false);
									lbServerStatus.setText(socket.getInetAddress().getHostAddress() + "connected");
									ta.append(socket.getInetAddress().getHostName() + " 加入聊天\n");
									sWriter = new PrintWriter(socket.getOutputStream(), true);
									BufferedReader reader = new BufferedReader(
											new InputStreamReader(socket.getInputStream(), "UTF-8"));

									while (true) {
										String line = reader.readLine();
										if (line != null) {
											ta.append(line + "\n");
											ta.setCaretPosition(ta.getDocument().getLength());
											if (line.contains("離開聊天")) {
												
											}
										}
									}
								} catch (IOException e) {
									// TODO Auto-generated catch block
									System.out.println(getClass().getSimpleName()+" "+e.getMessage());
									count--;
									if (count == 0) {
										btnConn.setEnabled(true);
									}
								}
							}
						}).start();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println(getClass().getSimpleName()+" "+e.getMessage());
				}

			}
		}).start();
	}

	public void StartClient(String ip) {
		String[] ips = ip.split(":");
		try {
			client = new Socket(ips[0], Integer.parseInt(ips[1]));
			cWriter = new PrintWriter(client.getOutputStream(), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream(), "UTF-8"));
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					while (client != null && !client.isClosed()) {
						String line;
						try {
							line = br.readLine();
							if (line != null) {
								ta.append(line + "\n");
								ta.setCaretPosition(ta.getDocument().getLength());
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							System.out.println(getClass().getSimpleName()+" "+e.getMessage());
						}
					}
				}
			}).start();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println(getClass().getSimpleName()+" "+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(getClass().getSimpleName()+" "+e.getMessage());
		} finally {
			cWriter.println(addr.getHostName() + " 離開聊天");
			cWriter = null;
			try {
				client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(getClass().getSimpleName()+" "+e.getMessage());
			} finally {
				client = null;
				startServer(serverPort);
			}

		}
	}

	public static void main(String[] args) {
		new Talker2();
	}

	// public Thread startServer() {
	//
	// }

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == 10 && tfMsg.getText() != "") {
			ta.append(tfMsg.getText() + "\n");
			if (sWriter != null) {
				sWriter.println(tfMsg.getText());
			}
			if (cWriter != null) {
				sWriter.println(tfMsg.getText());
			}
			tfMsg.setText("");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnSend) {
			ta.append(tfMsg.getText() + "\n");
			if (sWriter != null) {
				sWriter.println(tfMsg.getText());
			}
			if (cWriter != null) {
				sWriter.println(tfMsg.getText());
			}
			tfMsg.setText("");
		} else {
			if (client == null) {
				StartClient(tfClient.getText());
				btnConn.setEnabled(false);
				try {
					server.close();

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					sWriter = null;
					server = null;
				}
			}
		}
	}
}
