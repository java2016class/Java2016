package test;

import static org.junit.Assert.*;

import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Tester {

	// @Test
	public void test() {
		ArrayList<String> list = new ArrayList<>();
		list.add("SE");
		list.add("EE");
		list.add("ME");
		list.add("SE");
		list.add("EE");

		list.remove("SE");

		System.out.println(list);

	}

	private int i;

	// @Test
	public void test2() {
		disp();
	}

	void disp() {
		while (i <= 5) {
			for (int i = 0; i <= 5;) {
				System.out.print(i + " ");
				i++;
			}
			System.out.println("");
			i++;
		}
	}

	// @Test
	public void test3() {
		try {
			int[] num = { 100, 100 };
			dispResult(num);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("Second");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Third");
		}
	}

	void dispResult(int[] num) {
		try {
			System.out.println(num[1] / (num[1] - num[2]));
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("First");
		}
		System.out.println("Done");
	}

	// @Test
	public void test4() {
		int[] j = new int[1];
		j[0] = 12;
		System.out.println(j[0]);
		m(j);
		System.out.println(j[0]);
	}

	void m(int[] i) {
		i[0] += 7;
	}

	// @Test
	public void test5() {
		String str1 = "Java";
		char[] chs = { 'J', 'a', 'v', 'a' };
		String str2 = null;
		for (char c : chs) {
			str2 = str2 + c;
		}
		System.out.println(str2);
	}

	// @Test
	public void test6() {
		int arr[] = { 1, 2, 3 };
		for (int var : arr) {
			int i = 1;
			while (i <= var) {
				System.out.println(i++);
			}
		}
	}

	// @Test
	public void test7() {
		String str = "";
		StringBuilder sb = new StringBuilder();
		List ls = new ArrayList<>();
		ls.add(sb.toString());
		System.out.println(str.getClass());
		System.out.println(sb.getClass());
		System.out.println(ls.getClass());
	}

	// @Test
	public void test8() {
		String[] colors = { "red", "blue", "green", "yellow", "maroon", "cyan" };
		int count = 0;

		String[] arr = new String[4];
		arr[1] = "k";

		for (String string : arr) {
			System.out.println(string);
		}

		for (String string : colors) {

			if (count >= 4) {
				break;
			} else {
				continue;
			}

			// if (string.length() >= 4) {
			//
			// }
		}
	}

	// @Test
	public void test9() {
		float var1 = (12_345.01 >= 123_45.00) ? 12_456 : 124_56.02f;
		System.out.println(var1);
	}

	// @Test
	public void test10() {
		try {
			Integer obj = new Integer(10);
			int obj2 = 10;
			doubleing(obj++, obj2++);
			System.out.println(obj + " " + obj2);
		} catch (Exception e) {

			System.out.println(e.getMessage());
			// TODO: handle exception
		}

		C c = new C() {
		};
	}

	void doubleing(Integer obj, int obj2) throws Exception {
		obj = 20;
		obj2 = 20;
	}

//	@Test
	public void Test11() {
		try {
			int row = 10;
			for (; row > 0;) {
				int col = row;
				while (col >= 0) {
					System.out.println(col + " ");
					col -= 2;
				}
				row = row / col;
				System.out.println(row);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void Test12(){
		FieldInit f = new FieldInit();
	}
}
