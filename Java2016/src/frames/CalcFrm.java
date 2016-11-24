package frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class CalcFrm {

	private JFrame frame;
	private JTextField tfShow;
	private ActionListener act;
	private String[] names = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "X", "C", "0", "=", "/" };
	private double sum = 0;
	private int oper = 0;
	private boolean init = true;
	private StringBuilder sb = new StringBuilder();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcFrm window = new CalcFrm();
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
	public CalcFrm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel pnlShow = new JPanel();
		pnlShow.setBounds(5, 0, 422, 30);
		frame.getContentPane().add(pnlShow);
		pnlShow.setLayout(new CardLayout(0, 0));

		tfShow = new JTextField();
		tfShow.setHorizontalAlignment(SwingConstants.RIGHT);
		tfShow.setText("0");
		pnlShow.add(tfShow);
		tfShow.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(5, 33, 422, 3);
		frame.getContentPane().add(separator);

		JPanel pnlCalc = new JPanel();
		pnlCalc.setBounds(5, 38, 422, 200);
		frame.getContentPane().add(pnlCalc);
		pnlCalc.setLayout(new GridLayout(4, 4, 0, 0));
		createBtnActListener();
		for (JButton btn : createBtn()) {
			pnlCalc.add(btn);
		}

	}

	private JButton[] createBtn() {

		JButton[] btns = new JButton[16];
		for (int i = 0; i < 16; i++) {
			btns[i] = new JButton(names[i]);
			btns[i].addActionListener(act);
		}
		return btns;
	}

	private void createBtnActListener() {
		act = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn = (JButton) e.getSource();
				switch (btn.getText()) {
				case "+":
					calc(oper);
					oper = 1;
					break;
				case "-":
					calc(oper);
					oper = 2;
					break;
				case "X":
					calc(oper);
					oper = 3;
					break;
				case "/":
					calc(oper);
					oper = 4;
					break;
				case "=":
					calcTotal(oper);
					oper = 0;
					break;
				case "C":
					tfShow.setText("0");
					sum = 0;
					oper = 0;
					init = true;
					break;
				default:
					sb.append(btn.getText());
					tfShow.setText(sb.toString());
					break;
				}
			}
		};
	}

	private void calc(int oper) {
		if (sb.length() != 0) {
			if (sum != 0 || !init) {
				switch (oper) {
				case 1:
					sum += Double.parseDouble(sb.toString());
					break;
				case 2:
					sum -= Double.parseDouble(sb.toString());
					break;
				case 3:
					sum *= Double.parseDouble(sb.toString());
					break;
				case 4:
					sum /= Double.parseDouble(sb.toString());
					break;
				}
			} else {
				sum = Double.parseDouble(sb.toString());
				init = !init;
			}
		}
		String[] strs = (sum + "").split("\\.");
		if (strs[1].equals("0"))
			tfShow.setText(strs[0]);
		else
			tfShow.setText(sum + "");
		sb.delete(0, sb.length());
	}

	private void calcTotal(int oper) {
		switch (oper) {
		case 1:
			sum += Double.parseDouble(sb.toString());
			break;
		case 2:
			sum -= Double.parseDouble(sb.toString());
			break;
		case 3:
			sum *= Double.parseDouble(sb.toString());
			break;
		case 4:
			sum /= Double.parseDouble(sb.toString());
			break;
		}
		String[] strs = (sum + "").split("\\.");
		if (strs[1].equals("0"))
			tfShow.setText(strs[0]);
		else
			tfShow.setText(sum + "");
		sb.delete(0, sb.length());
	}

}
