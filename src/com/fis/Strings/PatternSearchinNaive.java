package com.fis.Strings;

public class PatternSearchinNaive {

	public static void main(String[] args) {

		String txt = "AABBAABA";
		String pat = "AABA";

		for (int i = 0; i <= txt.length()- pat.length(); i++) {
			CharSequence t = txt.subSequence(i, pat.length()+i);
			if (pat.equals(t)) {
				System.out.println("Yes");
				break;
			}
		}

		// Method1
		/*for (int i = 0; i < txt.length() - pat.length(); i++) {
			String sub = txt.substring(i, i + pat.length());
			if (pat.equals(sub)) {
				System.out.print("Index " + i + " , ");
			}
		}*/

		// Method 2 // Nested Loop
		/*int M = pat.length();
		for (int i = 0; i <= txt.length() - pat.length(); i++) {
			int j;
			for (j = 0; j < pat.length(); j++) {
				if (txt.charAt(i + j) != pat.charAt(j)) {
					break;
				}
			}

			if (j == M) {
				System.out.println("Pattern found at index " + i);
			}
		}*/
	}

}
