package test;

import java.util.ArrayList;
import java.util.List;

public class FieldInit {
	String s;
	char c;
	boolean b;
	float f;
	
	static int x =0;
	
	static String args[] = {"a","n","c"};

	public void printAll() {
		System.out.println(s);
		System.out.println(c);
		System.out.println(b);
		System.out.println(f);
	}
	
	public static void getList(List list,int y){
		System.out.println(x);
		System.out.println(y);
	}
	
	public void x(){}

	public static void main(String[] args) {
		

		FieldInit f = new FieldInit();
		f.printAll();
		
		List list = new ArrayList<>();
		System.out.println(list.getClass());
		getList(list,123);		
		
	}
}
