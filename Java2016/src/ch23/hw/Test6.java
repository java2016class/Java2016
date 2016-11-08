package ch23.hw;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class Test6 extends JFrame implements ActionListener {

	JRadioButton[] rb;
	ButtonGroup bg;
	JCheckBox[] cb;
	JLabel lb;

	public Test6() {
		// TODO Auto-generated constructor stub
		setLayout(null);
		Border bd1 = BorderFactory.createLineBorder(Color.BLACK);
		JPanel pnl = new JPanel();
		pnl.setBounds(20, 20, 150, 120);
		pnl.setBorder(BorderFactory.createTitledBorder(bd1, "Meals"));
		pnl.setLayout(null);
		rb = new JRadioButton[3];
		rb[0] = new JRadioButton("Meal 1");
		rb[1] = new JRadioButton("Meal 2");
		rb[2] = new JRadioButton("Meal 3");
		int y = 20;
		bg = new ButtonGroup();
		for (JRadioButton jRadioButton : rb) {
			jRadioButton.setBounds(20, y, 90, 20);
			jRadioButton.addActionListener(this);
			bg.add(jRadioButton);
			pnl.add(jRadioButton);
			y += 30;
		}

		JPanel pnl2 = new JPanel();
		pnl2.setBounds(200, 20, 170, 120);
		pnl2.setBorder(BorderFactory.createTitledBorder(bd1, "Orders"));
		pnl2.setLayout(null);
		y = 20;
		cb = new JCheckBox[3];
		cb[0] = new JCheckBox("CokeCola");
		cb[1] = new JCheckBox("BlackTea");
		cb[2] = new JCheckBox("IceCream");
		for (JCheckBox jCheckBox : cb) {
			jCheckBox.setBounds(20, y, 90, 20);
			jCheckBox.addActionListener(this);
			jCheckBox.setEnabled(false);
			pnl2.add(jCheckBox);
			y += 30;
		}

		JButton btn = new JButton("Confirm");
		btn.setBounds(20, 155, 100, 30);
		btn.addActionListener(this);

		JPanel pnl3 = new JPanel();
		pnl3.setBounds(20, 200, 350, 80);
		pnl3.setBorder(BorderFactory.createTitledBorder(bd1, "Your order"));
		pnl3.setLayout(null);
		lb = new JLabel();
		lb.setBounds(10, 10, 340, 60);
		pnl3.add(lb);

		add(btn);
		add(pnl);
		add(pnl2);
		add(pnl3);
		setBounds(400, 400, 400, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Test6();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String radio = "";
		for (JRadioButton jRadio : rb) {
			if (jRadio.isSelected()) {
				radio = jRadio.getText();
				for (JCheckBox jCheckBox : cb) {
					jCheckBox.setEnabled(true);
				}
				break;
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append(" and ");
		for (JCheckBox jCheckBox : cb) {
			if (jCheckBox.isSelected()) {
				sb.append(jCheckBox.getText()).append(" ,");
			}
		}
		if (sb.length() == 5) {
			sb.delete(0, sb.length());
		}
		if (sb.length() > 0) {
			sb.replace(sb.length() - 1, sb.length(), "");
		}

		lb.setText("You selected " + radio + sb.toString());

		// bg.clearSelection();
		// for (JCheckBox jCheckBox : cb) {
		// jCheckBox.setSelected(false);
		// }
	}
}
