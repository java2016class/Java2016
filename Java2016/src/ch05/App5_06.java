package ch05;

import java.util.Scanner;

public class App5_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i = 1, sum=0;
		do {
			System.out.print("�п�J�@�ӼƭȥH�p��֥[��:");
			n = sc.nextInt();
		} while (n < 1);

		do
			sum += i++;
		while (i < n);

		System.out.println("�֥[�� = " + sum);
	}

}
