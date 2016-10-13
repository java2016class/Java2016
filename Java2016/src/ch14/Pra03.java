package ch14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pra03 {
	public static void main(String[] args) throws IOException {
		String write = "­ë­ë®Õ¾ðxxdadasdsdasfafaffdfdfsdf";
		FileWriter writer = new FileWriter("D:\\testJava.txt");
		BufferedWriter bw = new BufferedWriter(writer);
		bw.write(write);
		bw.newLine();
		for (int i = 1; i < 5; i++) {
			bw.write(Double.toString(Math.random()));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		writer.close();

		FileReader reader = new FileReader("D:\\testJava.txt");
		BufferedReader br = new BufferedReader(reader);

		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = br.readLine()) != null) {
			sb.append(line).append("\n");
		}
		br.close();
		reader.close();
		System.out.println("Characters read = " + sb.toString().length());
		System.out.println(sb.toString());

	}
}
