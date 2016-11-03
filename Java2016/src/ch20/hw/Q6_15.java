package ch20.hw;

public class Q6_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Duke";
		char str2[] = { 'D', 'u', 'k', 'e' };
		String s3 = null;
		String s4 = "null";
		System.out.println(s4.equals(s3));
		System.out.println(s3);
		System.out.println(s4);
		for (char c : str2) {
			System.out.println(c);
			s3 = s3 + c;
		}
		System.out.println(s1.toString());
		System.out.println();
		System.out.println();
		System.out.println(s3.toString());
		if (s3.equals(s1))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
