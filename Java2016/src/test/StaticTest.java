package test;

public class StaticTest {
	int test1 = 0; //����ܼ�
	static int test2 = 12; //���O�ܼ�

	public static void main(String[] args) { 
		TestS.test3 = 12; //static �i�����Q�I�s;
		
		TestS test1 = new TestS();
		test1.test3++;
		TestS test2 = new TestS();
		test2.test3++;
		System.out.println(TestS.test3); //���P���ѦҦ�m�A���ϥ����O�ܼƪ����Y�A�ϱo�ȥi�H�@�ΡA�o�䪺�Ȩq�X�ӬO14
	}

	public static void show() { //���O��ơA�i�����I�s
//		System.out.println(test1);//static �L�k�����I�s ����ܼ�
		System.out.println(test2);
//		shows();//static �L�k�����I�s ��Ҩ��
		showss();
//		this.test1 = 0;   //���O��ƵL�k�ϥ�this����r
	}
	public void shows(){
		this.test1 = 0;   //��Ҩ�ƥi�ϥ�this
	}
	public static void showss(){
		
	}

}

class TestS {
	static int test3 = 10; //���O�ܼ�
}
