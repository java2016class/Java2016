package ch18;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App18_08 extends Frame {
	// KeyAdapter 可以指定想實作的KeyEvent

	public static App18_08 frm = new App18_08();
	public static TextField txf = new TextField(18);
	public static TextArea txa = new TextArea("", 4, 19, TextArea.SCROLLBARS_NONE);

	public static void main(String[] args) {
		frm.setSize(200, 200);
		frm.setTitle("Key Event");
		frm.setLayout(new FlowLayout(FlowLayout.CENTER));
		txf.addKeyListener(new KeyLis());
		txa.setEditable(false);
		frm.add(txf);
		frm.add(txa);
		frm.setVisible(true);
	}

	static class KeyLis extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			// super.keyPressed(e);
			txa.setText(" ");
			if (e.isActionKey()) {
				txa.append("is action key\n");
			} else {
				txa.append(e.getKeyChar() + " is pressed\n");
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyReleased(e);
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyTyped(e);
		}

	}

}

// class KeyLis extends KeyAdapter {
// public void keyPressed(KeyEvent e) {
// System.out.println(e.getKeyCode());
// App18_8.txa.setText("");
// if (e.isActionKey())
// App18_8.txa.append("Action key is pressed\n");
// else
// App18_8.txa.append(e.getKeyChar() + " is pressed\n");
// }
// }
