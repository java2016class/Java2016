package test;

public class TestTryCatch {
	public static void main(String[] args) {
		int x = 10;
		int[] array = new int[x];
		try {
			int get = array[x];
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception:" + e.getMessage());
		} finally {// ���צ��S�����~������o�q
			System.out.println("Hello");
		}
	}
}
