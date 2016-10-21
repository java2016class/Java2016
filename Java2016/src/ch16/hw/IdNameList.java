package ch16.hw;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.List;

/**
 * 身分證檢驗機制
 * 
 * @author Odise
 */
public class IdNameList {

	// A123456789 is correct; A WZIO =10 B 11 C 12
	public static void main(String[] args) {
		System.out.println("身分證檢查結果: " + isChecked("a123456789"));
	}

	static boolean isChecked(String id) {
		int sum = 0, index;
		char ch;
		List<String> list = Arrays.asList(id.split(""));
		
			for(String str : list){
				System.out.println(str);
			}

		for (int i = 0; i < list.size(); i++) {
//			ch = id.toUpperCase().charAt(i);
			ch = list.get(i).toUpperCase().charAt(0);
			index = list.size() - i - 1;
			if (i == 0 && (ch != 'W' || ch != 'Z' || ch != 'I' || ch != 'O')) {
				sum += String.valueOf(ch - 55).charAt(0) - 48 + ((String.valueOf(ch - 55).charAt(1) - 48) * index);
			} else if (i > 0) {
				index = index == 0 ? 1 : index;
				sum += (ch - 48) * index;
			} else {
				switch (ch) {
				case 'W':
					sum += 3 + 2 * index;
					break;
				case 'Z':
					sum += 3 + 3 * index;
					break;
				case 'I':
					sum += 3 + 4 * index;
					break;
				case 'O':
					sum += 3 + 5 * index;
					break;
				}
			}
		}
		return sum % 10 == 0;
	}
}
