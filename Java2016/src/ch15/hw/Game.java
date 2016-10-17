package ch15.hw;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		RandomLetter ran = new RandomLetter();
		Scanner sc = new Scanner(System.in);
		char inputLetter = ' ';
		ran.start();
		System.out.println("Game start!");
		while (true) {
			inputLetter = sc.nextLine().charAt(0);
			if (inputLetter == '*') {
				ran.setInputLetter(inputLetter);
				break;
			} else {
				ran.setInputLetter(inputLetter);
			}
		}
	}
}

class RandomLetter extends Thread {
	private char letter;
	private char inputLetter = ' ';
	private boolean isClose;
	private int points = 0;

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
			if (inputLetter == ' ') {
				System.out.println("逾時，換一個字母");
			} else if (inputLetter == '*') {
				close();
			} else {
				compareLetter();
			}
		}
		System.out.println("Your points : " + points);
		System.out.println("Bye bye~");
	}

	public char getLetter() {
		return letter;
	}

	public void setInputLetter(char letter) {
		inputLetter = letter;
	}

	public void compareLetter() {
		if (inputLetter == getLetter()) {
			System.out.println(inputLetter + " V.S. " + getLetter() + " You got a point!");
			points++;
		} else {
			System.out.println(inputLetter + " V.S. " + getLetter() + " Miss...");
		}
		inputLetter = ' ';
	}

	public void close() {
		isClose = true;
	}
}
