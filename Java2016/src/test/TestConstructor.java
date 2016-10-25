package test;

import a803.Q187;

public class TestConstructor {
	public static void main(String[] args) {
		new Q187(); //建構子如已建立則想呼叫空建構子就必須設定
	}
	
}
class Test{
	public Test(){} 
	public Test(int x){}
}