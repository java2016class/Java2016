package ch11.hw_11_4;

interface Data {
	void best();

	void failed();
}

interface Test extends Data {
	void showData();

	double average();
}

class CStu implements Test {
	protected String name;
	protected int math;
	protected int english;

	private double average;
	private boolean failedMath;
	private boolean failedEnglish;
	private boolean bestGrade;

	CStu(String name, int math, int english) {
		this.name = name;
		this.math = math;
		this.english = english;
	}

	void show() {
		this.showData();
		this.best();
		this.failed();
	}

	@Override
	public void best() {
		// TODO Auto-generated method stub
		bestGrade = math > english;
		System.out.printf("%s��%s��%s�n\n", name, (bestGrade ? "�ƾ�" : "�^��"), (!bestGrade ? "�ƾ�" : "�^��"));
	}

	@Override
	public void failed() {
		// TODO Auto-generated method stub
		failedMath = math < 60;
		failedEnglish = english < 60;
		if (failedMath) {
			System.out.printf("%s��%s���F\n", name, "�ƾ�");
		} else if (failedEnglish) {
			System.out.printf("%s��%s���F\n", name, "�^��");
		}
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		average = this.average();
		System.out.println("�m�W:" + name + "\n�ƾǦ��Z:" + math + "\n�^�妨�Z:" + english + "\n�������Z:" + average);
	}

	@Override
	public double average() {
		// TODO Auto-generated method stub
		return (math + english) / 2.0;
	}

}

public class HW11_4_12 {
	public static void main(String[] args) {
		CStu stu = new CStu("Judy", 58, 91);
		stu.show();
	}
}
