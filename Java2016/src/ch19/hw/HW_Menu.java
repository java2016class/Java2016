package ch19.hw;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class HW_Menu {
	static Frame frm = new Frame();
	static MenuBar mb = new MenuBar();
	static Menu m1 = new Menu("�򥻸�ƺ޲z");
	static Menu m2 = new Menu("�P�f�޲z");
	static Menu m3 = new Menu("�i�f�޲z");
	static MenuItem mi1 = new MenuItem("�Ȥ�");
	static MenuItem mi2 = new MenuItem("�t��");
	static MenuItem mi3 = new MenuItem("�f�~");
	static MenuItem mi4 = new MenuItem("����");
	static MenuItem mi5 = new MenuItem("���x");
	static MenuItem mi6 = new MenuItem("�w�s");
	static Label lb = new Label("�w�s");

	public static void main(String[] args) {
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);

		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m2.add(mi4);
		m3.add(mi5);
		m3.add(mi6);
		frm.add(lb);
		frm.setMenuBar(mb);
		frm.setSize(350, 150);
		frm.setVisible(true);
	}
}
