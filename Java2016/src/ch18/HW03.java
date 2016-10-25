package ch18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class HW03 extends Frame {
	static Button btnResult;
	static ClickNum clickNum;

	public HW03() {
		setTitle("GridLayout");
		setSize(600, 800);
		clickNum = new ClickNum();
		GridLayout layout = getGridLayout(5, 3);
		setLayout(layout);
		for (int i = 0; i < 15; i++) {
			if (i >= 3 && i < 12) {
				if (i < 6) {
					add(getButton((i + 4) + ""));
				}
				if (i >= 6 && i < 9) {
					add(getButton((i - 2) + ""));
				}
				if (i >= 9 && i < 12) {
					add(getButton((i - 8) + ""));
				}
			} else if (i == 13) {
				add(getButton("0"));
			} else {
				if (i == 1) {
					btnResult = getButton("");
					add(btnResult);
				} else {
					add(getButton(""));
				}
			}

		}
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new HW03().setVisible(true);
	}

	public Button getButton(String num) {
		Button btn = new Button(num);
		btn.addActionListener(clickNum);
		return btn;
	}

	public GridLayout getGridLayout(int rows, int cols) {
		return new GridLayout(rows, cols);
	}
}

class ClickNum implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Button btn = (Button) e.getSource();
		try {
			if (Integer.parseInt(btn.getLabel()) > 0 || btn.getLabel().equals("0")) {
				HW03.btnResult.setLabel(btn.getLabel());
			}
		} catch (NumberFormatException e1) {
			System.out.println(e1.getMessage());
		}
	}

}
