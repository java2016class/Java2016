package ch06;

import java.util.Scanner;

public class Practice6_HW_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[], sum = 0;
		System.out.print("�нT�{�n��J�X�Ӥ���:");
		score = new int[sc.nextInt()];
		for (int i = 0; i < score.length; i++) {
			System.out.print("�п�J��" + (i + 1) + "�Ӥ���:");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		for (int i : score) {
			System.out.println("�z��J���Ʀr��:" + i);
		}
		System.out.println("�z��J���Ʀr�`�X��:" + sum);
	}
}
