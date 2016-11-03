package ch19;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class App19_08 extends Frame implements ActionListener, ItemListener {

	static App19_08 frm = new App19_08();
	static Dialog dia = new Dialog(frm);
	static Button btn_Change = new Button("Change Color");
	static Button btn_OK = new Button("Ok");
	static Button btn_Cancel = new Button("Cancel");
	static Checkbox ckb1 = new Checkbox("White");
	static Checkbox ckb2 = new Checkbox("Yellow");
	static Color clr;

	public static void main(String[] args) {
		frm.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 30));
		CheckboxGroup grp = new CheckboxGroup();
		ckb1.setCheckboxGroup(grp);
		ckb2.setCheckboxGroup(grp);
		frm.setSize(200, 150);
		frm.setTitle("Frame");
		frm.setBackground(Color.pink);
		dia.setTitle("Dialog");
		dia.setSize(150, 120);
		dia.setLayout(null);
		ckb1.setBounds(20, 50, 60, 20);
		ckb2.setBounds(20, 70, 60, 20);
		btn_OK.setBounds(85, 45, 50, 20);
		btn_Cancel.setBounds(85, 70, 50, 20);
		dia.add(btn_OK);
		dia.add(btn_Cancel);
		dia.add(ckb1);
		dia.add(ckb2);
		btn_Change.addActionListener(frm);
		btn_Cancel.addActionListener(frm);
		btn_OK.addActionListener(frm);
		ckb1.addItemListener(frm);
		ckb2.addItemListener(frm);
		frm.add(btn_Change);
		frm.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (ckb1.getState()) {
			clr = Color.WHITE;
		} else if (ckb2.getState()) {
			clr = Color.YELLOW;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Button btn = (Button) e.getSource();
		if (btn == btn_Change) {
			dia.setLocation(120, 80);
			dia.setVisible(true);
		} else if (btn == btn_OK) {
			frm.setBackground(clr);
			dia.setVisible(false);
		} else if (btn == btn_Cancel) {
			dia.setVisible(false);
		}
	}

}
