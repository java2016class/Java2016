package test;

public class StaticTest {
	int test1 = 0; //實例變數
	static int test2 = 12; //類別變數

	public static void main(String[] args) { 
		TestS.test3 = 12; //static 可直接被呼叫;
		
		TestS test1 = new TestS();
		test1.test3++;
		TestS test2 = new TestS();
		test2.test3++;
		System.out.println(TestS.test3); //不同的參考位置，但使用類別變數的關係，使得值可以共用，這邊的值秀出來是14
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
	static int test3 = 10; //類別變數
}
