package ch03;

import java.util.Scanner;

public class Practice3_4_22 {

	public static void main(String[] args) {
		System.out.print("請輸入隨便一個英文字母: ");
		Scanner sc = new Scanner(System.in);
		while (true) {
			String word = sc.next();
			int get = word.charAt(0);
			if (get >= 65 && get < 91) {
				get = get - 64;
				System.out.println("您輸入的大寫英文為 : " + word + " , 字母排名為 :" + get);
			} else if (get >= 97 && get < 123) {
				get = get - 96;
				System.out.println("您輸入的小寫英文為 : " + word + " , 字母排名為 :" + get);
			} else {
				System.out.println("您輸入的不是英文字母");
			}
			System.out.print("請輸入隨便一個英文字母: ");
		}

	}
}
