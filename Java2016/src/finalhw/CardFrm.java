package finalhw;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class CardFrm {

	private JFrame frame;
	private JLabel lblCount;
	private JLabel lblShows[];
	private JLabel lblAns[];
	private JLabel lblTemp;
	private ImageIcon[] imgs;
	private MouseListener mouseListener;
	private ActionListener actionListener;
	private CardGame game;
	private Integer[][] arr;
	private JTextField tfCashTot;
	private JTextField tfCash;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardFrm window = new CardFrm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CardFrm() {
		game = new CardGame();
		startMouseListener();
		startActionListener();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblShows = new JLabel[8];
		lblAns = new JLabel[8];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				JLabel label = new JLabel("X");
				label.setBounds(74 + j * 200, 20 + i * 60, 17, 19);
				lblAns[i * 2 + j] = label;
				frame.getContentPane().add(label);

				// label = new JLabel("lbl0" + (i * 2 + j + 1));
				label = new JLabel();
				label.setBounds(14 + j * 200, 20 + i * 60, 57, 19);
				label.addMouseListener(getMouseListener());
				frame.getContentPane().add(label);
				lblShows[i * 2 + j] = label;
			}
		}

		lblCount = new JLabel("獎金總額 (元): 0");
		lblCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCount.setBounds(14, 235, 404, 19);
		frame.getContentPane().add(lblCount);

		JButton btnNext = new JButton("Next");
		btnNext.setBounds(14, 293, 404, 27);
		btnNext.addActionListener(getActionListener());
		frame.getContentPane().add(btnNext);

		JButton btnDone = new JButton("Done");
		btnDone.setBounds(14, 333, 404, 27);
		btnDone.addActionListener(getActionListener());
		frame.getContentPane().add(btnDone);

		JLabel lblCashTot = new JLabel("下注金額(元) : ");
		lblCashTot.setBounds(14, 261, 97, 19);
		frame.getContentPane().add(lblCashTot);

		tfCashTot = new JTextField();
		tfCashTot.setText("0");
		tfCashTot.setHorizontalAlignment(SwingConstants.TRAILING);
		tfCashTot.setBounds(111, 258, 91, 25);
		frame.getContentPane().add(tfCashTot);
		tfCashTot.setColumns(10);

		JLabel lblCash = new JLabel("單筆金額 (元) : ");
		lblCash.setBounds(230, 264, 101, 19);
		frame.getContentPane().add(lblCash);

		tfCash = new JTextField();
		tfCash.setText("0");
		tfCash.setHorizontalAlignment(SwingConstants.TRAILING);
		tfCash.setColumns(10);
		tfCash.setBounds(333, 261, 85, 25);
		frame.getContentPane().add(tfCash);

	}

	private void startMouseListener() {
		mouseListener = new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("mouseClicked");
				JLabel lb = (JLabel) e.getSource();
				if (lblTemp == null) {
					lblTemp = lb;
				} else {
					if (lblTemp != lb) {
						System.out.println("Not equal");
						if (lblTemp.getIcon().toString().equals(lb.getIcon().toString())) {
							lblTemp.setIcon(
									imgs[Integer.parseInt(lblTemp.getIcon().toString().split("-")[1].substring(0, 1))
											- 1]);
							lb.setIcon(
									imgs[Integer.parseInt(lb.getIcon().toString().split("-")[1].substring(0, 1)) - 1]);

							int cash = Integer.parseInt(tfCash.getText());
							game.setScore(10 * cash);
							lblCount.setText("獎金總額 (元) : " + game.getScore());
							for (int i = 0; i < lblShows.length; i++) {
								if (lb.equals(lblShows[i]))
									lblAns[i].setText("O");
								if (lblTemp.equals(lblShows[i]))
									lblAns[i].setText("O");
							}
						} else {
							lblTemp.setIcon(
									imgs[Integer.parseInt(lblTemp.getIcon().toString().split("-")[1].substring(0, 1))
											- 1]);
							lb.setIcon(
									imgs[Integer.parseInt(lb.getIcon().toString().split("-")[1].substring(0, 1)) - 1]);
							for (int i = 0; i < lblShows.length; i++) {
								if (lb.equals(lblShows[i]))
									lblAns[i].setText("X");
								if (lblTemp.equals(lblShows[i]))
									lblAns[i].setText("X");
							}
						}
					}
					lblTemp = null;
					System.out.println("Clear");
				}
			}
		};
	}

	private MouseListener getMouseListener() {
		return mouseListener;
	}

	private void startActionListener() {
		actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn = (JButton) e.getSource();
				if (btn.getText().equalsIgnoreCase("Next")) {
					int cashTot = Integer.parseInt(tfCashTot.getText());
					int cash = Integer.parseInt(tfCash.getText());
					if (cashTot > 0 && cashTot - cash >= 0) {
						imgs = game.getImgIcon();
						for (JLabel label : lblAns) {
							label.setText("");
						}
						int j = 0;
						arr = game.setPosition();
						for (Integer[] i : arr) {
							// System.out.println(i);
							for (Integer integer : i) {
								System.out.println(integer);
								lblShows[j].setEnabled(false);
								lblShows[j++].setIcon(imgs[integer - 1]);
							}
						}
						delayTimer();
						tfCashTot.setText(cashTot - cash + "");
						if (cash > cashTot) {
							tfCash.setText(cashTot + "");
						}
					} else {
						String msg = "您共獲得獎金(元) : " + game.getScore();
						JOptionPane.showMessageDialog(null, msg);
						System.exit(0);
					}
				} else if (btn.getText().equalsIgnoreCase("Done")) {
					String msg = "您共獲得獎金(元) : " + game.getScore();
					JOptionPane.showMessageDialog(null, msg);
					System.exit(0);
				}
			}
		};
	}

	private ActionListener getActionListener() {
		return actionListener;
	}

	private void delayTimer() {
		new Timer().schedule(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				ImageIcon[] imgsBlank = game.getImgIconBlank();
				for (JLabel label : lblShows) {
					// label.setText("Click");
					label.setIcon(
							imgsBlank[Integer.parseInt(label.getIcon().toString().split("\\\\")[1].substring(0, 1))
									- 1]);
					label.setEnabled(true);
				}
			}
		}, 2 * 1000);
	}
}
