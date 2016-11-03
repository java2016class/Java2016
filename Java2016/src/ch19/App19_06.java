package ch19;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App19_06 extends Frame implements ActionListener {

	static App19_06 frm = new App19_06();
	static Label lb = new Label("Tastes differ.", Label.CENTER);
	static MenuBar mb = new MenuBar();
	static Menu m1 = new Menu("Style");
	static Menu m2 = new Menu("Exit");
	static MenuItem mi1 = new MenuItem("Plane");
	static MenuItem mi2 = new MenuItem("Bold");
	static MenuItem mi3 = new MenuItem("Italic");
	static MenuItem mi4 = new MenuItem("Close Window");

	public static void main(String[] args) {
		frm.setTitle("Menu Demo");
		mb.add(m1);
		mb.add(m2);
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m2.add(mi4);
		mi1.addActionListener(frm);
		mi2.addActionListener(frm);
		mi3.addActionListener(frm);
		mi4.addActionListener(frm);
		lb.setFont(new Font("Dialog", Font.PLAIN, 24));
		frm.setMenuBar(mb);
		frm.add(lb);
		frm.setSize(280, 150);
		frm.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		MenuItem mi = (MenuItem) arg0.getSource();
		if (mi == mi1) {
			lb.setFont(new Font("Dialog", Font.PLAIN, 24));
		} else if (mi == mi2) {
			lb.setFont(new Font("Dialog", Font.BOLD, 24));
		} else if (mi == mi3) {
			lb.setFont(new Font("Dialog", Font.ITALIC, 24));
		} else {
			frm.dispose();
		}
	}

}
