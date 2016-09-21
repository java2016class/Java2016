package ch6;

public class App6_01 {
	public static void main(String[] args) {
		int i, a[] = new int[3];
		a[0] = 9;
		a[1] = 6;
		for (i = 0; i < a.length; i++)
			System.out.println("a[" + i + "]=" + a[i] + ",\t");

		System.out.println("\nLength = " + a.length);

	}
}
