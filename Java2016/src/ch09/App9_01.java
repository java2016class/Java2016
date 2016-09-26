package ch09;

public class App9_01 {
	public static void main(String[] args) {
		CCircle cir1 = new CCircle(4.0);
		cir1.show();
	}

}

class CCircle {
	private double pi = 3.14;
	private double radius;

	public CCircle() {
	}

	public CCircle(double r) {
		radius = r;
	}

	public void show() {
		System.out.println("radius = " + radius + " , area = " + radius * pi * radius);
	}
}
