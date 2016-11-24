package test;

class Cake {
	int model;
	String flavor;

	Cake() {
		model = 0;
		flavor = "Unknown";
	}
}

public class TestCake {
	public static void main(String[] args) {
		Cake cake = new Cake();
		bake1(cake);
		System.out.println(cake.flavor + " ; " + cake.model);
		bake2(cake);
		System.out.println(cake.flavor + " ; " + cake.model);

	}

	public static Cake bake1(Cake c) {
		c.flavor = "Strawberry";
		c.model = 1200;
		return c;
	}

	public static void bake2(Cake c) {
		c.flavor = "Chocolate";
		c.model = 1230;
		return;
	}
}
