package ch20;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class App20_08 extends Frame {
	static App20_08 frm = new App20_08();

	public static void main(String[] args) {
		frm.setTitle("Arc & Oval");
		frm.setSize(200, 150);
		frm.setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		// super.paint(g);
		g.setColor(Color.pink);
		g.fillArc(20, 50, 70, 70, 30, 300);
		g.setColor(Color.red);
		for (int x = 70; x < 170; x += 20) {
			g.fillOval(x, 80, 10, 10);
		}
	}
}
