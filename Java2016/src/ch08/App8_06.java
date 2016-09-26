package ch08;

public class App8_06 {

	public static void main(String[] args) {
		CCircle circle = new CCircle();
		circle.radius = 2.0;
		circle.show_all();
	}
}

class CCircle {
	double pi = 3.14;
	double radius;

	void show_area() {
		System.out.println("area = " + pi * radius * radius);
	}

	void show_all() {
		System.out.println("radius = " + radius);
		show_area();
	}
}
