package com.fis.Strings;

public class GivenTwoStringsFindFirstStringSubsequenceSecond {

	public static void main(String[] args) {

		String str1 = "AXY";
		String str2 = "ADXCPY";/// HashMap 

		int MAX_CHAR = 255;
		char ch[] = new char[MAX_CHAR];

		for (int i = 0; i < str2.length(); i++) {
			ch[str2.charAt(i)]++;
		}
		boolean flag = true;
		for (int i = 0; i < str1.length(); i++) {
			if (ch[str1.charAt(i)] <= 0) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("Substring");
		} else {
			System.out.println("Not Substring");
		}

	}

}
