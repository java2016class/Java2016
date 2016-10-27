package ch06;

public class App6_06 {
	public static void main(String[] args) {
		//比較指向的參考位置
		//C語言講的指標比較詳細
		int a[] = { 2, 7, 6, 3, 8, 4 };
		int b[] = { 2, 7, 6, 3, 8, 4 };
		int c[] = a;

		if (a == b)
			System.out.println("a=b");
		else
			System.out.println("a!=b");
		
		if (a == c)
			System.out.println("a=c");
		else
			System.out.println("a!=c");
	}
}
