package ch20;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

public class App20_08_Special extends Frame {
	static App20_08_Special frm = new App20_08_Special();
	static int i = 0;
	static int x = 20;
	static int z = 0;
	static int[] circles = new int[5];
	static boolean[] exists = { true, true, true, true, true };
	static int count = 0;
	static Timer timer;

	public static void main(String[] args) {
		frm.setTitle("Arc & Oval");
		frm.setSize(250, 200);
		frm.setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		// super.paint(g);
		if (i == 0) {
			g.setColor(Color.pink);
			g.fillArc(20, 50, 70, 70, 30, 300);
			g.setColor(Color.red);
			for (int x = 70; x < 170; x += 20) {
				g.fillOval(x, 80, 10, 10);
				circles[(x - 69) / 20] = x;
			}
			i++;
			setTimer();
		} else {
			if (z == 0) {
//				System.out.println("run bit");
//				if (x + 50 == circles[count]) {
//					exists[count++] = false;
//				}
				System.out.println(x);
				if (x % 20 == 0) {
					g.setColor(Color.white);
					g.fillRect(x-2, 50, 70, 70);
					g.setColor(Color.pink);
					g.fillArc(x, 50, 70, 70, 0, 360);
				}
			} else {
//				System.out.println("run move");
				x += 2;
				g.setColor(Color.white);
				g.fillRect(x-2, 50, 70, 70);
				g.setColor(Color.pink);
				g.fillArc(x, 50, 70, 70, 30, 300);
			}
//			for (int x = 70; x < 170; x += 20) {
//				if (exists[(x - 69) / 20]) {
//					g.fillOval(x, 80, 10, 10);
//				}
//			}
//			if (count == 5) {
//				count = 4;
//			}
		}
	}

	public void setTimer() {// 計時器
		TimerTask task = new TimerTask() {// 計時器

			@Override
			public void run() {
				// TODO Auto-generated method stub
				z = i % 2 == 0 ? 1 : 0;

				if (i < 113) {
//					update(getGraphics());
					paint(getGraphics());
//					System.out.println(i);
				}
				i++;
			}
		};
		timer = new Timer();
		timer.schedule(task, 1000, 25);
	}
}
