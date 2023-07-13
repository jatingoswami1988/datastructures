package com.fis.Strings;

import java.util.Arrays;

class Anagram {
	
	//// Silent  <- >Listen

	static boolean areAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		int value = 0;

		for (int i = 0; i < str1.length(); i++) {
			value = value ^ (int) str1.charAt(i);
			System.out.println(value);
			value = value ^ (int) str2.charAt(i);
			System.out.println(value);

		}

		return value == 0;

	}
	
	// A-Z 60-95 , a-z 97-126

	public static void main(String[] args) {
		String str1 = "geeksforgeeks";
		String str2 = "forgeeksgeeks";
		char c1[] = str1.toCharArray();
		char c2[] = str2.toCharArray();

		int count1[] = new int[256];
		int count2[] = new int[256];

		for (int i = 0; i < str1.length() && i < str2.length(); i++) {
			count1[c1[i]]++;
			count2[c2[i]]++;
		}

		for (int i = 0; i < 256; i++) {
			if (count1[i] != count2[i]) {
				// return false;
			}
		}

		//// Sort both the string and then compare

		/*
		 * if (areAnagram(str1, str2))
		 * System.out.println("The two strings are anagram of each other"); else
		 * System.out.println("The two strings are not anagram of each other");
		 */

		String arr[] = { "geeksquiz", "geeksforgeeks", "abcd", "forgeeksgeeks", "zuiqkeegs" };
		char c[] = { 'a', 'f', 'd' };
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		/// comparison linear time.

	}
}
