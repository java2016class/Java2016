package ch5;

import java.util.Scanner;

public class Practice5_HW_2 {
	public static void main(String[] args) {
		String user = "user", pass = "12345";
		String tempUser, tempPass;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("�п�J�ϥΪ̱b��: ");
			tempUser = sc.nextLine();
			System.out.println();
			System.out.print("�п�J�ϥΪ̱K�X: ");
			tempPass = sc.nextLine();
			System.out.println();
			if (tempUser.equals(user) && tempPass.equals(pass)) {
				System.out.println("�w��n�J");
				break;
			} else if (!tempUser.equals(user)) {
				System.out.println("�b�����~");
			} else {
				System.out.println("�K�X���~");
			}
			tempUser = "";
			tempPass = "";
		}

	}
}
