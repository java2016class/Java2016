package ch7;

public class App7_03 {
	public static void main(String[] args) {
		System.out.println(show_length(8, 4));
		System.out.println(show_square(8, 4));

	}

	public static double show_length(int m, int n) {
		return Math.sqrt(m * m + n * n);
	}
	
	public static double show_square(int m,int n){
		return m*n;
	}
	
	public static double show_lengths(int m, int n){
		return (m+n)*2;
	}
}
