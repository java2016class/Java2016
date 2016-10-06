package ch11;

public class App11_06 {
	public static void main(String[] args) {
		CCircle cir = new CCircle(2.0);
		cir.setColor("Red");
		cir.area();
	}
}

class CCircle implements iShape2D, iColor {
	double radius;
	String color;

	public CCircle(double r) {
		// TODO Auto-generated constructor stub
		radius = r;
	}

	@Override
	public void setColor(String str) {
		// TODO Auto-generated method stub
		color = str;
		System.out.println("color = " + color);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("area = " + PI * radius * radius);
	}

}

interface iShape2D {
	double PI = 3.14;

	void area();
}

interface iColor {
	void setColor(String str);
}