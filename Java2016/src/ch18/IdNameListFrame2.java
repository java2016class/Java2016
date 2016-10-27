package ch18;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.List;

/**
 * 身分證檢驗機制
 * 
 * @author Odise
 */
public class IdNameListFrame2 extends Frame {

	// A123456789 is correct; A WZIO =10 B 11 C 12
	static TextField field;
	static Label label;
	static Button btn;

	public static void main(String[] args) {
		IdNameListFrame2 list = new IdNameListFrame2();
		list.setVisible(true);

		// System.out.println("身分證檢查結果: " + isChecked("a123456789"));
	}

	public IdNameListFrame2() {
		setTitle("身分驗證");
		setLayout(null);
		setSize(300, 150);
		field = new TextField();
		field.setLocation(20, 50);
		field.setSize(100, 30);
		field.setText("a123456789");

		btn = new Button("Check");
		btn.setLocation(140, 50);
		btn.setSize(50, 30);
		btn.addActionListener(getListener());
		btn.addMouseListener(getMouseListener());

		label = new Label("id: ");
		label.setLocation(80, 100);
		label.setSize(50, 30);

		add(field);
		add(btn);
		add(label);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	static ActionListener getListener() {
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("id: " + isChecked(field.getText()));
			}
		};
		return listener;
	}

	static MouseListener getMouseListener() {
		MouseListener mouse = new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				btn.setBackground(Color.green);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				btn.setBackground(Color.red);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		};
		return mouse;
	}

	static boolean isChecked(String id) {
		int sum = 0, index;
		char ch;
		List<String> list = Arrays.asList(id.split(""));

		for (String str : list) {
			System.out.println(str);
		}

		for (int i = 0; i < list.size(); i++) {
			// ch = id.toUpperCase().charAt(i);
			ch = list.get(i).toUpperCase().charAt(0);
			index = list.size() - i - 1;
			if (i == 0 && (ch != 'W' || ch != 'Z' || ch != 'I' || ch != 'O')) {
				sum += String.valueOf(ch - 55).charAt(0) - 48 + ((String.valueOf(ch - 55).charAt(1) - 48) * index);
			} else if (i > 0) {
				index = index == 0 ? 1 : index;
				sum += (ch - 48) * index;
			} else {
				switch (ch) {
				case 'W':
					sum += 3 + 2 * index;
					break;
				case 'Z':
					sum += 3 + 3 * index;
					break;
				case 'I':
					sum += 3 + 4 * index;
					break;
				case 'O':
					sum += 3 + 5 * index;
					break;
				}
			}
		}
		return sum % 10 == 0;
	}
}
