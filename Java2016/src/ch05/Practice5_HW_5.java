package ch05;

import java.util.Scanner;

public class Practice5_HW_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1, sum = 0;
		do {
			System.out.print("�п�J��" + x + "���ƭ�: ");
			sum += sc.nextInt();
			x++;
		} while (x < 6);

		System.out.println("��J5�����`�X��:" + sum + " ; ������:" + sum / 5.0f);
	}
}
