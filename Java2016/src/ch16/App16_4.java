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

		System.out.println(tset.subSet(30, 70)); //��ܫ��w�d�򪺭ȡA�u���w�ƧǪ��~�����\��ATreeSet�ŦX
	}

	public static int getRandom() {
		return (int) (Math.random() * 100) + 1;
	}
}
