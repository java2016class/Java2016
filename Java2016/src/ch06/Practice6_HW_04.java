package ch06;

import java.util.Arrays;

public class Practice6_HW_04 {
	public static void main(String[] args) {
		int n[] = new int[] { 50, 20, 30, 25, 45 };
		Arrays.sort(n);
		for (int i : n) {
			System.out.println("\t" + i);
		}
		int n1 = Arrays.binarySearch(n, 61);
		//尋找值，找不到為負值顯示且選值最靠近的數值位置
		System.out.println("\n" + n1);
	}
}
