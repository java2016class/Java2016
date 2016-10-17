package ch15.hw;

import java.util.Scanner;

public class Game2 {
	public static void main(String[] args) {
		RandomLetter2 ran = new RandomLetter2();
		Scanner sc = new Scanner(System.in);
		char inputLetter = ' ';
		int points = 0;

		ran.start();
		System.out.println("Game start!");
		while (true) {
			inputLetter = sc.nextLine().charAt(0);
			if (inputLetter == '*') {
				ran.close();
				break;
			} else if (inputLetter == ran.getLetter()) {
				System.out.println(inputLetter + " V.S. " + ran.getLetter() + " You got a point!");
				points++;
			} else {
				System.out.println(inputLetter + " V.S. " + ran.getLetter() + " Miss...");
			}
		}
		System.out.println("Your points : " + points);
		System.out.println("Bye bye~");
	}
}

class RandomLetter2 extends Thread {
	private char letter;
	private boolean isClose;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		while (!isClose) {
			letter = (char) (Math.random() * 26 + 'A');
			// letter = (char) (Math.random() * 26 + 65); //請參考ASCII碼A字元編號
			System.out.println("電腦:" + letter);
			try {
				sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public char getLetter() {
		return letter;
	}

	public void close() {
		isClose = true;
	}
}
