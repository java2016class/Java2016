package test;

public class A implements C {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A";
	}

	public static void main(String[] args) {
		B myB = new B();
		A myA = myB;
		C myC = myA;
	}

}
