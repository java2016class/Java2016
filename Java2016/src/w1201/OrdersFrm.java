package w1201;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.CardLayout;

public class OrdersFrm {

	private JFrame frame;
	private JTextField tfHotLatteNum;
	private JTextField tfColdLatteNum;
	private JTextField tfCoffeeNum;
	private JTextField tfCabucenoNum;
	private JTextField tfBlackForrestCakeNum;
	private JTextField tfBruneCakeNum;

	private int totCoffee, totCake;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrdersFrm window = new OrdersFrm();
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
	public OrdersFrm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(14, 13, 250, 300);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JCheckBox cbHotLatte = new JCheckBox("熱拿鐵 100");
		cbHotLatte.setBounds(10, 9, 115, 27);
		panel.add(cbHotLatte);

		tfHotLatteNum = new JTextField();
		tfHotLatteNum.setBounds(134, 10, 30, 25);
		panel.add(tfHotLatteNum);
		tfHotLatteNum.setColumns(10);

		JCheckBox cbColdLatte = new JCheckBox("冰拿鐵 100");
		cbColdLatte.setBounds(10, 41, 115, 27);
		panel.add(cbColdLatte);

		tfColdLatteNum = new JTextField();
		tfColdLatteNum.setColumns(10);
		tfColdLatteNum.setBounds(134, 42, 30, 25);
		panel.add(tfColdLatteNum);

		JCheckBox cbCoffee = new JCheckBox("美式 80");
		cbCoffee.setBounds(10, 73, 115, 27);
		panel.add(cbCoffee);

		tfCoffeeNum = new JTextField();
		tfCoffeeNum.setColumns(10);
		tfCoffeeNum.setBounds(134, 74, 30, 25);
		panel.add(tfCoffeeNum);

		JCheckBox cbCabuceno = new JCheckBox("卡布奇諾 150");
		cbCabuceno.setBounds(10, 105, 115, 27);
		panel.add(cbCabuceno);

		tfCabucenoNum = new JTextField();
		tfCabucenoNum.setColumns(10);
		tfCabucenoNum.setBounds(134, 106, 30, 25);
		panel.add(tfCabucenoNum);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(278, 13, 250, 300);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		tfBlackForrestCakeNum = new JTextField();
		tfBlackForrestCakeNum.setColumns(10);
		tfBlackForrestCakeNum.setBounds(155, 43, 30, 25);
		panel_1.add(tfBlackForrestCakeNum);

		JCheckBox cbBlackForrestCake = new JCheckBox("黑森林蛋糕 100");
		cbBlackForrestCake.setBounds(10, 41, 145, 27);
		panel_1.add(cbBlackForrestCake);

		JCheckBox cbBruneCake = new JCheckBox("布朗尼蛋糕 80");
		cbBruneCake.setBounds(10, 9, 145, 27);
		panel_1.add(cbBruneCake);

		tfBruneCakeNum = new JTextField();
		tfBruneCakeNum.setColumns(10);
		tfBruneCakeNum.setBounds(155, 11, 30, 25);
		panel_1.add(tfBruneCakeNum);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(139, 326, 529, 57);
		frame.getContentPane().add(panel_2);
				panel_2.setLayout(new CardLayout(0, 0));
		
				JLabel lblShow = new JLabel("");
				panel_2.add(lblShow, "name_323143368226370");

		JTextArea taShow = new JTextArea();
		taShow.setBounds(542, 13, 126, 300);
		frame.getContentPane().add(taShow);

		ButtonGroup bg = new ButtonGroup();
		JCheckBox cbIn = new JCheckBox("內用", true);
		cbIn.setBounds(14, 324, 115, 27);
		bg.add(cbIn);
		frame.getContentPane().add(cbIn);

		JCheckBox cbOut = new JCheckBox("外帶", false);
		cbOut.setBounds(14, 356, 115, 27);
		bg.add(cbOut);
		frame.getContentPane().add(cbOut);

		JButton btnTotal = new JButton("總金額");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				taShow.setText("");
				lblShow.setText("");
				totCoffee = 0;
				totCake = 0;
				if (cbIn.isSelected()) {
					taShow.append(cbIn.getText() + "\n");
					taShow.append("-----------------------\n");
				} else {
					taShow.append(cbOut.getText() + "\n");
					taShow.append("-----------------------\n");
				}
				if (cbHotLatte.isSelected()) {
					totCoffee += 100 * Integer.parseInt(tfHotLatteNum.getText());
					taShow.append(cbHotLatte.getText().split(" ")[0] + " " + tfHotLatteNum.getText() + " 杯\n");
				}
				if (cbColdLatte.isSelected()) {
					totCoffee += 100 * Integer.parseInt(tfColdLatteNum.getText());
					taShow.append(cbColdLatte.getText().split(" ")[0] + " " + tfColdLatteNum.getText() + " 杯\n");
				}
				if (cbCoffee.isSelected()) {
					totCoffee += 80 * Integer.parseInt(tfCoffeeNum.getText());
					taShow.append(cbCoffee.getText().split(" ")[0] + " " + tfCoffeeNum.getText() + " 杯\n");
				}
				if (cbCabuceno.isSelected()) {
					totCoffee += 150 * Integer.parseInt(tfCabucenoNum.getText());
					taShow.append(cbCabuceno.getText().split(" ")[0] + " " + tfCabucenoNum.getText() + " 杯\n");
				}
				if (cbBruneCake.isSelected()) {
					totCake += 80 * Integer.parseInt(tfBruneCakeNum.getText());
					taShow.append(cbBruneCake.getText().split(" ")[0] + " " + tfBruneCakeNum.getText() + " 塊\n");
				}
				if (cbBlackForrestCake.isSelected()) {
					totCake += 100 * Integer.parseInt(tfBlackForrestCakeNum.getText());
					taShow.append(cbBlackForrestCake.getText().split(" ")[0] + " " + tfBlackForrestCakeNum.getText()
							+ " 塊\n");
				}
				if (taShow.getText().length() > 0) {
					taShow.append("Thank you!\n");
					lblShow.setText(
							"咖啡總金額 : " + totCoffee + " ,蛋糕總金額 : " + totCake + " ,總金額 : " + (totCake + totCoffee));
				}

			}
		});
		btnTotal.setBounds(14, 393, 99, 27);
		frame.getContentPane().add(btnTotal);

		JButton btnShow = new JButton("結帳");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showConfirmDialog(null, taShow.getText() + "\n\n" + lblShow.getText());
			}
		});
		btnShow.setBounds(149, 393, 99, 27);
		frame.getContentPane().add(btnShow);

		JButton btnReset = new JButton("重置");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbIn.setSelected(true);
				cbOut.setSelected(false);
				cbHotLatte.setSelected(false);
				cbColdLatte.setSelected(false);
				cbCoffee.setSelected(false);
				cbCabuceno.setSelected(false);
				cbBruneCake.setSelected(false);
				cbBlackForrestCake.setSelected(false);
				taShow.setText("");
				lblShow.setText("");
				tfBlackForrestCakeNum.setText("");
				tfBruneCakeNum.setText("");
				tfCabucenoNum.setText("");
				tfCoffeeNum.setText("");
				tfColdLatteNum.setText("");
				tfHotLatteNum.setText("");
			}
		});
		btnReset.setBounds(307, 393, 99, 27);
		frame.getContentPane().add(btnReset);

		JButton btnNull = new JButton("New button");
		btnNull.setBounds(440, 393, 99, 27);
		frame.getContentPane().add(btnNull);

		JButton btnClose = new JButton("結束");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(569, 393, 99, 27);
		frame.getContentPane().add(btnClose);
	}
}
