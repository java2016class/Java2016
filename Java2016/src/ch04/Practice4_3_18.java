package ch04;

import java.util.Scanner;

public class Practice4_3_18 {
	public static void main(String[] args) {
		System.out.print("�п�J��y�b�|:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("��y��n:" + (double)4 / 3 * Math.PI * Math.pow(number, 3));
		System.out.println("��y��n:" + (double)4 / 3 * 3.141592654 * number*number*number);
		sc.close();
	}
}
