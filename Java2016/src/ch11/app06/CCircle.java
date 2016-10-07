package ch11.app06;

public class CCircle implements iShape2D, iColor {
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
