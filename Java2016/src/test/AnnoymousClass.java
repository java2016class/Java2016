package test;

public class AnnoymousClass {
	public static void main(String[] args) {
		(new Caaa() {
			void setNum(int num) {
				this.num = num;
				System.out.println("num = " + num);
			}
		}).setNum(5); //�ϥΰΦW���O���覡�A�����إߤ@�ӥu��Τ@������k
	}

	static class Caaa {
		int num;
	}
}
