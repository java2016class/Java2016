package ch05;

public class Practice5_3_All {

	public static void main(String[] args) {
		// 8.
		System.out.print("可被16整除的數:");
		for (int i = 1; i <= 100; i++) {
			if (i % 16 == 0) {
				System.out.printf("%d  ", i);
			}
		}
		System.out.println();

		// 9.
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i * i;
		}
		System.out.println("1~100的平方值總和為" + sum);

		// 10.
		for (int j = 0; j <= 5; j++) {
			for (int i = 0; i < j; i++) {
				System.out.print((i + 1));
			}
			System.out.println();
		}

		// 11.
		int x = 1, y = 1;
		do {

			do {
				if (y < 9) {
//					System.out.print(x + " * " + y + " = " + x * y + "\t");
					System.out.printf("%d * %d = %2d , ", x, y, x * y);
				} else {
					System.out.printf("%d * %d = %2d", x, y, x * y);
				}
				y++;
			} while (y <= 9);
			System.out.println();
			y = 1;
			x++;
		} while (x <= 9);

		// 12.
		int sum2 = 1;
		for (int i = 1; i <= 5; i++) {
			sum2 *= i;
			System.out.println("i=" + i + ", sum2=" + sum2);
		}
		{
			int num = 5;
			System.out.println("num=" + num);
		}
		System.out.println("sum2=" + sum2);
	}

}
