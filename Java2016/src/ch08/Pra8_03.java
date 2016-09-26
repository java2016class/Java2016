package ch8;

public class Pra8_03 {
	public static void main(String[] args) {
		CMath math1 = new CMath();
		math1.getMax(50, 60);
		CMath math2 = new CMath();
		int array[] = { 10, 50, 30, 20 };
		math2.getMax(array);

	}
}

class CMath {
	void getMax(int a, int b) {
		System.out.println(a > b ? a : b);
	}

	void getMax(int array[]) {
		int max = 0;
		for (int i : array) {
			if (max < i)
				max = i;
		}
		System.out.println(max);
	}
}
