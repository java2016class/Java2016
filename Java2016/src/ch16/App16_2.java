package ch16;

public class App16_2 {
	public static void main(String[] args) {
		CMember<Integer> obj1 = new CMember<>();
		//class�H��new����ɪ����w���A�ӧ���T�ȡA���ϥΨ�x���ܼƪ����|�۰��ഫ�����w���A
		CMember<String> obj2 = new CMember<>();
		obj1.setId(1);
		obj2.setId("String");
		obj1.show();
		obj2.show();
	}

	static class CMember<T> {//�u�ʤj ���ϥα`�Ϋ��A�pint�ܼ� �h�����ϥ� Integer���O�ܼ�
		private T id;

		public void setId(T value) {
			id = value;
		}

		public void show() {
			System.out.println("id = " + id);
		}
	}
}
