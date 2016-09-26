package ch05;

import java.util.Scanner;

public class Practice5_HW_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1, sum = 0;
		int input;
		do {
			System.out.print("請輸入第" + x + "次數值: ");
			input = sc.nextInt();
			if(input<0){
				x--;
				break;
			}
			sum += input;
			x++;
		} while (true);

		System.out.println("輸入"+x+"次的總合為:" + sum + " ; 平均為:" + sum / (double)x);
	}
}
