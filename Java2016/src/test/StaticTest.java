package test;

public class StaticTest {
	int test1 = 0;
	static int test2 = 12;

	public static void main(String[] args) { 

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

}
