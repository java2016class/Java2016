package ch8;

public class Pra8_02 {
	public static void main(String[] args) {
		Car car = new Car();
		car.drivenDistance(10, 50);
		car.drivenDistance(8, 100);
	}
}

class Car {
	double consumption, capacity;

	void drivenDistance(double consumption, double capacity) {
		System.out.println(capacity * consumption);
	}
}
