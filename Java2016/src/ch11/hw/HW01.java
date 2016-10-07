package ch11.hw;

public class HW01 {
	public static void main(String[] args) {
		IAttack flag;
		Superman man1 = new Superman();
		Spiderman man2 = new Spiderman();
		flag = man1;
		flag.showAttack();
		flag = man2;
		flag.showAttack();
	}

}
