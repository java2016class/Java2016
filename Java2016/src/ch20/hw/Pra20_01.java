package ch20.hw;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class Pra20_01 extends Frame implements ActionListener {

	static Pra20_01 frm = new Pra20_01();
	static Button btnRed = new Button("Red");
	static Button btnGreen = new Button("Green");
	static boolean clicked = false;
	
	public static void main(String[] args) {
		frm.add(btnRed);
		frm.add(btnGreen);
		btnRed.setBounds(20, 30, 100, 50);
		btnGreen.setBounds(20, 150, 100, 50);
		btnRed.addActionListener(frm);
		btnGreen.addActionListener(frm);
		frm.setLayout(null);
		frm.setSize(300, 400);
		frm.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Button btn = (Button) e.getSource();
		clicked = true;
		if (btn == btnRed) {
			Graphics g = getGraphics();
			g.setColor(Color.red);
			paint(g);
		} else if (btn == btnGreen) {
			Graphics g = getGraphics();
			g.setColor(Color.green);
			paint(g);
		}
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		// super.paint(g);
		if (clicked) {
			g.drawRect(20, 82, 65, 65);
		}
		
	}

}
