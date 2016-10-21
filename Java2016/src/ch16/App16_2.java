package ch16;

public class App16_2 {
	public static void main(String[] args) {
		CMember<Integer> obj1 = new CMember<>();
		//class隨著new物件時的指定型態而改變T值，有使用到泛型變數的都會自動轉換成指定型態
		CMember<String> obj2 = new CMember<>();
		obj1.setId(1);
		obj2.setId("String");
		obj1.show();
		obj2.show();
	}

	static class CMember<T> {//彈性大 但使用常用型態如int變數 則必須使用 Integer類別變數
		private T id;

		public void setId(T value) {
			id = value;
		}

		public void show() {
			System.out.println("id = " + id);
		}
	}
}
