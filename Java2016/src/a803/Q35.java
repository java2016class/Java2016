package a803;

public class Q35 {
	public static void main(String[] args) {
		//803�D�ئ��~ int ii=0 ����m��p�U��m
		String[] table = { "aa", "bb", "cc" };
		int i = 0;
		for (String string : table) {
			// int i=0; ���~��m �s��X
			while (i < table.length) {
				System.out.println(i);
				i++;
				break;
			}
		}
	}
}
