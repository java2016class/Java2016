package ch14.hw;

	import java.io.*;
	import java.util.*;

	public class Test {

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

			int oper = 0, amt = 0;
			System.out.print("�п��(1) �s�J  (2) ��X  (3) ���} �G");
			Scanner scn = new Scanner(System.in);
			oper = scn.nextInt();

			while (oper != 3) {
				// System.out.println("The function code is " + op);
				System.out.print("�п�J���y�s�J�z�Ρy���ڡz�����B�G");
				amt = scn.nextInt();
				//System.out.print("The amount is " + amt);
				if(amt < 0){
					System.out.println("���B���i���t��!");
					continue;
				}

				FileOutputStream fos = new FileOutputStream("D://cat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				MyAccount myacnt = new MyAccount(amt);
				System.out.println("My balance in c:/cat= " + myacnt.getBalance());

				if (oper == 1) {
					myacnt.deposite(amt);
				} else {
					if ((myacnt.getBalance() - 100) < 0) {
						System.out.println("�z���s�ھl�B�����A�����L�k��X���B " + amt + " �� !!");
						continue;
					} else {
						myacnt.fetch(amt);
					}
				}

				oos.writeObject(myacnt);
				oos.flush();
				oos.close();

				try {

					MyAccount myacnt2;
					FileInputStream fis = new FileInputStream("D://cat");
					ObjectInputStream ois = new ObjectInputStream(fis);
					myacnt2 = (MyAccount) ois.readObject();
					ois.close();
					System.out.println("�z���̷s�l�B���G" + myacnt2.getBalance() + "\n");
				} catch (Exception e) {

				}

				System.out.print("�п��(1) �s�J  (2) ��X  (3) ���} �G");
				scn = new Scanner(System.in);
				oper = scn.nextInt();

				// switch (oper) {
				// case 1:
				// myacnt.deposite(amt);
				// break;
				// case 2:
				// if ((myacnt.getBalance() - 100) < 0) {
				// System.out.println("�l�B����!");
				// } else {
				// myacnt.fetch(amt);
				// }
				// break;
				// case 3:
				// break;
				// default:
				// break;
				// }
				// oos.writeObject(myacnt);
				// System.out.println("�z���̷s�l�B���G" + myacnt.getBalance() + "\n");
			}
			System.out.print("�{���Y�N�����A���´���!!");
		}

	}

	class MyAccount implements Serializable {
		private int balance = 1000;
		private int amount = 0;

		public MyAccount(int amt) {
			amount = amt;
		}

		public int getBalance() {
			return balance;
		}

		public void deposite(int amt) {
			balance += amt;
		}

		public void fetch(int amt) {
			balance -= amt;
		}
	}
