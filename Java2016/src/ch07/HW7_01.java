package ch07;

import java.util.Scanner;

public class HW7_01 {
	public static void main(String[] args) {
		double x,y;
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�J����: ");
		x = sc.nextDouble();
		System.out.print("\n�п�J�e��: ");
		y = sc.nextDouble();
		getTriangleArea(x, y);
	}

	static void getTriangleArea(double x, double y) {
		System.out.println("Triangle Area is : " + x * y * 0.5);
	}
}
