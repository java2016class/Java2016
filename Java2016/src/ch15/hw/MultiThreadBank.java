package ch15.hw;

public class MultiThreadBank {
	public static void main(String[] args) {
		Customer cus = new Customer("Odise");
		cus.start();
		Customer cus2 = new Customer("John");
		cus2.start();
	}
}

class Customer extends Thread {
	private String name;
	private Bank bank;

	public Customer(String name) {
		this.name = name;
		bank = new Bank();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		while (true) {
			synchronized (this) {
				bank.deposit(name, (int) (Math.random() * 1000));
				pause();
				bank.withDraw(name, (int) (Math.random() * 1000));
				pause();
				bank.getBalance();
			}
		}
	}

	public void pause() {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Bank {
	private static int balance;

	public synchronized void getBalance() {
		System.out.println("共同的餘額為 : " + balance);
	}

	public synchronized void deposit(String name, int cash) {
		System.out.println(name + "存入 : " + cash);
		balance += cash;
	}

	public synchronized void withDraw(String name, int cash) {
		System.out.println(name + "取款 : " + cash);
		if (balance < cash) {
			System.out.println(name + "取款失敗...");
		}
		balance = balance < cash ? balance : balance - cash;
	}
}
