package ch08;

public class Pra8_04 {
	public static void main(String[] args) {
		CSphere sphere = new CSphere();
		sphere.setLocation(3, 4, 5);
		sphere.setRadius(1);
		System.out.println("圓球表面積 : "+sphere.surfaceArea());
		System.out.println("圓球體積 : "+sphere.volume());
		sphere.showCenter();
	}

}

class CSphere {
	private int x, y, z, radius;

	void setLocation(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	void setRadius(int r) {
		radius = r;
	}

	double surfaceArea() {
		return 4 * Math.PI * radius * radius;
	}

	double volume() {
		return 4.0 / 3 * Math.PI * radius * radius * radius;
	}

	void showCenter() {
		System.out.println("圓心 : x = " + x + " , y = " + y + " , z = " + z);
	}
}