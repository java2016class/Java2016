package ch04;

import java.util.Scanner;

public class Practice4_3_13 {
public static void main(String[] args) {
	System.out.print("請輸入攝氏溫度:");
	Scanner sc = new Scanner(System.in);
	double number = sc.nextDouble();
	System.out.println("華氏溫度:"+(((double)9/5)*number+32));
	sc.close();
	System.out.printf("中秋是%d月%d,買了%1.1f個月餅",8,15,3.5);
}
}
