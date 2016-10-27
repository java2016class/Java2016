package a803;

public class Q11 {
	public static void main(String[] args) {
		Q11 q11 = new Tell();
		Tell tellIt = new Tell();
		// q11.tellItLikeItIs(); //父類別沒有
		// (Truth)q11.tellItLikeItIs();//外部強轉不行
		q11.show();
		((Truth) q11).tellItLikeItIs();
		tellIt.tellItLikeItIs();
		// (Truth)tellIt.tellItLikeItIs();//外部強轉不行
		((Truth) tellIt).tellItLikeItIs();
	}

	void show() {
		System.out.println("Father");
	};
	// 父沒有子有=不能呼叫，除非強轉
	// 父有子有=呼叫子

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