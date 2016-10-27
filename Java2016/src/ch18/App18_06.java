package ch18;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class App18_06 extends Frame implements TextListener {

	static App18_06 frm = new App18_06();
	static TextArea txa1;
	static TextArea txa2;

	public static void main(String[] args) {

		txa1 = new TextArea("", 6, 10, TextArea.SCROLLBARS_NONE);
		txa2 = new TextArea("", 6, 10, TextArea.SCROLLBARS_NONE);

		frm.setSize(300, 200);
		frm.setTitle("Text Event");
		frm.setLayout(new FlowLayout(FlowLayout.CENTER));
		txa1.addTextListener(frm);
		txa2.setEditable(false);
		frm.add(txa1);
		frm.add(txa2);
		frm.setVisible(true);
	}

	@Override
	public void textValueChanged(TextEvent arg0) {
		// TODO Auto-generated method stub
		txa2.setText(txa1.getText());
	}
}
