package ch14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pra01 {
	public static void main(String[] args) throws IOException {
		String write = "卿卿校樹xxdadasdsdasfafaffdfdfsdf";
		char data[] = new char[128];
		FileWriter writer = new FileWriter("D:\\testJava.txt");
		writer.write(write);
		writer.close();
		
		FileReader reader = new FileReader("D:\\testJava.txt");
		int length = reader.read(data);
		String str = new String(data, 0, length);
		reader.close();
		System.out.println("Characters read = " + length);
		System.out.println(str);
	}
}
