package ch05;

import java.util.Scanner;

public class Practice5_HW_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1, sum = 0;
		do {
			System.out.print("請輸入第" + x + "次數值: ");
			sum += sc.nextInt();
			x++;
		} while (x < 6);

		System.out.println("輸入5次的總合為:" + sum + " ; 平均為:" + sum / 5.0f);
	}
}
