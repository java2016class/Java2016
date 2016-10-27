package ch05;

import java.util.Scanner;

public class Practice5_HW_1 {
	public static void main(String[] args) {
		System.out.print("請輸入西元年:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.printf("您輸入的西元年 %d 為閏年\n", year);
		} else {
			System.out.printf("您輸入的西元年 %d 非閏年\n", year);
		}
		sc.close();
	}
}
