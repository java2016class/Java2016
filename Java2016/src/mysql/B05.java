package mysql;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class B05 {
	public static void main(String[] args) {
		char[] A = { 'R', '1', '2', '5', '6' };
		char[] B = { 'K', '2', '3', '4', '5' };
		String strA = new String(A);
		String strB = new String(B);

		System.out.println(getIntersection(A, B));
		System.out.println(getIntersection2(A, B));
	}

	static char[] getIntersection(char[] compare1, char[] compare2) {

		StringBuilder sb = new StringBuilder();
		int count = compare1.length;
		boolean match = false;

		int j = 0;

		for (char c : compare1) {
			match = false;
			for (int i = 0; i < compare2.length; i++) {
				if (match = c == compare2[i]) {
					break;
				}
				j = i;
			}
			if (!match) {
				sb.append(c).append(",");
			} else {
				sb.append(c).append(",").append(compare2[j]).append(",");
			}

		}
		
		System.out.println(sb.toString());
		String[] ss = sb.toString().split(",");
		return sb.toString().split(",").toString().toCharArray();
	}

	static char[] getIntersection2(char[] compare1, char[] compare2) {
		Set<String> chs = new LinkedHashSet<>(Arrays.asList(new String(compare1).split("")));
		chs.addAll(Arrays.asList(new String(compare2).split("")));
		return chs.toString().toCharArray();
	}

	static char[] getUnion(char[] compare1, char[] compare2) {
		char[] ch = null;

		for (char c : compare2) {
			for (char d : compare1) {

			}
		}

		return ch;
	}
}
