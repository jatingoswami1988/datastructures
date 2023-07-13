package com.fis.Strings;

public class Practice {

	public static void main(String[] args) {

		String str = "geeksforgeeks";

		int count[] = new int[256];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
		
		for(int i=0;i<str.length();i++) {
			while(count[str.charAt(i)]-- > 0) {
				System.out.print(str.charAt(i));
			}
		}
	}
}
