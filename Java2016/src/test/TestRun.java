package test;

public class TestRun {
public static void main(String[] args) {
	
	new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Hello1");
		}
	}.run();
	
	
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Hello2");
		}
	};
	runnable.run();
}
}
