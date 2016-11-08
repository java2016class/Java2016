package ch23.hw;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test1 extends JFrame {
	private JPanel contentpane;

	public Test1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("JFrame Test");
		contentpane = new JPanel();
		setContentPane(contentpane);
		contentpane.setLayout(null); // 不受限於版面管理員

		JButton btn1 = new JButton("Button1");
		btn1.setBounds(10, 10, 100, 25);
		contentpane.add(btn1);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Test1();
	}
}
