package test;

public class AboutSuper {
	public static void main(String[] args) {
		Test02 test = new Test02();
		test.show();
		test.shows();
	}
}

class Test01 {
	static protected void show() {
		System.out.println("Hello");
	}
}

class Test02 extends Test01 {
	public static void main(String[] args) {
		show();
	}

	static protected void show() {
		System.out.println("Test");
	}

	void shows() {
		super.show();
	}
}
