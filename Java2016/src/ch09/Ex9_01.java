package ch09;

public class Ex9_01 {
	public static void main(String[] args) {
		System.out.println(add(10));
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
	}

	static int add(int... a) { //���w�Ӽ� ���T�w�ƶq���ɭԨϥΡA�P�Ӥ�k���u��Τ@��
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}
}
