package ch23.hw;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Test4 extends JFrame {

	public Test4() {
		// TODO Auto-generated constructor stub
		JPanel pan = new JPanel();
		add(pan);
		pan.setBounds(150, 20, 100, 120);
		Border lineB = BorderFactory.createLineBorder(Color.black);
		pan.setBorder(BorderFactory.createTitledBorder(lineB, "TestBorder"));
		setTitle("Border Test");
		setLayout(null);
		setBounds(50, 50, 280, 200);

		pan.setLayout(new FlowLayout(FlowLayout.LEFT));
		JCheckBox[] chk = new JCheckBox[3];
		chk[0] = new JCheckBox("Computer", true);
		chk[1] = new JCheckBox("HardDriver");
		chk[2] = new JCheckBox("Printer");
		for (int i = 0; i < chk.length; i++) {
			pan.add(chk[i]);
		}

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Test4();
	}
}
