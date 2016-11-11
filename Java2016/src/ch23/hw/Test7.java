package ch23.hw;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Test7 extends JFrame implements ListSelectionListener {
	String[] str = { "Bible", "History", "Buyer", "Set", "Holly", "English" };
	JList<String> lst = new JList<>(str);
	JTextArea area = new JTextArea("Selected :", 3, 14);
	JLabel lb = new JLabel("請選擇: ");
	String txtshow = "";

	public Test7() {
		// TODO Auto-generated constructor stub
		JPanel panbook = new JPanel();
		add(panbook);
		panbook.setBounds(10, 10, 90, 120);
		panbook.setLayout(new FlowLayout(FlowLayout.LEFT));
		panbook.add(lb);
		JScrollPane scrList = new JScrollPane(lst);
		lst.setVisibleRowCount(6);
		lst.addListSelectionListener(this);
		panbook.add(scrList);

		JPanel panshow = new JPanel();
		add(panshow);
		panshow.setBounds(10, 130, 200, 100);
		panshow.setLayout(new FlowLayout(FlowLayout.LEFT));
		JScrollPane scrshow = new JScrollPane(area, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panshow.add(scrshow);

		setTitle("BookManagement");
		setBounds(100, 100, 250, 300);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Test7();
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		ArrayList<String> values = new ArrayList<>(lst.getSelectedValuesList());

		int[] index = lst.getSelectedIndices();
		// String show = "";
		// int i = 0;
		// for (String s : values) {
		// show += s + ",index = " + index[i] + "\n";
		// i++;
		// }
		String show = values.get(0) + index[0];

		area.setText(show);
	}
}
