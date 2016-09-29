package ch09;

public class App9_04 {
	public static void main(String[] args) {
		CCCircle ccc = new CCCircle("RED", 2.0);
		ccc.show();
	}
}

class CCCircle {
	private String color;
	private double pi = 3.14;
	private double radius;

	private CCCircle() {
		System.out.println("private");
	}

	public CCCircle(String str, double r) {
		this();
		color = str;
		radius = r;
	}

	public void show() {
		System.out.println("color = " + color + " , Radius = " + radius);
		System.out.println("area = " + pi * radius * radius);
	}

}
