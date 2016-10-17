package ch15;

public class App15_4_NoThread {
	public static void main(String[] args) {
		CTest5 test = new CTest5("123");
		CTest5 test2 = new CTest5("456");
		test.run();
		test2.run();
	}
}

class CTest5 {
	private String id;

	public CTest5(String id) {
		this.id = id;
	}

	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		for (int i = 0; i < 4; i++) {
			try {
				Thread.sleep((int) (1000 * Math.random()));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println(e.getMessage());
			}
			System.out.println(id + " is running...");
		}
	}
}
