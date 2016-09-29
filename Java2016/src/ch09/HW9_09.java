package ch09;

public class HW9_09 {
	public static void main(String[] args) {
		CCCCCCircle cir1 = new CCCCCCircle(3.0);
		CCCCCCircle cir2 = new CCCCCCircle(5.0);
		CCCCCCircle obj;

		obj = compare(cir1,cir2);
		if (cir1 == obj)
			System.out.println("radius of cir1 is larger");
		else
			System.out.println("radius of cir2 is larger");
	}

	static CCCCCCircle compare(CCCCCCircle circle1, CCCCCCircle circle2) {
		return circle1.radius > circle2.radius ? circle1 : circle2;
	}
}

class CCCCCCircle {
	private static double pi = 3.14;
	public double radius;

	public CCCCCCircle(double r) {
		radius = r;
	}
}
