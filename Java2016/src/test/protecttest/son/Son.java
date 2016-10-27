package test.protecttest.son;

import test.protecttest.Try;

public class Son extends Try {
	public static void main(String[] args) {
		// System.out.println(you); 未指定修飾子的時候無法繼承
		System.out.println(my); // protected 可以讓同個package以下繼承，但以上不行
	}
}
