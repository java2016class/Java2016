package ch09;

public class Pra9_01 {
public static void main(String[] args) {
Cstudent peter = new Cstudent(50,152);
}
}

class Cstudent {
	private int weight, height, type;

	public Cstudent() {

	}

	public Cstudent(int weight) {
		this.weight = weight;
		type = 1;
	}

	public Cstudent(int height,boolean t) {
		this.height = height;
		type = 2;
	}

	public Cstudent(int weight, int height) {
		this.weight = weight;
		this.height = height;
		type = 3;
	}

	public void show() {
		switch (type) {
		case 1:
			if (weight > 40 && weight < 150)
				System.out.println("��n");
			else
				System.out.println("�L���ιL��");
			break;
		case 2:
			if (height > 50 && height < 250)
				System.out.println("�ӭ�");
			else
				System.out.println("�G�H�Υ��H");
			break;
		case 3:
			System.out.println("���� : " + height + " , �魫 : " + weight);
			break;
		}
	}
}
