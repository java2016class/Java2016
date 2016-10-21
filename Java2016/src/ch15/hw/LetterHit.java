package ch15.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LetterHit {

	// Demo by teacher Chu on 10/17.
	public static void main(String[] args) throws IOException {
		// TODO Auto�enerated method stub
		LetterGenerator lg = new LetterGenerator();
		lg.start();
		int score = 0;
		while (true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str = br.readLine();
			char ans = str.charAt(0);
			synchronized (lg) {
				if (ans == lg.curr)
					score++;
			}
			System.out.println("目前分數 :" + score);
			if (ans == '*') {
				// lg.gameOver = true;
				LetterGenerator.gameOver = true;
				break;
			}
		}

	}

}

class LetterGenerator extends Thread {
	public char curr = 'A';
	public static boolean gameOver = false;

	public void run() {
		while (!gameOver) {
			synchronized (this) {
				curr = (char) ('A' + (int) (Math.random() * 26));
				System.out.println("電腦出字 : " + curr);
			}
			try {
				sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}
