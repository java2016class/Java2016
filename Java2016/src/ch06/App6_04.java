package ch06;

public class App6_04 {
	public static void main(String[] args) {
		int i, j;
		int sales[][] = { { 32, 35, 26, 30 }, { 34, 30, 33, 31 } };
		for (i = 0; i < sales.length; i++) {
			System.out.println("�~�ȭ�" + (i + 1) + "���~�Z��:");
			for (j = 0; j < sales[i].length; j++) {
				System.out.print(sales[i][j] + " ");
			}
			System.out.println();
		}
	}
}
