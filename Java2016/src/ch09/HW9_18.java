package ch09;

public class HW9_18 {
	public static void main(String[] args) {
		(new CCircle(5.0) {
			void show() {
				System.out.println("Area = " + pi * radius * radius);
			}
		}).show();
	}

	static class CCircle {
		public double pi = 3.14;
		public double radius;

		public CCircle(double r) {
			radius = r;
		}
	}
}
