package ch15;

public class Pra01 {
	public static void main(String[] args) {
		T1 t1 = new T1();
		T2 t2 = new T2();
		t1.start();
		t2.start();
	}
}

class T1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		for (int i = 0; i < 5; i++) {
			try {
				sleep(500);
				System.out.println("T1 第" + (i + 1) + "次");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
}

class T2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		for (int i = 0; i < 5; i++) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println(e.getMessage());
			}
			System.out.println("T2 第" + (i + 1) + "次");
		}
	}
}
