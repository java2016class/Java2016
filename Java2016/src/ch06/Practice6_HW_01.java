package ch06;

import java.util.Scanner;

public class Practice6_HW_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[], sum = 0;
		System.out.print("請確認要輸入幾個分數:");
		score = new int[sc.nextInt()];
		for (int i = 0; i < score.length; i++) {
			System.out.print("請輸入第" + (i + 1) + "個分數:");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		for (int i : score) {
			System.out.println("您輸入的數字為:" + i);
		}
		System.out.println("您輸入的數字總合為:" + sum);
	}
}
