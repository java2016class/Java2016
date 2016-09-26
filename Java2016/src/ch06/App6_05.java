package ch06;

public class App6_05 {
	public static void main(String[] args) {
		//3ºû°}¦C
		int a[][][] = { { { 21, 32, 65 }, { 78, 94, 76 }, { 79, 44, 65 }, { 89, 54, 73 } },
				{ { 32, 56, 89 }, { 43, 23, 32 }, { 32, 56, 78 }, { 94, 78, 45 } } };
		int i, j, k, max = a[0][0][0];
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				for (k = 0; k < a[i][j].length; k++) {
					if (a[i][j][k] > max)
						max = a[i][j][k];
				}
			}
		}
		System.out.println("max = " + max);
	}
}
