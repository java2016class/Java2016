package test;

public class TestMultiInnerClass {
	public static void main(String[] args) {
		new FirstClass().show();
		new SecondClass().show();
		new ThirdClass().show();

	}

	public static class FirstClass {//內部class要加static，但是這樣會增加記憶體占用率
		void show() {
			System.out.println("First class");
		}
	}

	public static class SecondClass {
		void show() {
			System.out.println("Second class");
		}
	}

}

class ThirdClass {//寫在主class之外的引用不用寫static，等同另外一個.java檔案，但不能用公開來搶佔主class的地位
	void show() {
		System.out.println("Third class");
	}
}
