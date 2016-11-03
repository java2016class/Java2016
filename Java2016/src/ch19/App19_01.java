package ch19;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

public class App19_01 extends Frame {
	static App19_01 frm = new App19_01();
	static List list = new List();

	public static void main(String[] args) {
		frm.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 25));
		frm.setTitle("List class");
		for (int i = 0; i <= 9; i++) {
			list.add("List item: " + (i+1));
		}
		list.select(2);
		frm.setSize(200,150);
		frm.add(list);
		frm.setBackground(Color.yellow);
		frm.setVisible(true);
	}
}
