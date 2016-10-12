package a803;

public class Q47 {
	int z;

	public static void main(String[] args) {
		Q47 q47 = new Q47();
		int z = 6;
		System.out.println(z);
		q47.doStuff();
		System.out.println(z);
		System.out.println(q47.z);
	}

	void doStuff() {
		int z = 5;
		doStuff2();
		System.out.println(z);
	}

	void doStuff2() {
		z = 4;
	}
}
