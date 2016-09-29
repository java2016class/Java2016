package ch09;

public class App9_10 {
	public static void main(String[] args) {
		CCCCircle cir1 = new CCCCircle(2.0);
		CCCCircle cir2 = new CCCCircle(2.1);
		cir1.compare(cir2);
	}
}

class CCCCircle {
	private static double pi = 3.14;
	private double radius;

	public CCCCircle(double r) {
		radius = r;
	}

	public void compare(CCCCircle circle) {
		if (this.radius == circle.radius) { // 這裡的private 因為使用同一個class，所以可以呼叫私有化變數或函數
			System.out.println("radius are equal");
		} else {
			System.out.println("radius are not equal");
		}
	}
}
