package ch08;

public class App8_07 {
	public static void main(String[] args) {
		CCircles circle = new CCircles();
		circle.set_area(5);
		circle.show_area();
	}
}

class CCircles {
	double pi = 3.14;
	double radius;

	void show_area() {
		System.out.println("radius = " + radius);
		System.out.println("area = " + pi * radius * radius);
	}

	void set_area(double r) {
		radius = r;
	}
}
