package ch03;

import java.util.Scanner;

public class App3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Please enter any words or number:");
		
		Scanner sc = new Scanner(System.in);
		
		String get = sc.nextLine();
		
		System.out.println("Your keyin is \""+get+"\"");
		
		sc.close();
		
		

	}

}
