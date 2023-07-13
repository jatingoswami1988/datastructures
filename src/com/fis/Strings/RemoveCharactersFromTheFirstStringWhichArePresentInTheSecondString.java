package com.fis.Strings;

public class RemoveCharactersFromTheFirstStringWhichArePresentInTheSecondString {

	public static void main(String[] args) {

		String str = "geeksforgeeks";
		String mask_str = "mask";
		// System.out.println(removeDirtyChars(str, mask_str));
		remove(str, mask_str);

	}

	private static void remove(String str, String mask_str) {
		int count[] = new int[256];

		for (int i = 0; i < mask_str.length(); i++) {
			count[mask_str.charAt(i)]++;
		}

		for (int i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 0) {
				System.out.print(str.charAt(i));
			}
		}

	}

	private static String removeDirtyChars(String str, String mask_str) {

		char c[] = new char[256];

		for (int i = 0; i < mask_str.length(); i++) {
			c[mask_str.charAt(i)]++;
		}
		StringBuilder s = new StringBuilder();
		int i = 0;
		while (i < str.length()) {
			if (c[str.charAt(i)] > 0) {
				// s.deleteCharAt(i);
			} else {
				s.append(str.charAt(i));
			}
			i++;
		}

		return s.toString();
	}

}
