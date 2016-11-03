package mysql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectSQL {
	public static void main(String[] args) {
		String strs2D[][] = loadingFile("D:\\test\\filetest.txt");
		// for (String[] strings : strs2D) {
		// for (String string : strings) {
		// System.out.print(string + ",");
		// }
		// System.out.println();
		// }
		System.out.println("File loading success.");

		Operations conn = new Operations();
		for (String[] strings : strs2D) {
			conn.delData(strings);
		}
		for (String[] strings : strs2D) {
			conn.writeData(strings);
		}
		conn.readData();

	}

	public static String[][] loadingFile(String path) {
		File file = new File(path);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}

		int count = 0;
		String str;
		String[][] strs2D;
		StringBuilder sb = new StringBuilder();
		try {
			while ((str = br.readLine()) != null) {
				sb.append(str).append(";");
				count++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] strTemp = sb.toString().split(";");
		strs2D = new String[count][];

		int i = 0;
		for (String string : strTemp) {
			// System.out.println(string);
			strs2D[i++] = string.split(",");
		}
		return strs2D;
	}
}

class Operations {
	Connection conn;

	public Operations() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost", "odise", "116025");
			conn.createStatement().executeUpdate("CREATE SCHEMA IF NOT EXISTS pra");
			conn.createStatement()
					.executeUpdate("CREATE TABLE IF NOT EXISTS pra.people (" + "  NUMBER VARCHAR(20) NULL,"
							+ "  NAME VARCHAR(20) NULL," + "  DATE VARCHAR(60) NULL," + "  WEIGHT FLOAT)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	public boolean writeData(String[] people) {
		String insert = "insert into pra.people (NUMBER,NAME,DATE,WEIGHT) values(?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(insert);
			ps.setString(1, people[0]);
			ps.setString(2, people[1]);
			ps.setString(3, people[2]);
			ps.setFloat(4, Float.parseFloat(people[3]));
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return true;
	}

	public boolean delData(String[] people) {
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("DELETE from pra.people WHERE NUMBER=?");

			ps.setString(1, people[0]); // % 模糊搜尋
			ps.executeUpdate();
			System.out.println("Del data");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean readData() {
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("select * from pra.people where number LIKE ?");

			ps.setString(1, "%" + "" + "%"); // % 模糊搜尋
			ResultSet rs = ps.executeQuery();
			System.out.println("Read data");
			while (rs.next()) {
				System.out.print(rs.getString(1) + " , ");
				System.out.print(rs.getString(2) + " , ");
				System.out.print(rs.getString(3) + " , ");
				System.out.println(rs.getString(4));
			}
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return false;
		}
	}
}
