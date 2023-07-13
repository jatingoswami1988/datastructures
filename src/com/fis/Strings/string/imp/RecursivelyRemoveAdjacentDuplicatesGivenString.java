package com.fis.Strings.string.imp;

import java.util.HashMap;
import java.util.Map;

public class RecursivelyRemoveAdjacentDuplicatesGivenString {

	public static void main(String[] args) {

		String str = "azxxzy ";
		Map<Character, Integer> result = new HashMap<>();

		// 1stMethod
		for (int i = 0; i < str.length(); i++) {
			if (result.get(str.charAt(i)) != null) {
				result.put(str.charAt(i), result.get(str.charAt(i)) + 1);
			} else {
				result.put(str.charAt(i), 1);
			}
		}

		for (Map.Entry<Character, Integer> map : result.entrySet()) {
			if (result.get(map.getKey()) == 1) {
				System.out.println(map.getKey());
			}
		}

		// 2ndMethod

		int ch[] = new int[256];
		for (int i = 0; i < str.length(); i++) {
			ch[str.charAt(i)]++;
		}

		for (int i = 0; i < str.length(); i++) {
			if (ch[str.charAt(i)] == 1) {
				System.out.println(str.charAt(i));
			}
		}

		String finalStr = removeDuplicates(str, "");
	
	}

	private static String removeDuplicates(String str, String newStr) {

		if (str.length() == 0) {
			return newStr;
		}
		
		

		return null;
	}

}
