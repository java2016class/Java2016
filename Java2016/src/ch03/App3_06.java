package ch3;

public class App3_06 {
 
 public static void main(String args[]){
	 char ch1 = 71;
	 char ch2 = 'G';
	 char ch3 = '\u0047';
	 char ch4 = 0x3e;
	 System.out.println(ch1);
	 System.out.println(ch2);
	 System.out.println(ch3);
	 System.out.println(ch4);
	 
	 String strs[] = {"1","2"};
	 String str = String.format("%s %s\n%s", "1","2",1+2+"");
	 System.out.println(str);
 }
 
}
