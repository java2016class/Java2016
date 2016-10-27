package ch09;

public class HW9_19 {
	public static void main(String[] args) {
		Data stu = new Data("Annie", 85, 92);
		stu.show();
	}

}

class Data {
	private String name;
	private Test score;

	Data(String name, int eng, int m) {
		this.name = name;
		score = new Test(eng, m);
	}

	void show() {
		System.out.printf("學生姓名:%s\n英文成績:%s\n數學成績:%s\n平均成績:%s\n", name, score.english, score.math, avg());
	}

	double avg() {
		return (score.english + score.math) / 2.0;
	}
}

class Test {
	int english;
	int math;

	Test(int eng, int m) {
		english = eng;
		math = m;
	}

//	double avg() {
//		return (english + math) / 2.0;
//	}
}
