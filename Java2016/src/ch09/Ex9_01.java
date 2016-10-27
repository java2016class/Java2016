package ch09;

public class Ex9_01 {
	public static void main(String[] args) {
		System.out.println(add(10));
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
	}

	static int add(int... a) { //不定個數 不確定數量的時候使用，同個方法中只能用一次
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}
}
