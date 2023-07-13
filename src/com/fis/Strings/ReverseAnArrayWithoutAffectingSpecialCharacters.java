package com.fis.Strings;

import java.util.Arrays;

public class ReverseAnArrayWithoutAffectingSpecialCharacters {

	public static void main(String[] args) {

		////////////// Use Two Pointer technique
		
		String str = "a!!!b.c.d,e'f,ghi"; /// i!!!h.g.f,e'd,cba
		char c[] = str.toCharArray();
		char temp[] = new char[str.length()];

		int j = 0;
		for (int i = 0; i < c.length; i++) {
			if (isChar(c[i])) {
				temp[j] = c[i];
				j++;
			}
		}
		
		//Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
	}

	private static boolean isChar(char c) {
		if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
			return true;
		}
		return false;
	}

}
