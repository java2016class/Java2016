package ch05;

import java.util.Scanner;

public class Practice5_HW_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入整數:");
		int value = sc.nextInt();

		for (int i = 2; i <= value; i++) {
			if (value % i == 0 && value!=2) {
				System.out.println("不是質數");
				break;
			} else if (i == value) {
				System.out.println("是質數");
			}
		}

	}
}
