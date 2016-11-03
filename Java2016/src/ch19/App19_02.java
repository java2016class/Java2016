package ch19;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class App19_02 extends Frame implements ItemListener {
	static App19_02 frm = new App19_02();
	static List list = new List();

	public static void main(String[] args) {
		frm.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 25));
		frm.setTitle("Select Color");
		list.add("Yellow");
		list.add("Orange");
		list.add("Pink");
		list.add("Cyan");
		list.addItemListener(frm);
		frm.add(list);
		frm.setSize(200, 150);
		frm.setVisible(true);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String color = list.getSelectedItem();
		if (color == "Yellow") {
			frm.setBackground(Color.yellow);
		} else if (color == "Orange") {
			frm.setBackground(Color.orange);
		} else if (color == "Pink") {
			frm.setBackground(Color.pink);
		} else if (color == "Cyan") {
			frm.setBackground(Color.cyan);
		}
		frm.setTitle("you selected " + color);
	}
}
