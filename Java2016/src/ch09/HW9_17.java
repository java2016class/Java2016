package ch09;

public class HW9_17 {
	public static void main(String[] args) {
		Namecard first = new Namecard("Andy", "123City", "2345-6789", "0911-336600");
		first.show();
	}

	static class Namecard {
		private String name;
		private String address;
		private Phone data;

		Namecard(String name, String address, String company, String cell) {
			this.name = name;
			this.address = address;
			data = new Phone(company, cell);
		}

		void show() {
			System.out.printf("�n�ͩm�W:%s\n�p���a�}:%s\n���q�q��:%s\n������X:%s\n", name, address, data.company, data.cell);
		}
	}

	static class Phone {
		String company;
		String cell;

		Phone(String s1, String s2) {
			company = s1;
			cell = s2;
		}
	}
}
