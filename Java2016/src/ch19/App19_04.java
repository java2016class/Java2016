package ch19;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class App19_04 extends Frame implements ItemListener {
	static App19_04 frm = new App19_04();
	static Choice chc = new Choice();

	public static void main(String[] args) {
		frm.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 25));
		frm.setTitle("Select Color");
		chc.add("Yellow");
		chc.add("Orange");
		chc.add("Pink");
		chc.add("Cyan");
		chc.addItemListener(frm);
		frm.add(chc);
		frm.setSize(200, 150);
		frm.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String color = chc.getSelectedItem();
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
