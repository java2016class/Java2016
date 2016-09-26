package test;

public class TestMultiInnerClass {
	public static void main(String[] args) {
		new FirstClass().show();
		new SecondClass().show();
		new ThirdClass().show();

	}

	public static class FirstClass {//����class�n�[static�A���O�o�˷|�W�[�O����e�βv
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

class ThirdClass {//�g�b�Dclass���~���ޥΤ��μgstatic�A���P�t�~�@��.java�ɮסA������Τ��}�ӷm���Dclass���a��
	void show() {
		System.out.println("Third class");
	}
}
