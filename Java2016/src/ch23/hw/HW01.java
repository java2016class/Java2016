package ch23.hw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class HW01 extends JFrame {

	JLabel lbCash, lbEx;
	JTextField tfCash, tfEx, tfShow;
	JRadioButton rbUS, rbTW;
	JButton btn;
	float exchange = 31.5875924f;
	float calc = 0.0f;

	public HW01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setBounds(50, 50, 250, 250);
		lbCash = new JLabel("Input Cash");
		lbEx = new JLabel("Input Exchange");

		tfCash = new JTextField();
		tfEx = new JTextField("" + exchange);
		tfShow = new JTextField();

		rbUS = new JRadioButton("USD");
		rbTW = new JRadioButton("NTD");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbUS);
		bg.add(rbTW);
		rbUS.setSelected(true);

		btn = new JButton("Calc");

		lbCash.setBounds(10, 10, 90, 20);
		lbEx.setBounds(10, 40, 90, 20);
		tfCash.setBounds(130, 10, 90, 20);
		tfEx.setBounds(130, 40, 90, 20);
		rbUS.setBounds(10, 70, 90, 20);
		rbTW.setBounds(130, 70, 90, 20);
		tfShow.setBounds(10, 100, 210, 40);
		btn.setBounds(10, 150, 210, 40);

		add(lbCash);
		add(lbEx);
		add(tfCash);
		add(tfEx);
		add(rbUS);
		add(rbTW);
		add(tfShow);
		add(btn);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (tfCash.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "No cash input");
				} else if (tfEx.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "No exchange input");
				} else {
					float cash = 0.0f;
					try {
						cash = Float.parseFloat(tfCash.getText());
					} catch (NumberFormatException e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "cash error");
					}

					try {
						exchange = Float.parseFloat(tfEx.getText());
					} catch (NumberFormatException e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "exchange error");
					}

					if (rbUS.isSelected()) {
						tfShow.setText("Your cash NTD " + cash + " ; to USD " + (cash / exchange));
					} else {
						tfShow.setText("Your cash USD " + cash + " ; to NTD " + (cash * exchange));
					}
				}
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new HW01();
	}
}
