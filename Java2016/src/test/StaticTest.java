package test;

public class StaticTest {
	int test1 = 0;
	static int test2 = 12;

	public static void main(String[] args) { 

	}

	public static void show() { //類別函數，可直接呼叫
//		System.out.println(test1);//static 無法直接呼叫 實例變數
		System.out.println(test2);
//		shows();//static 無法直接呼叫 實例函數
		showss();
//		this.test1 = 0;   //類別函數無法使用this關鍵字
	}
	public void shows(){
		this.test1 = 0;   //實例函數可使用this
	}
	public static void showss(){
		
	}

}

class TestS {

}
