package ch19;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class App19_07 extends Frame implements AdjustmentListener {
	static App19_07 frm = new App19_07();
	static Scrollbar scr = new Scrollbar();
	static Label lb1 = new Label("Slience is Golden", Label.CENTER);
	static Label lb2 = new Label("size = 20", Label.CENTER);

	public static void main(String[] args) {
		BorderLayout bl = new BorderLayout(5, 5);
		frm.setTitle("Scrollbar Demo");
		frm.setSize(300, 150);
		scr.addAdjustmentListener(frm);
		scr.setValues(20, 4, 12, 40);
		frm.add(scr, bl.EAST);
		frm.add(lb1, bl.CENTER);
		frm.add(lb2, bl.SOUTH);
		lb1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lb2.setBackground(Color.orange);
		frm.setVisible(true);
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// TODO Auto-generated method stub
		int size = scr.getValue();
		lb1.setFont(new Font("Dialog", Font.PLAIN, size));
		lb2.setText("size = " + size);
	}
}
