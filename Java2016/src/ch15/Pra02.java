package ch15;

import java.util.Date;

public class Pra02 {
	public static void main(String[] args) {
		// T6 t6 = new T6(15000);
		// t6.start(); 單一執行緒實作

		T4 t4 = new T4();
		t4.start();// 題目要求的
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
		System.out.println("小明回到家了");
		montherCooking();
	}

	public synchronized void montherCooking() {
		System.out.println("媽媽煮飯中... " + getDate());
		try {
			sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doEat();
	}

	public synchronized void doEat() {
		System.out.println("煮好了!開始吃飯! " + getDate());
	}

	public String getDate() {
		return new Date().toString();
	}
}

class T4 extends Thread {// 小明
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		System.out.println("小明回到家了");

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
		System.out.println("煮好了!開始吃飯!");
	}

	public String getDate() {
		return new Date().toString();
	}
}

class T5 extends Thread {// 媽媽
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		try {
			for (int i = 15; i > 0; i--) {
				sleep(1000);
				System.out.println("距離完成煮飯還有" + i + "分");
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class T7 implements Runnable {// 媽媽
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		try {
			for (int i = 15; i > 0; i--) {
				Thread.sleep(1000);
				System.out.println("距離完成煮飯還有" + i + "分");
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}