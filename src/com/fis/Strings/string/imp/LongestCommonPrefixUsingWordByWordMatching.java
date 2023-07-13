package com.fis.Strings.string.imp;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefixUsingWordByWordMatching {

	public static void main(String[] args) {

		Set<Character> set = new HashSet<>();
		String str = "aabcbcdbca";
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}

		String result = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				char temp[] = str.substring(i, j).toCharArray();
				//check if present.
			}
			//System.out.println("");
		}
	}

}
