package ch16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App16_1 {
	public static void main(String[] args) {
		String[] strs = { "Monkey", "Mouse", "Rabbit" };
		List<String> lists = new ArrayList<>();
		lists.add(strs[0]);
		lists.add(strs[1]);

		HashSet<String> hset = new HashSet<>();
		hset.add("Monkey");
		hset.add("Mouse");
		hset.add("Monkey");
		hset.addAll(lists);

		for (String string : hset) {
			System.out.println(string);
		}
		
		
	}
}
