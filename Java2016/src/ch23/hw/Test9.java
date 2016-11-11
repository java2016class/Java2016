package ch23.hw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test9 extends JFrame implements ItemListener, ActionListener {

	JLabel lbname = new JLabel("Please Selected.");
	String[] book = { "Java 5", "Java 6", "Java 7", "Java 8" };
	JComboBox<String> cbo = new JComboBox<>(book);
	JButton btnAdd = new JButton("ADD");
	JButton btnDel = new JButton("DEL");

	public Test9() {
		// TODO Auto-generated constructor stub

		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	}
}
