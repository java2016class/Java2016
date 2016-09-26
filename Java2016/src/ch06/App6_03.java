package ch6;

public class App6_03 {
	public static void main(String[] args) {
		int i, min, max;
		int a[] = { 74, 48, 30, 17, 62 };

		min = max = a[0];
		for (i = 0; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];
			if (a[i] > max)
				max = a[i];
		}
		System.out.println("max = " + max + "\n" + "min = " + min);
	}
}
