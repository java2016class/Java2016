package ch15;

public class A15_8 {
	public static void main(String[] args) {
		CCustomer cc1 = new CCustomer();
		CCustomer cc2 = new CCustomer();
		cc1.start();
		cc2.start();
	}
}

class CCustomer extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();

		for (int i = 0; i <= 3; i++) {
			CBank.add(100);
		}
	}
}

class CBank {
	private static int sum = 0;

	public synchronized static void add(int n) {
		int tmp = sum;
		tmp = tmp + n;
		try {
			Thread.sleep((int) (1000 * Math.random()));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		sum = tmp;
		System.out.println("sum = " + tmp);
	}
}
