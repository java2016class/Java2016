package ch06;

public class App6_EX_01 {
	public static void main(String[] args) {
		int a[][][] = { 
				{ { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 0, 10, 11, 12, 13, 14 } },
				{ { 15, 16, 17 }, { 18, 19 }, { 20, 21, 22, 23, 24 } } ,
				{{25,26,27},{28,29}}
				};

		int z=0,j=0,k=0;
		for (int[][] is : a) {
			k=0;
			j=0;
			for (int[] is2 : is) {
				for (int i : is2) {
					System.out.println("a["+z+"]["+j+"]["+k+++"]value=" + i);
				}
				k=0;
				j++;
			}
			j=0;
			z++;
		}
	}
}
