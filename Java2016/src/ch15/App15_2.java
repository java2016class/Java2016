package ch15;

public class App15_2 extends Thread {

	public static void main(String[] args) {
		CTest test = new CTest("Try1");
		CTest test2 = new CTest("Try2");
		System.out.println(test.getPriority());
		System.out.println(test2.getPriority());
		test.start();// 使用start才可將改寫的run丟入排序執行，也才會出現交錯執行的狀態
		test2.start();// 直接執行run則僅僅只是跑程序，亦即A執行完才換B
		// 使用Thread(class)還是Runnable(interface)? 就看該類別有沒有繼承其他class決定
		// 前者是改寫run後者是實作run
		// 執行序由wait()凍結時可用notify()解凍
		// InterruptedException 中斷的Exception
		// 執行stop即會銷毀Thread
		// join 也會產生凍結執行緒的狀態，可讓原來的執行緒暫停直到這個執行序結束
		// Priority 1~10 10為最優先執行
		// Synchronized 同步，多個執行緒存取同一變數時容易產生不可預期之錯誤，所以需要使用sync進行同步
		// 一次只允許一個執行緒進入存取
	}
}

class CTest extends Thread {
	private String id;

	public CTest(String id) {
		this.id = id;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 100000000; j++)
				;
			System.out.println(id + " is running...");
		}
	}

}
