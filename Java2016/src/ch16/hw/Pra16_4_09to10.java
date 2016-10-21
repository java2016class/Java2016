package ch16.hw;


import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Pra16_4_09to10 {
	public static void main(String[] args) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int i = 0; i < 5; i++) {
			hmap.put(i, getRandom());
		}
		TreeSet<Object> tset = mapToTreeSet(hmap);
		HashSet<Object> hset = mapToHashSet(hmap);

		System.out.println(hmap.toString());
		System.out.println(tset.toString());
		System.out.println(hset.toString());
		
		HashMap<String, String> hmap2 = new HashMap<>();
		TreeSet<Object> tset2 = mapToTreeSet(hmap2);
		System.out.println(tset2.toString());
		
	}

	static int getRandom() {
		return (int) (Math.random() * 100) + 1;
	}

	static <T> TreeSet<Object> mapToTreeSet(HashMap<T, T> map) {
		TreeSet<Object> tset = new TreeSet<>();
		tset.addAll(map.values());
		return tset;
	}

	static <T> HashSet<Object> mapToHashSet(HashMap<T, T> map) {
		HashSet<Object> hset = new HashSet<>();
		hset.addAll(map.keySet());
		return hset;
	}
}
