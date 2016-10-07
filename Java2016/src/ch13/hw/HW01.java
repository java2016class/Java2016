package ch13.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW01 {

	public static void main(String[] args) {
		IbankImpl bank = new IbankImpl();
		bank.login("Odise", "123456");
		System.out.println(bank.showName());
		System.out.println(bank.showBalance());
		try {
			bank.deposit(5000);
		} catch (BankException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(bank.showBalance());
		try {
			bank.deposit(10000);
		} catch (BankException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(bank.showBalance());
		bank.posit(20000);
		System.out.println(bank.showBalance());
	}

}
