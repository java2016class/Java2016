package ch8;

public class Pra8_01 {
	public static void main(String[] args) {
		RectangleArea area = new RectangleArea();
		area.x = 30;
		area.y = 30;
		area.calc();
		RectanglePerimeter perimeter = new RectanglePerimeter();
		perimeter.x = area.x;
		perimeter.y = area.y;
		perimeter.calc();

		RectangleFunc func = new RectangleFunc();
		func.x = area.x;
		func.y = area.y;
		func.calcArea();
		func.calcPerimeter();
	}
}

class RectangleArea {
	int x = 5, y = 5;

	void calc() {
		System.out.println(x * y);
	}
}

class RectanglePerimeter {
	int x = 5, y = 5;

	void calc() {
		System.out.println((x + y) * 2);
	}
}

class RectangleFunc {
	int x, y;

	void calcArea() {
		System.out.println(x * y);
	}

	void calcPerimeter() {
		System.out.println((x + y) * 2);
	}
}