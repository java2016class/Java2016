package test;


public class TestAAA{
	public static void main(String[] args) throws Exception {
		TestRun2 ref1 = new TestRun2(50);
		TestRun2 ref2 = new TestRun2(125);
		TestRun2 ref3 = new TestRun2(100);
		try{
		ref1.doPrint();
		throw new Exception();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage()+" 0");
		}
		ref2.doPrint();
		ref3.doPrint();
		
		System.out.println(28+5<=4+29);
		
		int[][] a = new int[2][];
		int[][] b = new int[2][0];
	}
}

class TestRun2 {
	int ns;
	static int s;

	public TestRun2(int ns) {
		// TODO Auto-generated constructor stub
		if (s < ns) {
			s = ns;
			this.ns = ns;
		}
	}

	void doPrint() {
		System.out.println("ns = " + ns + "s = " + s);
	}
}
