package ch18;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class App18_10 extends Frame implements MouseMotionListener {
	static App18_10 frm = new App18_10();
	static Label lbx = new Label();
	static Label lby = new Label();
	static Label lb = new Label();

	public static void main(String[] args) {
		frm.setLayout(null);
		frm.addMouseMotionListener(frm);
		lbx.setBounds(40, 40, 50, 20);
		lby.setBounds(100, 40, 50, 20);
		lb.setBounds(40, 80, 100, 40);
		frm.setSize(200, 150);
		frm.add(lbx);
		frm.add(lby);
		frm.add(lb);
		frm.setVisible(true);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		lbx.setText("X = " + e.getX());
		lby.setText("Y = " + e.getY());
		lb.setText("Mouse dragged!");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		lbx.setText("X = " + e.getX());
		lby.setText("Y = " + e.getY());
		lb.setText("Mouse moved!");
	}
}
