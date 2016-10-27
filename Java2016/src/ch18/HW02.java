package ch18;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HW02 extends Frame {
	public static int i = 0;
	public static Label label;
	public static BtnEvent event;
	public static Frame frm;

	public HW02() {
		setLayout(null);
		setTitle("Hello : " + i);
		setSize(500, 500);
		// setBounds(200, 200, 400, 500);
		label = getLabel();
		add(label);
		event = new BtnEvent();
		add(getBtn("Yellow", 1));
		add(getBtn("Green", 2));
		add(getBtn("Exit", 3));
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public static void main(String[] args) {
		frm = new HW02();
		frm.setVisible(true);
	}

	public Label getLabel() {
		Label lb = new Label("label");
		lb.setSize(80, 20);
		lb.setLocation(20, 250);
		lb.setBackground(Color.lightGray);
		return lb;
	}

	public Button getBtn(String name, int count) {
		Button btn = new Button(name);
		btn.addActionListener(event);
		btn.setSize(100, 100);
		btn.setLocation(100, 100 * count);
		return btn;
	}
}

class BtnEvent implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Button btn = (Button) e.getSource();
		System.out.println(btn.getName());
		switch (btn.getLabel()) {
		case "Yellow":
			HW02.label.setBackground(Color.yellow);
			HW02.frm.setTitle("Hello : " + ++HW02.i);
			break;
		case "Green":
			HW02.label.setBackground(Color.green);
			HW02.frm.setTitle("Hello : " + ++HW02.i);
			break;
		case "Exit":
			System.exit(0);
		}
	}

}
