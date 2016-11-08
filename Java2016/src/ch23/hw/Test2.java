package ch23.hw;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test2 extends JFrame {

	// Test2 frm = new Test2();
	static int count = 1;

	public Test2() {
		// TODO Auto-generated constructor stub
		add(createBtn(10, 10));
		add(createBtn(74, 76));
		add(createBtn(228, 29));
		add(createBtn(228, 94));
		add(createBtn(151, 144));
		setLayout(null);
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Test2();
	}

	public JButton createBtn(int x, int y) {
		JButton btn = new JButton("Btn " + count++);
		btn.setBounds(x, y, 100, 25);
		return btn;
	}
}
