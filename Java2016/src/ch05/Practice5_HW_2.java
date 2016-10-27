package ch05;

import java.util.Scanner;

public class Practice5_HW_2 {
	public static void main(String[] args) {
		String user = "user", pass = "12345";
		String tempUser, tempPass;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("請輸入使用者帳號: ");
			tempUser = sc.nextLine();
			System.out.println();
			System.out.print("請輸入使用者密碼: ");
			tempPass = sc.nextLine();
			System.out.println();
			if (tempUser.equals(user) && tempPass.equals(pass)) {
				System.out.println("歡迎登入");
				break;
			} else if (!tempUser.equals(user)) {
				System.out.println("帳號有誤");
			} else {
				System.out.println("密碼有誤");
			}
			tempUser = "";
			tempPass = "";
		}

	}
}
