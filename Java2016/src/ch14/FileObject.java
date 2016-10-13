package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileObject {
	public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("D:\\files.tmp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new CMyStudent("S123456", "odise", 90, 80, 99));
		oos.writeObject(new CMyStudent("S123457", "odise2", 80, 70, 87));
		oos.writeObject(new CMyStudent("S123458", "odise3", 99, 59, 79));
		oos.close();
		fos.close();

		FileInputStream fis = new FileInputStream("D:\\files.tmp");
		ObjectInputStream ois = new ObjectInputStream(fis);
		CMyStudent st;
		while (fis.available() > 0) {
			// 不能直接使用ois內的available，但可用fis內的avaiable來做迴圈終止的動作
			// 以避免出現EOFException
			st = (CMyStudent) ois.readObject();
			st.computSum();
			System.out.println(st.toString());
		}
		ois.close();
		fis.close();

	}
}

class CMyStudent implements Serializable {
	// 無定義 serial也可以

	private String id;
	private String name;
	private int scoreMath, scoreEng, scoreComputer;
	private int total;

	public CMyStudent(String str1, String str2, int i, int j, int k) {
		id = str1;
		name = str2;
		scoreMath = i;
		scoreEng = j;
		scoreComputer = k;

	}

	public void computSum() {
		total = scoreMath + scoreEng + scoreComputer;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name + " " + scoreMath + "," + scoreEng + "," + scoreComputer + "," + total;
	}
}
