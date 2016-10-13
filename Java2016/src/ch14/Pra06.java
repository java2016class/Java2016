package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Pra06 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fi = new FileInputStream("D:\\android.png");
		FileOutputStream fo = new FileOutputStream("D:\\android_copy.png");
		//檔案已存在則覆蓋
		byte[] data = new byte[fi.available()];

		fi.read(data);
		fi.close();

		System.out.println("file read complete, size = " + data.length);

		fo.write(data);
		fo.close();
		
		System.out.println("file copy complete.");
	}
}
