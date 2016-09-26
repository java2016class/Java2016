package ch4;

public class App_4_04 {
	public static void main(String[] args) {
		int a = 5, b = 5, c;
		System.out.println("a=" + a + ", b=" + b);
		c = a++;
		System.out.println("c=" + c + ", a=" + a);
		c = ++b;
		System.out.println("c=" + c + ", b=" + b);
	}
}
