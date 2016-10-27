package ch16;

import java.util.TreeSet;

public class App16_4 {
	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<>();
		while (tset.size() != 10) {
			tset.add(getRandom());
		}

		for (Integer integer : tset) {
			System.out.println(integer);
		}

		System.out.println(tset.subSet(30, 70)); //顯示指定範圍的值，只有已排序的才有此功能，TreeSet符合
	}

	public static int getRandom() {
		return (int) (Math.random() * 100) + 1;
	}
}
