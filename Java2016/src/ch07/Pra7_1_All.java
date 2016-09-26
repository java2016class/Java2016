package ch07;

public class Pra7_1_All {
	public static void main(String[] args) {
		//7.1.01
		kitty();
		//7.1.02
		kitty(2);
		//7.1.03
		System.out.println(cub(2));
		//7.1.04
		System.out.println(addto(10));
		//7.1.05
		System.out.println(fahrenheit(20));
		//7.1.06
		System.out.println(even(6));
		//7.1.07
		int evenOf9[] = evenOf9(100);
		for (int i : evenOf9) {
			System.out.print(i+"\t");
		}
		System.out.println();
		//7.1.08
		System.out.println(area(2.0));
		//7.1.09
		System.out.println(abs(-5));
		System.out.println(abs(2));
		System.out.println(abs(0));
		//7.1.10
		System.out.println(min(5, 8));
		System.out.println(min(9, 2));
	}

	public static void kitty() {
		System.out.println("Hello Kitty");
	}

	public static void kitty(int k) {
		for (int i = 0; i < k; i++)
			System.out.println("Hello Kitty");
	}

	public static int cub(int x) {
		return (int) Math.pow(x, 3);
	}

	public static int addto(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++)
			sum += i;
		return sum;
	}

	public static double fahrenheit(double c) {
		return c * 9 / 5 + 32;
	}

	public static boolean even(int n) {
		return n % 2 == 0;
	}

	public static int[] evenOf9(int n) {
		int num[], number = 0, count = 0;
		for (int i = 0; i < n; i++) {
			if (i % 9 == 0 && i % 2 == 0) {
				number++;
			}
		}
		num = new int[number];
		for (int i = 0; i < n; i++) {
			if (i % 9 == 0 && i % 2 == 0) {
				num[count++] = i;
			}
		}
		return num;
	}

	public static double area(double r) {
		return r * r * Math.PI;
	}

	public static int abs(int x) {
		return Math.abs(x);
	}

	public static int min(int a, int b) {
		return a < b ? a : b;
	}

}
