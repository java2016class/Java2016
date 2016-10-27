package ch18;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class App18_09 extends Frame implements MouseListener {
	static App18_09 frm = new App18_09();
	static Button btn = new Button("Click Me!");
	static TextArea txa = new TextArea("", 2, 5, TextArea.SCROLLBARS_NONE);

	public static void main(String[] args) {
		BorderLayout br = new BorderLayout(2, 5);
		frm.setSize(200, 150);
		frm.setTitle("Mouse Event");
		frm.setLayout(br);
		btn.addMouseListener(frm);
		txa.setEditable(false);
		frm.add(btn, br.WEST);
		frm.add(txa, br.CENTER);
		frm.setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		txa.append("Mouse entered\n");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		txa.append("Mouse exited\n");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		txa.append("Mouse pressed\n");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		txa.append("Mouse released\n");
	}
}
