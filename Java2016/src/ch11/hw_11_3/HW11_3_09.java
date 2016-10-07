package ch11.hw_11_3;

public class HW11_3_09 {
	public static void main(String[] args) {
		Compute cmp = new Compute();
		cmp.mul(3, 5);
		cmp.show();
		cmp.mod(14, 5);
		cmp.show();
		cmp.fac(5);
		cmp.show();
	}
}

interface Math {
	void show();

	void add(int a, int b); // cal a+b

	void sub(int a, int b); // cal a-b

	void mul(int a, int b); // cal a*b

	void div(int a, int b); // cal a/b
}

interface AdvanceMath {
	void mod(int a, int b); // ­pºâa%b;

	void fac(int a); // ­pºâa!

	void pow(int a, int b); // ­pºâa^b
}

class Compute implements Math, AdvanceMath {

	private int a, b, sum;

	int facCalc(int a) {
		if (a != 0)
			return a * facCalc(a - 1);
		else
			return 1;
	}

	@Override
	public void mod(int a, int b) {
		// TODO Auto-generated method stub
		sum = a % b;
	}

	@Override
	public void fac(int a) {
		// TODO Auto-generated method stub
		sum = facCalc(a);

	}

	@Override
	public void pow(int a, int b) {
		// TODO Auto-generated method stub
		for (int i = 0; i < b; i++) {
			if (sum == 0)
				sum = a * a;
			else
				sum *= a;
		}

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("ans = " + sum);
		sum = 0;
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		sum = a + b;
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		sum = a - b;
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		sum = a * b;
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		sum = a / b;
	}

}
