package ch17;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HW01 extends Frame {
	static int i = 1;
	static Button btn;

	public HW01() {
		setTitle("count : " + i);
		btn = new Button("counter");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setTitle("count : " + ++i);
			}
		});
		add(btn);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);				
			}
		});
		setSize(500, 200);
	}

	public static void main(String[] args) {
		new HW01().setVisible(true);
	}
}
