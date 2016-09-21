package ch5;

import java.util.Scanner;

public class Practice5_HW_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("請輸入0~100內的數值: ");
		int score = sc.nextInt();
		switch (score / 10) {
		case 10:
			if (score > 100) {
				System.out.println("Out of range.");
				break;
			}
		case 9:
		case 8:
			System.out.println("A");
			break;
		case 7:
			System.out.println("B");
			break;
		case 6:
			System.out.println("C");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			if (score < 0) {
				System.out.println("Out of range.");
				break;
			}
			System.out.println("D");
			break;
		default:
			System.out.println("Out of range.");

		}
	}

}
