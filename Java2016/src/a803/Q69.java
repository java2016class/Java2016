package a803;

public class Q69 {// 題目敘述有誤
	public static void main(String[] args) {
		try {
			doStuff();
			System.out.println("1");
		} catch (RuntimeException e) {
			System.out.println("2");
		}
	}

	public static void doStuff() {
		if (Math.random() > 0.5)
			throw new RuntimeException();
		doMoreStuff();
		System.out.println("3 ");
	}

	public static void doMoreStuff() {
		System.out.println("4");
	}
}
