package mysql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class B01 {
	public static void main(String[] args) {
		File file = new File("files\\85119301.SM1");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println(e1.getMessage());
		}

		String str;
		StringBuilder sb = new StringBuilder();
		String[][] strs2D;
		int count = 0;
		String[] titles = { "REG Nr", "SCORE1", "SCORE2", "SCORE3", "TOTAL", "AVG", "ORDER" };
		String[] splitLine = { "------", "------", "------", "------", "------", "------", "------" };

		String formats = "%6s \t%3s \t%3s \t%3s \t%3s \t%3s \t%3s\n";

		try {
			while ((str = br.readLine()) != null) {
				sb.append(str.replaceAll("\\s+", "-")).append(";");
				// 使用 \\s+ 將所有不同的空白字元取代
				count++;
			}
			String[] strTemp = sb.toString().split(";");
			strs2D = new String[count][];

			int i = 0;
			for (String string : strTemp) {
				System.out.println(string);
				strs2D[i++] = string.split("-");
			}

			// System.out.println(String.format(formats, titles));
			System.out.printf(formats, titles);
			System.out.printf(formats, splitLine);
			for (String[] strs : strs2D) {
				// System.out.println(String.format(formats, strs));
				System.out.printf(formats, strs);
			}

		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
