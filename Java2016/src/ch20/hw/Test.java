package ch20.hw;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends Frame implements ActionListener {

	static Test frm = new Test();
	static Button btnRed = new Button("紅色");
	static Button btnGreen = new Button("綠色");
	static Label lb = new Label("黃色");
	static boolean clicked = false;

	public static void main(String[] args) {
		BorderLayout br = new BorderLayout();
		frm.setLayout(br);
		// lb.setBackground(new Color(255, 255, 255, 1));
		// lb.setForeground(new Color(255, 255, 255, 1));
		frm.add(btnRed, br.NORTH);
		frm.add(btnGreen, br.SOUTH);
		frm.add(lb, br.EAST);
		btnRed.addActionListener(frm);
		btnGreen.addActionListener(frm);
		frm.setSize(300, 400);
		frm.setVisible(true);

		String s1 = "Jim";
		String s2 = new String("Jim");
		String s3 = s2;
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s3.equals(s1));
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
			g.setFont(new Font("Agency FB", Font.PLAIN, 18));
			g.drawString("Test1", 50, 50);
			g.setFont(new Font("Algerian", Font.PLAIN, 18));
			g.drawString("Test2", 50, 75);
			g.setFont(new Font("細明體_HKSCS-ExtB", Font.PLAIN, 18));
			g.drawString("亂碼", 100, 100);
			g.drawRect(20, 82, 65, 65);
		}

	}

}
