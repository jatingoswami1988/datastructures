package com.fis.Strings;

public class Test {

	public static void main(String[] args) {

		String txt = "AABBAABA";
		String pat = "AABB";
		for (int i = 0; i < txt.length() - pat.length(); i++) {
			CharSequence temp = txt.subSequence(i, pat.length());
			if (temp.equals(pat)) {
				System.out.println("Pattern present");
			}
		}
	}
}
