package com.fis.Strings;

public class CountCharactersStringDistanceEnglishAlphabet {

	/*Explanation: In this (g, s), (e, g), (e, k), (e, g) 
	are the pairs that are at same distances as
	in English alphabets.*/
	
	
	
	
	static int countPairs(String str) {
		int result = 0;
		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				if (Math.abs(str.charAt(i) - str.charAt(j)) == Math.abs(i - j)) {
					result++;
				}
			}
		}
		return result;
	}

	public static void main(String args[]) {

		String str = "geeksforgeeks";
		System.out.println(countPairs(str));
		System.out.println('a'-'z');
		System.out.println((int)'a');
		//System.out.println((char)1);

	}
}
