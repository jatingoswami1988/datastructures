package com.fis.Strings.string;

import java.util.TreeMap;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {

		String name = "forgeeksskeegfor";
		char c[] = name.toCharArray();
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		for (int i = 0; i < c.length; i++) {
			for (int j = 1; j < c.length; j++) {
				CharSequence seq = name.substring(i, j);
				if (checkIfPallindrome(seq.toString().toCharArray())) {
					map.put(seq.length(),seq.toString());
				}
			}
		}
		System.out.println(map);
	}

	private static boolean checkIfPallindrome(char[] charArray) {
		for (int i = 0; i < charArray.length / 2; i++) {
			if (charArray[i] != charArray[charArray.length - 1 - i]) {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}

}
