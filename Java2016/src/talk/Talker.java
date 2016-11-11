package talk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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

public class Talker extends JFrame implements ActionListener, KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JLabel lbUser, lbServer, lbServerStatus, lbClient;
	JTextField tfClient, tfMsg;
	JTextArea ta;
	JButton btnConn, btnSend;
	ServerSocket server;
	Socket serverIO;
	int count = 0;
	int serverPort = 1978;
	PrintWriter sWriter, cWriter;
	Socket client;
	boolean read = true;
	static InetAddress addr;

	static {
		try {
			addr = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("InetAddress error :" + e.getMessage());
		}
	}

	public Talker() {
		// TODO Auto-generated constructor stub
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 300, 420);

		lbUser = new JLabel(addr.getHostName());
		lbServer = new JLabel("Server : ");
		lbServerStatus = new JLabel("Not start");
		lbClient = new JLabel("Client : ");
		tfClient = new JTextField("192.168.64.106");
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
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				if (cWriter != null) {
					cWriter.println(addr.getHostName() + " 離開聊天室");
				}

				try {
					if (serverIO != null) {
						serverIO.close();
						serverIO = null;
					}
					if (server != null) {
						server.close();
						server = null;
					}

					read = false;

					if (client != null) {
						client.close();
						client = null;
					}

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println(getClass().getSimpleName() + " " + e1.getMessage());
				}

			}
		});

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
					// Thread th = null;
					while (true) {
						serverIO = server.accept();
						new Thread(new Runnable() {
							@Override
							public void run() {
								// TODO Auto-generated method stub
								try {
									count++;
									btnConn.setEnabled(false);
									lbServerStatus.setText(serverIO.getInetAddress().getHostAddress() + "connected");
									ta.append(serverIO.getInetAddress().getHostName() + " 加入聊天室\n");
									sWriter = new PrintWriter(serverIO.getOutputStream(), true);
									BufferedReader reader = new BufferedReader(
											new InputStreamReader(serverIO.getInputStream(), "UTF-8"));

									while (true) {
										String line = reader.readLine();
										if (line != null) {
											ta.append(line + "\n");
											ta.setCaretPosition(ta.getDocument().getLength());
											if (line.contains("離開聊天")) {
												serverIO.close();
												serverIO = null;
											}
										}
									}
								} catch (IOException e) {
									// TODO Auto-generated catch block
									System.out.println(getClass().getSimpleName() + " " + e.getMessage());
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
					System.out.println(getClass().getSimpleName() + " " + e.getMessage());
				}

			}
		}).start();
	}

	public void StartClient(String ip, int port) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					client = new Socket(ip, port);
					cWriter = new PrintWriter(client.getOutputStream(), true);
					BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream(), "UTF-8"));
					read = true;

					// TODO Auto-generated method stub
					try {
						ta.append("已加入" + client.getInetAddress().getHostName() + "的聊天室\n");
					} catch (NullPointerException e) {
						// TODO: handle exception
						System.out.println(getClass().getSimpleName() + " " + "HostName failure " + e.getMessage());
					}
					System.out.println("執行迴圈");
					while (read) {
						String line;
						try {
							System.out.println("讀取資料");
							line = br.readLine();
							if (line != null) {
								ta.append(line + "\n");
								ta.setCaretPosition(ta.getDocument().getLength());
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							System.out.println("client start reading failure," + e.getMessage());
						}
					}

				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					System.out.println(getClass().getSimpleName() + " " + "UnknownHostException" + e.getMessage());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println(getClass().getSimpleName() + " " + "IO Exception : " + e.getMessage());
				} finally {
					cWriter.println(addr.getHostName() + " 離開聊天室");
					cWriter = null;
					read = false;
					try {
						client.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.println(getClass().getSimpleName() + " " + "client.close() " + e.getMessage());
					} finally {
						client = null;
						startServer(serverPort);
					}

				}
			}
		}).start();
	}

	public static void main(String[] args) {
		new Talker();
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
				sWriter.println(addr.getHostName() + ": " + tfMsg.getText());
			}
			if (cWriter != null) {
				cWriter.println(addr.getHostName() + ": " + tfMsg.getText());
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
				sWriter.println(addr.getHostName() + ": " + tfMsg.getText());
			}
			if (cWriter != null) {
				cWriter.println(addr.getHostName() + ": " + tfMsg.getText());
			}
			tfMsg.setText("");
		} else {
			if (client == null) {
				StartClient(tfClient.getText(), 1978);
				btnConn.setEnabled(false);
				try {
					server.close();

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println(this.getClass().getSimpleName() + " " + e1.getMessage());
				} finally {
					sWriter = null;
					server = null;
				}
			}
		}
	}
}
