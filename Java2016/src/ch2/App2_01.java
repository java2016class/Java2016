package ch2;

import java.util.Scanner;

public class App2_01 {

	App2_01(){}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num; // 請記憶體空出參考位置
		num = 2; // 指定參數到參考位置，等號右邊的值派到左邊去。
		Scanner sc = new Scanner(System.in); //輸入參數
		System.out.print("請輸入狗數:");
		System.out.println("I have " + sc.next() + " dogs.");
		System.out.print("請輸入狗數:");
		System.out.println("You have " + sc.next() + " dogs, too.");

	}
	
	App2_01 ac = new App2_01();

}
