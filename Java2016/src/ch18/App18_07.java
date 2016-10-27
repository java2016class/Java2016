package ch18;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App18_07 extends Frame implements KeyListener {
	static TextArea txa = new TextArea("", 4, 19, TextArea.SCROLLBARS_NONE);
	static TextField txf = new TextField(18);
	static App18_07 frm = new App18_07();

	public static void main(String[] args) {
		frm.setSize(300, 200);
		frm.setTitle("Key Event");
		frm.setLayout(new FlowLayout(FlowLayout.CENTER));
		txf.addKeyListener(frm);
		txa.setEditable(false);
		frm.add(txf);
		frm.add(txa);
		frm.setVisible(true);
		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		txa.append(e.getKeyChar() + " keyPressed() \n");
		txa.append(e.getKeyCode() + " keyCode\n");
		if (e.getKeyCode() == 27)
			System.exit(0);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		txa.append(e.getKeyChar() + " keyReleased() \n");
		txf.setText(" ");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		txa.append(e.getKeyChar() + " keyTyped() \n");
	}
}
