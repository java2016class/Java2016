package ch14.hw;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class HW01 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("D:\\account.tmp");
		// ObjectOutputStream oos = new ObjectOutputStream(new
		// FileOutputStream(file));
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		// ObjectOutputStream oos = new ObjectOutputStream(new
		// FileOutputStream(file));
//		oos.close();
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Scanner sc = new Scanner(System.in);
		Account acc = null;

		boolean exit = false;
		boolean error = true;

		System.out.println("�w��ϥΦs���ڨt��!");

		try {
			if (!file.exists()) {
				oos = new ObjectOutputStream(new FileOutputStream(file));
				oos.writeObject(new Account());
				oos.flush();
				ois = new ObjectInputStream(new FileInputStream(file));
				acc = (Account) ois.readObject();
			} else {
				ois = new ObjectInputStream(new FileInputStream(file));
				acc = (Account) ois.readObject();
				oos = new ObjectOutputStream(new FileOutputStream(file));
			}
		} catch (EOFException e) {
			System.out.println(e.getMessage());
		} finally {
			if (oos == null)
				oos = new ObjectOutputStream(new FileOutputStream(file));
			if (ois == null)
				ois = new ObjectInputStream(new FileInputStream(file));
		}

		while (true) {
			error = true;
			System.out.print("�п�J�\��N�X(1)�s��(2)����(3)��ܾl�B(4)���} : ");
			switch (sc.nextLine()) {
			case "1":
				System.out.print("�п�J�s�ڪ��B : ");
				try {
					acc.deposit(sc.nextInt());
					System.out.println("�l�B:" + acc.showBalance());
					oos.writeObject(acc);
					oos.flush();
				} catch (NumberFormatException e) {
					System.out.println("�Э��s�ާ@");
				}
				error = false;
				break;
			case "2":
				System.out.print("�п�J���ڪ��B : ");
				try {
					if (acc.withdrawal(sc.nextInt()) != -1) {
						System.out.println("�l�B:" + acc.showBalance());
						oos.writeObject(acc);
						oos.flush();
					} else
						System.out.println("�l�B�����A�Э��s�ާ@");

				} catch (NumberFormatException e) {
					System.out.println("�Э��s�ާ@");
				}
				error = false;
				break;
			case "3":
				System.out.println(acc.showBalance());
				break;
			case "4":
				exit = true;
				break;
			default:
				System.out.println("�N�X���~�A�·нЭ��s��J�N�X");
				break;
			}
			if (exit)
				break;
			if (!error)
				System.out.print(sc.nextLine());
		}
		System.out.println("���¥��{");
		oos.close();
		ois.close();
	}
}

class Account implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int balance = 1000;

	public int deposit(int cash) {
		return balance += cash;
	}

	public int withdrawal(int cash) {
		if (cash <= balance)
			return balance -= cash;
		else
			return -1;
	}

	public int showBalance() {
		return balance;
	}

}
