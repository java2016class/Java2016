package a803;

public class Q73 {
	public static void main(String[] args) {
		one();
	}

	static void one() {
		two();
		Q73.two();
//		three();
//		Q73.four();
	}

	static void two() {
	}

	void three() {
		one();
		Q73.two();
		four();
		// Q73.four();
	}

	void four() {
	}
}
