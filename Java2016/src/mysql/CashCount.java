package mysql;

import java.util.Scanner;

public class CashCount { // �p��r���ƶq
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bp = false;
		while (!bp) {
			System.out.println("�п�J�{�����B:");
			int cash = sc.nextInt();
			if (cash == -1) {
				bp = true;
				continue;
			}
			for (String i : getCashCount(cash)) {
				System.out.println(i);
			}
		}
	}

	static String[] getCashCount(int cash) {
		String[] count = new String[7];
		int j = 1, k;
		int temp = cash;
		for (int i = 1000; i >= 1; i /= 10) {
			k = j % 2 == 0 ? 5 : 1;

			count[j++ - 1] = String.format("%s %d ���A�@%3d�i", "���B ", i * k, temp / (i * k));
			temp %= i * k;
			
			i = k == 5 ? i * 10 : i;
		}

		return count;
	}
}
