package ch09;

import java.util.Arrays;
import java.util.Collections;

public class HW9_02 {
	public static void main(String[] args) {
		new MakeRnd(11, 20).getRnd3();
	}
}

class MakeRnd {
	private int numbers[], maxNum, minNum;
	private boolean isRepeat;

	public MakeRnd(int minNum, int maxNum) {
		numbers = new int[5];
		this.maxNum = maxNum;
		this.minNum = minNum;
	}

	void getRnd() {
		for (int i = 0; i < numbers.length; i++) {
			int rnd = (int) (Math.random() * maxNum) + 1;
			for (int j : numbers) {
				if (j == rnd || rnd < minNum) {
					isRepeat = true;
					break;
				}
			}
			if (isRepeat) {
				i--;
				isRepeat = false;
			} else {
				numbers[i] = rnd;
			}
		}
		for (int i : numbers) {
			System.out.printf("%02d ", i);
		}
	}

	void getRnd2() {
		int i = 0;
		Integer arr[] = new Integer[5];

		boolean isRepeat = false;
		do {
			Integer rnd = (int) (Math.random() * 20) + 1;
			System.out.println("rnd = " + rnd);
			if (rnd >= 11 && rnd <= 20) {
				for (Integer j : arr) {
					if (j == rnd)
						isRepeat = true;
				}
				if (isRepeat == false)
					arr[i++] = rnd;
				else
					isRepeat = false;

			}
		} while (i < 5);
		Arrays.sort(arr, Collections.reverseOrder());
		for (int j : arr) {
			System.out.printf("%02d ", j);
		}
	}

	void getRnd3() {
		int i = 0;
		do {
			int rnd = (int) (Math.random() * 20) + 1;
			if (rnd >= 11 && rnd <= 20) {
				for (int k = 0; k < numbers.length; k++) {
					if (numbers[k] == rnd) {
						break;
					} else if (numbers[k] != rnd && k == numbers.length - 1) {
						numbers[i++] = rnd;
					}
				}
			}
		} while (i < 5);
		for (int j : numbers) {
			System.out.printf("%02d ", j);
		}
	}

}