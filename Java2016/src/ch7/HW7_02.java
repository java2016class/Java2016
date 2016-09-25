package ch7;

public class HW7_02 {
	public static void main(String[] args) {
		getLottory();
	}

	static void getLottory() {
		int lottoryNum[] = new int[6];
		int i = 0;
		boolean repeat = false;
		while (i < 6) {
			int ran = (int) (Math.random() * 49) + 1;
			for (int j : lottoryNum) {
				if (ran == j) {
					repeat = true;
					break;
				}
			}
			if (repeat) {
				repeat = false;
				continue;
			}
			lottoryNum[i++] = ran;
		}
		System.out.print("¼Ö³z¸¹½X : ");
		for (int j : lottoryNum) {
			System.out.printf("%02d ", j);
		}
	}
}
