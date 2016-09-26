package ch02;

public class Constant {

	public static void main(String args[]) {

		// 請務必記得溢位處理為由正轉負(32767+1>>>-32768)
		long longNum = java.lang.Long.MAX_VALUE;
		int intNum = Integer.MAX_VALUE;
		short shortNum = Short.MAX_VALUE;
		byte byteNum = Byte.MAX_VALUE;
		System.out.println("longNum MAX " + longNum);
		System.out.println("longNum MAX " + (longNum + 1));
		System.out.println("intNum MAX " + intNum);
		System.out.println("intNum MAX " + (intNum + 1));
		System.out.println("shortNum MAX " + shortNum);
		System.out.println("shortNum MAX " + (shortNum + 1));
		System.out.println("byteNum MAX " + byteNum);
		System.out.println("byteNum MAX " + (byteNum + 1));
	}
}
