package ch19.hw;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class HW_Menu {
	static Frame frm = new Frame();
	static MenuBar mb = new MenuBar();
	static Menu m1 = new Menu("基本資料管理");
	static Menu m2 = new Menu("銷貨管理");
	static Menu m3 = new Menu("進貨管理");
	static MenuItem mi1 = new MenuItem("客戶");
	static MenuItem mi2 = new MenuItem("廠商");
	static MenuItem mi3 = new MenuItem("貨品");
	static MenuItem mi4 = new MenuItem("部門");
	static MenuItem mi5 = new MenuItem("倉儲");
	static MenuItem mi6 = new MenuItem("庫存");
	static Label lb = new Label("庫存");

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
