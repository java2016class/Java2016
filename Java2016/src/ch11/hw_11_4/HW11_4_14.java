package ch11.hw_11_4;

import org.w3c.dom.css.CSS2Properties;

interface iVolume {
	void showData();

	double vol();
}

abstract class CShpere implements iVolume {
	double PI = 3.14;
	protected int x;
	protected int y;

}

class CCircle extends CShpere {

	@Override
	public void showData() {
		// TODO Auto-generated method stub

	}

	@Override
	public double vol() {
		// TODO Auto-generated method stub
		return PI * (x - y);
	}

}

public class HW11_4_14 {
	public static void main(String[] args) {
		CCircle cir = new CCircle();
		cir.showData();
	}
}
