package ch14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class App14_3_10 {
	//數字輸出方法為亂碼，因為輸出的方法是使用字元，若要數字正確則需先轉換成String
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\random.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		for (int i = 0; i < 1000; i++) {
			bw.write(Integer.toString((int) (Math.random() * 100000 + 1)));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		fw.close();

		System.out.println("寫入隨機數字1000個完成");

		FileReader fr = new FileReader("D:\\random.txt");
		BufferedReader br = new BufferedReader(fr);
		int[] array = new int[1000];
		String temp;
		int counter = 0;
		while ((temp = br.readLine()) != null) {
			array[counter++] = Integer.parseInt(temp);
		}
		br.close();
		fr.close();

		Arrays.sort(array);

		System.out.println("讀取並排序數字完成");

		fw = new FileWriter("D:\\random_sort.txt");
		bw = new BufferedWriter(fw);

		for (int i : array) {
			bw.write(String.valueOf(i));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		fw.close();

		System.out.println("排序檔案寫出完畢");
	}
}
