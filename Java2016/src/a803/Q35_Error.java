package a803;

public class Q35_Error {
	public static void main(String[] args) {
		//803�D�ئ��~ int ii=0 ����m��p�U��m
		String[] table = { "aa", "bb", "cc" };
		int ii = 0;
		for (String string : table) {
			// int ii=0; ���~��m �s��X
			while (ii < table.length) {
				System.out.println(ii);
				ii++;
				break;
			}
		}
	}
}
