package a803;

public class Q11 {
	public static void main(String[] args) {
		Q11 q11 = new Tell();
		Tell tellIt = new Tell();
		// q11.tellItLikeItIs(); //�����O�S��
		// (Truth)q11.tellItLikeItIs();//�~���j�ण��
		q11.show();
		((Truth) q11).tellItLikeItIs();
		tellIt.tellItLikeItIs();
		// (Truth)tellIt.tellItLikeItIs();//�~���j�ण��
		((Truth) tellIt).tellItLikeItIs();
	}

	void show() {
		System.out.println("Father");
	};
	// ���S���l��=����I�s�A���D�j��
	// �����l��=�I�s�l

}

class Tell extends Q11 implements Truth {

	public void show() {
		System.out.println("Son");
	};

	@Override
	public void tellItLikeItIs() {
		// TODO Auto-generated method stub
		System.out.println("Right on!");
	}

}

interface Truth {
	void tellItLikeItIs();
}