package ch15;

public class App15_2 extends Thread {

	public static void main(String[] args) {
		CTest test = new CTest("Try1");
		CTest test2 = new CTest("Try2");
		System.out.println(test.getPriority());
		System.out.println(test2.getPriority());
		test.start();// �ϥ�start�~�i�N��g��run��J�Ƨǰ���A�]�~�|�X�{������檺���A
		test2.start();// ��������run�h�ȶȥu�O�]�{�ǡA��YA���槹�~��B
		// �ϥ�Thread(class)�٬ORunnable(interface)? �N�ݸ����O���S���~�Ө�Lclass�M�w
		// �e�̬O��grun��̬O��@run
		// ����ǥ�wait()�ᵲ�ɥi��notify()�ѭ�
		// InterruptedException ���_��Exception
		// ����stop�Y�|�P��Thread
		// join �]�|���ͭᵲ����������A�A�i����Ӫ�������Ȱ�����o�Ӱ���ǵ���
		// Priority 1~10 10�����u������
		// Synchronized �P�B�A�h�Ӱ�����s���P�@�ܼƮɮe�����ͤ��i�w�������~�A�ҥH�ݭn�ϥ�sync�i��P�B
		// �@���u���\�@�Ӱ�����i�J�s��
	}
}

class CTest extends Thread {
	private String id;

	public CTest(String id) {
		this.id = id;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 100000000; j++)
				;
			System.out.println(id + " is running...");
		}
	}

}
