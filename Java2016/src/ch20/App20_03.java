package ch20;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App20_03 extends Frame implements ActionListener {
	static App20_03 frm = new App20_03();
	static Button btn = new Button();
	static boolean clicked = false;

	public static void main(String[] args) {
		BorderLayout br = new BorderLayout();
		frm.setTitle("Hi");
		frm.setSize(200, 150);
		frm.add(btn, br.SOUTH);
		btn.addActionListener(frm);
		frm.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		clicked = true;
		Graphics g = getGraphics();
//		g.drawRect(100, 50, 70, 55);
		paint(g);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		// super.paint(g);
		if (clicked)
			g.drawRect(100, 50, 70, 55);
		clicked = false;
	}

}
