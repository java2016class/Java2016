package ch23.hw;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Test8 extends JFrame {
	JPanel contentPane;
	JButton btn1, btn2, btn3;

	public Test8() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));
		// contentPane.setBounds(10, 10, 300, 200);
		btn1 = new JButton("I am groop");
		btn1.setBounds(10, 10, 80, 30);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Error Message");
				
				int i =0;
				i = JOptionPane.ERROR_MESSAGE;
				i = JOptionPane.INFORMATION_MESSAGE;
				i = JOptionPane.WARNING_MESSAGE;
				i = JOptionPane.QUESTION_MESSAGE;
				i = JOptionPane.PLAIN_MESSAGE; //無圖示
			}
		});

		contentPane.add(btn1);
		add(contentPane);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Test8();
	}
}
