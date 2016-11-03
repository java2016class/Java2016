package ch20;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;

public class App20_08_Special extends Frame {
	static App20_08_Special frm = new App20_08_Special();
	static int i = 0;
	static int x = 20;
	static int z = 0;
	static int j = 2;
	static int[] circles = new int[5];
	static boolean[] exists = { true, true, true, true, true };
	static int count = 0;
	static Timer timer;

	public static void main(String[] args) {
		frm.setTitle("Arc & Oval");
		frm.setSize(230, 200);
		frm.setVisible(true);
		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				timer.cancel();//這裡設定取消計時器功能
				System.exit(0);
			}
		});
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
			System.out.println("run bit");
			// if (x + 50 == circles[count]) {
			// exists[count++] = false;
			// }
			// for (int x = 70; x < 170; x += 20) {
			// if (exists[(x - 69) / 20]) {
			// g.setColor(Color.red);
			// g.fillOval(x, 80, 10, 10);
			// }
			// }

			// if (count == 5) {
			// count = 4;
			// }
			switch (z) {
			// 使用z值控制小精靈的繪圖呈現，這裡使用setColor的和fillRect的方式先繪白色圖形覆蓋原區域，
			// 再繪出小精靈的圖形。此方式解決使用update()的先消除圖形在繪圖會造成的閃爍
			case 1:
				g.setColor(Color.white);
				g.fillRect(x, 50, 70, 70);
				x += j;
				g.setColor(Color.pink);
				if (j > 0) {
					g.fillArc(x, 50, 70, 70, 30, 300);
				} else {
					g.fillArc(x, 50, 70, 70, 210, 300);
				}
				break;
			case 2:
				g.setColor(Color.white);
				g.fillRect(x - j, 50, 70, 70);
				g.setColor(Color.pink);
				if (j > 0) {
					g.fillArc(x, 50, 70, 70, 20, 320);
				} else {
					g.fillArc(x, 50, 70, 70, 200, 320);
				}
				break;
			case 3:
				g.setColor(Color.white);
				g.fillRect(x, 50, 70, 70);
				g.setColor(Color.pink);
				x += j;
				if (j > 0) {
					g.fillArc(x, 50, 70, 70, 2, 356);
				} else {
					g.fillArc(x, 50, 70, 70, 182, 356);
				}
				break;
			case 4:
				g.setColor(Color.white);
				g.fillRect(x - j, 50, 70, 70);
				g.setColor(Color.pink);
				if (j > 0) {
					g.fillArc(x, 50, 70, 70, 20, 320);
				} else {
					g.fillArc(x, 50, 70, 70, 200, 320);
				}
				break;
			}
		}
	}

	public void setTimer() {// 計時器
		TimerTask task = new TimerTask() {// 計時器的實作

			@Override
			public void run() {
				// TODO Auto-generated method stub

				if (i < 120) {
					// update(getGraphics());
					paint(getGraphics());
					// System.out.println(i);
					z++;
				} else {// 計數到120後將i歸零以重新繼續迴圈並把X的位移值顛倒
					i = 0;
					j = -j;
				}
				i++;

				if (z == 4) {
					z = 0;
				}
			}
		};
		timer = new Timer(); // 建立計時器參考物件
		timer.schedule(task, 1000, 25); // 設定計時器的延遲啟動與重複執行的時間(1000為一秒)
		// 本案例的timer若沒有使用cancel()結束，則會一直無窮計時下去
	}
}
