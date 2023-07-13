package com.fis.Strings.string.imp;

import java.util.*;

public class PrintSubsequencesString {

	public static List<String> list = new ArrayList<>();

	public static void main(String[] args) {
		String s = "abcd";
		findsubsequences(s, ""); // Calling a function
		System.out.println(list);
	}

	private static void findsubsequences(String string, String ans) {
		if (string.length() == 0) {
			list.add(ans);
			return;
		}

		// We add adding 1st character in string
		findsubsequences(string.substring(1), ans + string.charAt(0));

		// Not adding first character of the string
		// because the concept of subsequence either
		// character will present or not
		findsubsequences(string.substring(1), ans);
	}
}
