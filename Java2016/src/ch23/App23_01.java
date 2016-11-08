package ch23;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class App23_01 extends JFrame implements ActionListener {

	static App23_01 frm = new App23_01();
	static Button btn = new Button("Click Me");
	static Container cp = frm.getContentPane();

	public static void main(String[] args) {

		cp.add(btn);
		cp.setLayout(new FlowLayout());
		cp.setBackground(Color.pink);
		btn.addActionListener(frm);
		frm.setTitle("JFrame視窗");
		frm.setSize(200, 150);
		frm.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (cp.getBackground() == Color.pink) {
			cp.setBackground(Color.yellow);
		} else {
			cp.setBackground(Color.pink);
		}
	}
}
