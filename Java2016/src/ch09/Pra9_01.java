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
				System.out.println("剛好");
			else
				System.out.println("過重或過輕");
			break;
		case 2:
			if (height > 50 && height < 250)
				System.out.println("帥哥");
			else
				System.out.println("矮人或巨人");
			break;
		case 3:
			System.out.println("身高 : " + height + " , 體重 : " + weight);
			break;
		}
	}
}
