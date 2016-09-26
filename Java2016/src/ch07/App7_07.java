package ch07;

public class App7_07 {
	public static void main(String[] args) {
		int a[][] = { { 18, 32, 65, 27, 30 }, { 17, 56, 12, 66 } };
		int b[][];
		b=add10(a);
		
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	}

	public static int[][] add10(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] += 10;
			}
		}
		return arr;
	}
}
