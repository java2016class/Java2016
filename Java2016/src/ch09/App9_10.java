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
		if (this.radius == circle.radius) { // �o�̪�private �]���ϥΦP�@��class�A�ҥH�i�H�I�s�p�����ܼƩΨ��
			System.out.println("radius are equal");
		} else {
			System.out.println("radius are not equal");
		}
	}
}
