package a803;

public class Q35 {
	public static void main(String[] args) {
		//803題目有誤 int ii=0 應放置於如下位置
		String[] table = { "aa", "bb", "cc" };
		int i = 0;
		for (String string : table) {
			// int i=0; 錯誤位置 零輸出
			while (i < table.length) {
				System.out.println(i);
				i++;
				break;
			}
		}
	}
}
