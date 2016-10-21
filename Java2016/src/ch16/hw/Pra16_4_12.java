package ch16.hw;

import java.util.TreeMap;

public class Pra16_4_12 {
	public static void main(String[] args) {
		TreeMap<Integer, Integer> tMap = new TreeMap<>();
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			tMap.put(i, getRandom());
			sum += tMap.get(i);
		}
		System.out.println("total = " + sum + " , avg = " + sum / tMap.lastKey());

	}

	static int getRandom() {
		return (int) (Math.random() * 100) + 1;
	}
}
