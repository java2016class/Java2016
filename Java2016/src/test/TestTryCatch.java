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
		} finally {// 不論有沒有錯誤都執行這段
			System.out.println("Hello");
		}
	}
}
