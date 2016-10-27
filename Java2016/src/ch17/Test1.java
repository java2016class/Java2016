package ch17;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test1 {
	static Frame frm = new Frame("Hello Java Frame");
	static Label lbl = new Label("Hello Java Label");
	public static void main(String[] args) {
		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);				
			}
		});
		frm.setSize(220,150);
		frm.setVisible(true);
		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); JFrame的功能
	}
}
