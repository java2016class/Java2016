package ch15;

public class Pra15_15_3_09 {
	// ���D�ĤQ���D
	public static void main(String[] args) {
		// Thread t1 = new Thread(createT11("1", 1000));
		// Thread t2 = new Thread(createT11("2", 2500));
		// t1.start();
		// t2.start();
		// ���@

		Thread t1 = new Thread(createT11("Hello ", 1000));
		Thread t2 = new Thread(createT11("Good bye ", 2500));
		t1.start();
		t2.start();
		// ���G
		
		

	}

	public static T11 createT11(String name, int seconds) {
		return new T11(name, seconds);
	}
}

class T11 implements Runnable {
	private String name;
	private int seconds;

	public T11(String name, int seconds) {
		this.name = name;
		this.seconds = seconds;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// for (int i = 0; i < 10; i++) {
		// try {
		// Thread.sleep(seconds);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// System.out.println("Thread" + name + " is running...");
		// } //���@
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(seconds);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + (i+1));
		} // ���G
	}

}
