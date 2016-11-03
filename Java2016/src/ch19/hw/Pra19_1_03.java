package ch19.hw;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pra19_1_03 {
	public static void main(String[] args) {
		FrameCal frm1 = new FrameCal();
		frm1.setVisible(true);
	}
}

class FrameCal extends Frame implements ActionListener {

	Label lbWeight;
	TextField tfWeight;
	Label lbCal;
	TextField tfCal;
	Label lbAct;
	List lsAct;
	Button btnCalc;
	Label lbPink;
	Label lbOrange;

	public FrameCal() {
		// TODO Auto-generated constructor stub
		setTitle("Frame Title");
		setLayout(null);
		setSize(300, 300);
		lbWeight = new Label("體重(kg):");
		 lbWeight.setBounds(50, 70, 70, 20);
		tfWeight = new TextField();
		 tfWeight.setBounds(130, 70, 50, 20);
		lbCal = new Label("攝取的熱量:");
		lbCal.setBounds(50, 110, 70, 20);
		tfCal = new TextField();
		tfCal.setBounds(130, 110, 50, 20);
		lbAct = new Label("活動量");
		lbAct.setBounds(190,70, 50, 20);
		lsAct = new List();
		lsAct.setBounds(190, 100, 60, 35);
		lsAct.add("大");
		lsAct.add("普通");
		lsAct.add("低");
		btnCalc = new Button("計算");
		btnCalc.setBounds(50,120,70,20);
		lbPink = new Label();
		lbPink.setBounds(120, 140, 50, 20);
		lbOrange = new Label();
		lbOrange.setBounds(120, 160, 50, 20); 
		add(lbWeight);
		add(tfWeight);
		add(lbCal);
		add(tfCal);
		add(lbAct);
		add(lsAct);
		add(btnCalc);
		add(lbPink);
		add(lbOrange);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Button btn = (Button) e.getSource();
		if(btn==btnCalc){
			
		}
	}

}

class FrameBMI extends Frame {
	Label lbWeight = new Label("體重");
	Label lbHeight = new Label("身高");

	public FrameBMI() {
		setTitle("BMI");
	}
}
