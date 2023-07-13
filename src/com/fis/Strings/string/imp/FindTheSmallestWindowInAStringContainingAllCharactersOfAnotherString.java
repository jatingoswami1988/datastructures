package com.fis.Strings.string.imp;

public class FindTheSmallestWindowInAStringContainingAllCharactersOfAnotherString {

	public static void main(String[] args) {
		// bruteForce Approach
		// Generate All substring
		String str = "this is a test string"; // t stri
		String pat = "tist";
		//int window = 0;
		//int x = 0;
		//int y = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String substring = str.substring(i, j);
				// System.out.print(substring+" - ");
				if (checkIfSubstringPresent(substring, pat)) { // UseHashmap
					System.out.println("Window " + i + " - " + j);
					// break;
				}
			}
			System.out.println("");
		}
		//System.out.println("Window " + x + " - " + y);
	}

	private static boolean checkIfSubstringPresent(String substring, String pat) {
		int ch[] = new int[256];
		for (int i = 0; i < substring.length(); i++) {
			ch[substring.charAt(i)]++;
		}

		for (int i = 0; i < pat.length(); i++) {
			if (ch[pat.charAt(i)] == 0) {
				return false;
			}
		}
		return true;
	}

}
