package a803;

public class Q35_Error {
	public static void main(String[] args) {
		//803題目有誤 int ii=0 應放置於如下位置
		String[] table = { "aa", "bb", "cc" };
		int ii = 0;
		for (String string : table) {
			// int ii=0; 錯誤位置 零輸出
			while (ii < table.length) {
				System.out.println(ii);
				ii++;
				break;
			}
		}
	}
}
