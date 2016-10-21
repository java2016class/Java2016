package ch16.hw;

import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<>();
		while (hset.size() != 7) {
			int getNum = getRandom();
			System.out.println(hset.add(getNum) ? getNum : "Repeat");
		}

//		for (Integer integer : hset) {
//			System.out.println(integer);
//		}
	}

	public static int getRandom() {
		return (int) (Math.random() * 49) + 1;
	}

}
