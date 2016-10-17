package ch15;

public class App15_4 {
	public static void main(String[] args) {
		CTest4 test = new CTest4("123");
		CTest4 test2 = new CTest4("456");
		test.start();
		test2.start();
	}
}

class CTest4 extends Thread {
	private String id;

	public CTest4(String id) {
		this.id = id;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		for (int i = 0; i < 4; i++) {
			try {
				sleep((int) (1000 * Math.random()));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println(e.getMessage());
			}
			System.out.println(id + " is running...");
		}
	}
}
