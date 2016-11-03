package ch20;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App20_04 extends Frame implements ActionListener {
	static App20_04 frm = new App20_04();
	static Button btn = new Button();
	static boolean clicked = false;

	public static void main(String[] args) {
		BorderLayout br = new BorderLayout();
		frm.setTitle("Hi");
		frm.setSize(200, 400);
		frm.add(btn, br.SOUTH);
		btn.addActionListener(frm);
		frm.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		clicked = true;
		Graphics g = getGraphics();
		print(g);
		// g.drawRect(100, 50, 70, 55);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		// super.paint(g);
		if (clicked) {
			g.drawRect(100, 50, 70, 55);
			g.setColor(Color.red);
			g.setFont(new Font("Arial", Font.ITALIC, 18));
			g.drawString("Try it", 70, 105);

		}
		clicked = false;
	}

}
