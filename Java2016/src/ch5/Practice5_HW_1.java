package ch5;

import java.util.Scanner;

public class Practice5_HW_1 {
	public static void main(String[] args) {
		System.out.print("�п�J�褸�~:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.printf("�z��J���褸�~ %d ���|�~\n", year);
		} else {
			System.out.printf("�z��J���褸�~ %d �D�|�~\n", year);
		}
		sc.close();
	}
}
