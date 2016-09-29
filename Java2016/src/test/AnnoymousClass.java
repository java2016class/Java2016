package test;

public class AnnoymousClass {
	public static void main(String[] args) {
		(new Caaa() {
			void setNum(int num) {
				this.num = num;
				System.out.println("num = " + num);
			}
		}).setNum(5); //使用匿名類別的方式，內部建立一個只能用一次的方法
	}

	static class Caaa {
		int num;
	}
}
