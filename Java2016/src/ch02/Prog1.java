package ch02;

public class Prog1 {

	public static void main(String args[]) {
		
//		String str[] = new String[10];
		String str[] = {""};
		str[0] = "123";
		
//		String[] strs = new String[10];
		String[] strs = {""};
		strs[0] ="456";
		
		System.out.println(str[0]+" "+strs[0]);
		
		System.out.println("Hello " + 1 + 2 * 5);
		System.out.println(args[0] + " " + args[1]); //使用run configurations 設定參數

	}

}
