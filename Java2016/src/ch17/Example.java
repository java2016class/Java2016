package ch17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example {
	public static void main(String[] args) {
		Frame frm = setFrame("One");
		BorderLayout bdl = setBorderLayout(2, 5);
		CardLayout cl = setCardLayout(5, 10);
		Button c1 = new Button("c1");
		Button c2 = new Button("c2");
		Panel pnl = new Panel();
		pnl.setLayout(cl);
		pnl.setSize(400, 200);
		pnl.add(c1, "c1");
		pnl.add(c2, "c2");
		c1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(pnl, "c2");
			}
		});
		c2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(pnl, "c1");
			}
		});
		frm.setLayout(bdl);
		frm.add(pnl, bdl.CENTER);
		frm.add(new Button("WEST"), bdl.WEST);
		frm.add(new Button("NORTH"), bdl.NORTH);
		frm.add(new Button("EAST"), bdl.EAST);
		frm.add(new Button("SOUTH"), bdl.SOUTH);
		frm.setSize(800, 800);
		cl.show(pnl, "c1");
		pnl.setVisible(true);
		frm.setVisible(true);
	}

	public static Frame setFrame(String name) {
		return new Frame(name);
	}

	public static BorderLayout setBorderLayout(int h, int v) {
		return new BorderLayout(h, v);
	}

	public static CardLayout setCardLayout(int h, int v) {
		return new CardLayout(h, v);
	}

}
