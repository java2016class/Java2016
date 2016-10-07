package ch11.hw_11_4;

interface Show_ans {
	void show();
}

interface Math extends Show_ans {
	void add(int a, int b);

	void sub(int a, int b);

	void mul(int a, int b);

	void div(int a, int b);
}

class Compute implements Math {

	private float sum;

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("sum = " + sum);
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
		sum = (float) a / b;
	}

}

public class HW11_4_13 {
	public static void main(String[] args) {
		Compute cmp = new Compute();
		cmp.mul(3, 5);
		cmp.show();
		cmp.add(3, 5);
		cmp.show();
		cmp.sub(5, 3);
		cmp.show();
		cmp.div(10, 3);
		cmp.show();
	}
}
