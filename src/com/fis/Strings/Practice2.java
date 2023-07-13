package com.fis.Strings;

public class Practice2 {

	public static void main(String[] args) {

		char ch[] = new char[256];
		String str = "ACCBA10D2EW30"; //// AABCCDEW6
		char c[] = str.toCharArray();
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				ch[str.charAt(i)]++;
			} else {
				sum = sum + str.charAt(i) - '0';
			}
		}
		
		for(int i=0;i<str.length();i++) {
			System.out.println(ch[str.charAt(i)]);
		}
		
		/*for(int j=0;j<256;j++) {
			while(ch[j] >= 0) {
				System.out.println(ch[j]);
			}
		}*/

	}

}
