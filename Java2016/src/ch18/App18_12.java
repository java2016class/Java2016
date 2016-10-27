package ch18;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App18_12 extends Frame {
	static App18_12 frm = new App18_12();
	static WinLis wlis = new WinLis();

	public static void main(String[] args) {
		frm.setSize(200, 150);
		frm.setTitle("Window Event");
		frm.addWindowListener(wlis);
		frm.setVisible(true);
	}

	static class WinLis extends WindowAdapter {

		@Override
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			// super.windowActivated(arg0);
			System.out.println("windowActivated");
		}

		@Override
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			// super.windowClosed(arg0);
			System.out.println("windowClosed");
		}

		@Override
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			// super.windowClosing(arg0);
			System.out.println("windowClosing");
		}

		@Override
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			// super.windowDeactivated(arg0);
			System.out.println("windowDeactivated");
		}

		@Override
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			// super.windowDeiconified(arg0);
			System.out.println("windowDeiconified");
		}

		@Override
		public void windowGainedFocus(WindowEvent arg0) {
			// TODO Auto-generated method stub
			// super.windowGainedFocus(arg0);
			System.out.println("windowGainedFocus");
		}

		@Override
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			// super.windowIconified(arg0);
			System.out.println("windowIconified");
		}

		@Override
		public void windowLostFocus(WindowEvent arg0) {
			// TODO Auto-generated method stub
			// super.windowLostFocus(arg0);
			System.out.println("windowLostFocus");
		}

		@Override
		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			// super.windowOpened(arg0);
			System.out.println("windowOpened");
		}

		@Override
		public void windowStateChanged(WindowEvent arg0) {
			// TODO Auto-generated method stub
			// super.windowStateChanged(arg0);
			System.out.println("windowStateChanged");
		}

	}
}
