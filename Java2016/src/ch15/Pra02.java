package ch15;

import java.util.Date;

public class Pra02 {
	public static void main(String[] args) {
		// T6 t6 = new T6(15000);
		// t6.start(); ��@�������@

		T4 t4 = new T4();
		t4.start();// �D�حn�D��
	}
}

class T6 extends Thread {
	private int seconds;

	public T6(int seconds) {
		this.seconds = seconds;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		goHome();
	}

	public synchronized void goHome() {
		System.out.println("�p���^��a�F");
		montherCooking();
	}

	public synchronized void montherCooking() {
		System.out.println("�����N����... " + getDate());
		try {
			sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doEat();
	}

	public synchronized void doEat() {
		System.out.println("�N�n�F!�}�l�Y��! " + getDate());
	}

	public String getDate() {
		return new Date().toString();
	}
}

class T4 extends Thread {// �p��
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		System.out.println("�p���^��a�F");

		// T5 t5 = new T5();
		// try {
		// t5.start();
		// System.out.println(getDate());
		// t5.join();
		// System.out.println(getDate());
		// eat();
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		Thread t7 = new Thread(new T7());
		try {
			t7.start();
			System.out.println(getDate());
			t7.join();
			System.out.println(getDate());
			eat();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void eat() {
		System.out.println("�N�n�F!�}�l�Y��!");
	}

	public String getDate() {
		return new Date().toString();
	}
}

class T5 extends Thread {// ����
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		try {
			for (int i = 15; i > 0; i--) {
				sleep(1000);
				System.out.println("�Z�������N���٦�" + i + "��");
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class T7 implements Runnable {// ����
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		try {
			for (int i = 15; i > 0; i--) {
				Thread.sleep(1000);
				System.out.println("�Z�������N���٦�" + i + "��");
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}