package ch3;

import java.util.Scanner;

public class Practice3_4_22 {

	public static void main(String[] args) {
		System.out.print("�п�J�H�K�@�ӭ^��r��: ");
		Scanner sc = new Scanner(System.in);
		while (true) {
			String word = sc.next();
			int get = word.charAt(0);
			if (get >= 65 && get < 91) {
				get = get - 64;
				System.out.println("�z��J���j�g�^�嬰 : " + word + " , �r���ƦW�� :" + get);
			} else if (get >= 97 && get < 123) {
				get = get - 96;
				System.out.println("�z��J���p�g�^�嬰 : " + word + " , �r���ƦW�� :" + get);
			} else {
				System.out.println("�z��J�����O�^��r��");
			}
			System.out.print("�п�J�H�K�@�ӭ^��r��: ");
		}

	}
}
