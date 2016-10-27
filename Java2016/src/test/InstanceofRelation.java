package test;

public class InstanceofRelation {
	public static void main(String[] args) {
		MultiImpl multi = new MultiImpl();
		boolean chk = (multi instanceof Rect); //檢查是否有繼承關係?
		System.out.println(chk);
	}


}
