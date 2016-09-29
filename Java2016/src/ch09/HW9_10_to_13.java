package ch09;

public class HW9_10_to_13 {
	public static void main(String[] args) {
		CRational cr = new CRational();
		cr.setN(2);
		cr.setD(5);
//		cr.show();
		show(cr);
	}
	
	static void show(CRational cr){
		System.out.println(cr.n + "/" + cr.d);
	}

}

class CRational {
	public int n, d;

	public void setN(int num) {
		n = num;
	}

	public void setD(int num) {
		d = num;
	}

	public void setND(int num, int den) {
		n = num;
		d = den;
	}

	public void show() {
		System.out.println(n + "/" + d);
	}
}
