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
		//�M��ȡA�䤣�쬰�t����ܥB��ȳ̾a�񪺼ƭȦ�m
		System.out.println("\n" + n1);
	}
}
