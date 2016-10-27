package ch16.hw;

import java.util.TreeMap;

public class Pra16_4_11 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(325, "apple");
		tm.put(594, "cherry");
		tm.put(37, "pineapple");
		tm.put(158, "mango");
		tm.put(114, "tomato");

		System.out.println(tm.toString());

		System.out.println(tm.firstKey() + " 為 " + tm.get(tm.firstKey()));
		System.out.println(tm.lastKey() + " 為 " + tm.get(tm.lastKey()));
		System.out.println("價差 : " + (tm.lastKey() - tm.firstKey()));
	}

}
