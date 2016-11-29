package finalhw;

import java.awt.EventQueue;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class SlotTigerFrm {

	private JFrame frame;

	private JLabel[][] lbs;
	private JLabel lblCount;
	private ActionListener actionListener;
	private SlotTigerGame game;
	private JTextField tfCash;
	private JTextField tfCashTot;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SlotTigerFrm window = new SlotTigerFrm();
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
	public SlotTigerFrm() {
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

		lbs = new JLabel[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// lbs[i][j] = new JLabel(i * 3 + j + 1 + "");
				lbs[i][j] = new JLabel();
				lbs[i][j].setBounds(60 + i * 80, 20 + j * 60, 60, 20);
				frame.getContentPane().add(lbs[i][j]);
			}
		}

		lblCount = new JLabel("當前獎金總額 (元) : 0");
		lblCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCount.setBounds(14, 265, 304, 19);
		frame.getContentPane().add(lblCount);

		JButton btnNext = new JButton("Next");
		btnNext.setBounds(352, 13, 66, 271);
		btnNext.addActionListener(getActionListener());
		frame.getContentPane().add(btnNext);

		JButton btnDone = new JButton("Done");
		btnDone.setBounds(14, 333, 404, 27);
		btnDone.addActionListener(getActionListener());
		frame.getContentPane().add(btnDone);

		JLabel lblCash = new JLabel("下注量(元) : ");
		lblCash.setBounds(219, 299, 87, 19);
		frame.getContentPane().add(lblCash);

		tfCash = new JTextField();
		tfCash.setHorizontalAlignment(SwingConstants.TRAILING);
		tfCash.setText("0");
		tfCash.setBounds(302, 297, 116, 25);
		frame.getContentPane().add(tfCash);
		tfCash.setColumns(10);

		JLabel lblCashTot = new JLabel("籌碼(元) : ");
		lblCashTot.setBounds(14, 297, 78, 19);
		frame.getContentPane().add(lblCashTot);

		tfCashTot = new JTextField();
		tfCashTot.setHorizontalAlignment(SwingConstants.TRAILING);
		tfCashTot.setText("0");
		tfCashTot.setToolTipText("");
		tfCashTot.setBounds(94, 297, 116, 25);
		frame.getContentPane().add(tfCashTot);
		tfCashTot.setColumns(10);

		game = new SlotTigerGame();
		setRandomIcon();
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
						setRandomIcon();
						int[] gets = new int[3];
						int i = 0;
						for (JLabel[] jLabels : lbs) {
							gets[i++] = Integer
									.parseInt(jLabels[1].getIcon().toString().split("\\\\")[1].substring(0, 1));
						}
						if (gets[0] - gets[1] == 0 && gets[0] - gets[2] == 0) {
							game.setScore(10 * cash);
							lblCount.setText("當前獎金總額 (元) : " + game.getScore());
						}
						tfCashTot.setText(cashTot - cash + "");

						if (cashTot < cash)
							tfCash.setText(cashTot + "");
					} else {
						String msg = "投注結束!\n您總共獲得(元) : " + game.getScore();
						JOptionPane.showMessageDialog(null, msg);
						System.exit(0);
					}

				} else if (btn.getText().equalsIgnoreCase("Done")) {
					String msg = "投注結束!\n您總共獲得(元) : " + game.getScore();
					JOptionPane.showMessageDialog(null, msg);
					System.exit(0);
				}
			}
		};
	}

	private ActionListener getActionListener() {
		return actionListener;
	}

	private void setRandomIcon() {
		Icon[] imgs = game.getImgIcon();
		for (JLabel[] lb : lbs) {
			int num = game.getRandom();
			for (JLabel jLabel : lb) {
				jLabel.setIcon(imgs[num++]);
				if (num == 4) {
					num = 0;
				}
			}
		}

	}

}
