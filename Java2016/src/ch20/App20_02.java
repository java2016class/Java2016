package ch20;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App20_02 extends Frame implements ActionListener {
	static App20_02 frm = new App20_02();
	static Button btn = new Button();

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
		Graphics g = getGraphics();
		g.drawRect(100, 50, 70, 55);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
//		super.paint(g);
		g.drawRect(100, 50, 70, 55);
	}
	
	

}
