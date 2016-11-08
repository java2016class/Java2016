package ch23;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class App23_3 {

	static JFrame frm = new JFrame();
	static Container cp = frm.getContentPane();
	static ImageIcon general = new ImageIcon("src/ch23/img/123.png"); //package底下存取檔案
	static ImageIcon general2 = new ImageIcon("src/ch23/img/1234.png");
	static JButton btn = new JButton("JButton");

	public static void main(String[] args) {
		cp.setLayout(new FlowLayout());
		cp.add(btn);

		btn.setRolloverEnabled(true);
		btn.setIcon(general);
		btn.setRolloverIcon(general2);

		frm.setSize(300, 200);
		frm.setVisible(true);
	}
}
