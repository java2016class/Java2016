package ch15;

public class Pra01_Correct {
	public static void main(String[] args) {
		T3 t3_1 = new T3("T1", 500);
		T3 t3_2 = new T3("T2", 2000);
		t3_1.start();
		t3_2.start();
	}
}

class T3 extends Thread {

	private String objName;
	private int sleepTime;

	public T3(String name, int time) {
		// TODO Auto-generated constructor stub
		objName = name;
		sleepTime = time;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		for (int i = 0; i < 5; i++) {
			try {
				sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println(e.getMessage());
			}
			System.out.println(objName + " ²Ä" + (i + 1) + "¦¸");
		}
	}
}
