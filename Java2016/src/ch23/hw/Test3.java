package ch23.hw;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test3 {

	static JFrame frm = new JFrame("Grid");
	static GridLayout gl = new GridLayout(2, 3);
	static JButton[] btns = new JButton[6];

	public static void main(String[] args) {
		frm.setLayout(gl);
		btns[0] = getBtn("Red");
		btns[1] = getBtn("Blue");
		btns[2] = getBtn("Green");
		btns[3] = getBtn("Yellow");
		btns[4] = getBtn("Black");
		btns[5] = getBtn("White");

		for (JButton btn : btns) {
			btn.addActionListener(setListener());
			frm.add(btn);
		}

		frm.setSize(400, 300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);

	}

	private static JButton getBtn(String text) {
		return new JButton(text);
	}

	public static ActionListener setListener() {
		ActionListener act = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton clicked = (JButton) e.getSource();
				System.out.println(clicked.getText());

				switch (clicked.getText()) {
				case "Red":
					btns[5].setBackground(Color.RED);
					break;
				case "Blue":
					btns[5].setBackground(Color.BLUE);
					break;
				case "Green":
					btns[5].setBackground(Color.GREEN);
					break;
				case "Yellow":
					btns[5].setBackground(Color.YELLOW);
					break;
				case "Black":
					btns[5].setBackground(Color.BLACK);
					break;
				case "White":
					btns[5].setBackground(Color.WHITE);
					break;
				}
			}
		};
		return act;
	}
}
