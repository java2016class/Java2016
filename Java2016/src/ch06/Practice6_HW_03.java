package ch06;

public class Practice6_HW_03 {
	public static void main(String[] args) {
		int a[] = { 32, 11, 24, 48, 25 };
		int b[] = new int[5];
		int max = 0, temp = 0;

		for (int j = 0; j < b.length; j++) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] >= max) {
					if (temp!=0 && max == temp)
						continue;
					max = a[i];

				}
			}
			if (temp != max)
				temp = max;
			b[j] = max;
			max = 0;
		}
		System.out.printf("sort b[] = %d,%d,%d,%d,%d\n", b[0], b[1], b[2], b[3], b[4]);
	}
}
