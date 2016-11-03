package ch19;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class App19_03 extends Frame {
	static App19_03 frm = new App19_03();
	static Choice chc = new Choice();

	public static void main(String[] args) {
		frm.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 25));
		frm.setTitle("Choice class");
		for (int i = 0; i <= 4; i++) {
			chc.add("Choice item " + i);
		}
		frm.add(chc);
		frm.setSize(200, 150);
		frm.setBackground(Color.yellow);
		frm.setVisible(true);
	}
}
