package ch19;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class App19_05 {
	static Frame frm = new Frame();
	static MenuBar mb = new MenuBar();
	static Menu m1 = new Menu("Color");
	static Menu m2 = new Menu("Exit");
	static MenuItem mi1 = new MenuItem("Yellow");
	static MenuItem mi2 = new MenuItem("Orange");
	static MenuItem mi3 = new MenuItem("Pink");
	static MenuItem mi4 = new MenuItem("Close Window");
	public static void main(String[] args) {
		mb.add(m1);
		mb.add(m2);

		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m2.add(mi4);
		frm.setMenuBar(mb);
		frm.setSize(200, 150);
		frm.setVisible(true);
	}
}
