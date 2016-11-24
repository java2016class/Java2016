package frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame {

	private JFrame frame;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private ActionListener act;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
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
	public Frame() {
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

		JLabel lblNewLabel = new JLabel("數值1:");
		lblNewLabel.setBounds(14, 13, 57, 19);
		frame.getContentPane().add(lblNewLabel);

		tfNum1 = new JTextField();
		tfNum1.setBounds(85, 10, 116, 25);
		frame.getContentPane().add(tfNum1);
		tfNum1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("數值2:");
		lblNewLabel_1.setBounds(215, 13, 57, 19);
		frame.getContentPane().add(lblNewLabel_1);

		tfNum2 = new JTextField();
		tfNum2.setBounds(286, 10, 116, 25);
		frame.getContentPane().add(tfNum2);
		tfNum2.setColumns(10);

		JButton btnPlus = new JButton("加");
		// btnPlus.addActionListener(act);
		btnPlus.setBounds(14, 48, 85, 27);
		frame.getContentPane().add(btnPlus);

		JButton btnMin = new JButton("減");
		// btnMin.addActionListener(act);
		btnMin.setBounds(113, 48, 85, 27);
		frame.getContentPane().add(btnMin);

		JButton btnMul = new JButton("乘");
		// btnMul.addActionListener(act);
		btnMul.setBounds(215, 48, 85, 27);
		frame.getContentPane().add(btnMul);

		JButton btnDiv = new JButton("除");
		// btnDiv.addActionListener(act);
		btnDiv.setBounds(314, 48, 85, 27);
		frame.getContentPane().add(btnDiv);

		JLabel label = new JLabel("結果:");
		label.setBounds(14, 104, 57, 19);
		frame.getContentPane().add(label);

		JLabel lblShow = new JLabel("");
		lblShow.setBounds(85, 104, 57, 19);
		frame.getContentPane().add(lblShow);

		act = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn = (JButton) e.getSource();
				int num1 = Integer.parseInt(tfNum1.getText());
				int num2 = Integer.parseInt(tfNum2.getText());
				if (btn.equals(btnPlus)) {
					lblShow.setText(num1 + num2 + "");
				} else if (btn.equals(btnMin)) {
					lblShow.setText(num1 - num2 + "");
				} else if (btn.equals(btnMul)) {
					lblShow.setText(num1 * num2 + "");
				} else if (btn.equals(btnDiv)) {
					lblShow.setText(num1 / num2 + "");
				}
			}
		};

		btnPlus.addActionListener(act);
		btnMin.addActionListener(act);
		btnMul.addActionListener(act);
		btnDiv.addActionListener(act);
	}

}
