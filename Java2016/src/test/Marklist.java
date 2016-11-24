package test;

public class Marklist {
	int num;

	public static void graceMarks(Marklist list) {
		list.num += 10;
	}

	public static void main(String[] args) {
		Marklist list1 = new Marklist();
		Marklist list2 = list1;
//		Marklist list1 = null;
		
	}
}
