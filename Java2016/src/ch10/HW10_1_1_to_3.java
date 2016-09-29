package ch10;

public class HW10_1_1_to_3 {
	public static void main(String[] args) {
		Cbbb cbb = new Cbbb();
		cbb.set_num(5, 10);
		cbb.show();
		// 3(a)
		Caaa caa = new Caaa();
		System.out.println(caa.num1 + " ; " + caa.num2);
		// 3(b)
		caa = new Caaa(5, 10);
		System.out.println(caa.num1 + " ; " + caa.num2);
		// 3(c)
		cbb = new Cbbb(10, 5);
		cbb.show();
	}
}

class Caaa {
	public int num1;
	public int num2;

	Caaa() {
		num1 = 1;
		num2 = 1;
	}

	Caaa(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
}

class Cbbb extends Caaa {

	Cbbb() {
	}

	Cbbb(int a, int b) {
		super(a, b);
	}

	void set_num(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	void show() {
		System.out.println("num1 = " + num1 + " , num2 = " + num2);
	}
}
