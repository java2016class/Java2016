package a803;

public class Q68 { //題目有問題
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String h1 = "HelloWorld";
		sb.append("Hello").append("World");

		if (h1 == sb.toString())
			System.out.println("They match");

		if (h1.equals(sb.toString()))
			System.out.println("They Really match");
	}
}
