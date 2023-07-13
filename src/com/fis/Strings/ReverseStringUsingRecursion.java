package com.fis.Strings;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {

		String s = "Jatin";
		int middle = (s.length()) / 2;

		char[] c = s.toCharArray();
		c = reverseString(c, 0, s.length() - 1, middle);
		System.out.println(c);
		System.out.println(reverseString(s));
	}
	
	private static String reverseString(String name) {
		
		String finalString = "";
		for(int i = name.length()-1 ; i >= 0 ; i--){
			finalString = finalString + name.charAt(i);
		}
		
		return finalString;
	}

	private static char[] reverseString(char[] c, int i, int j, int middle) {

		if (i == middle) {
			return c;
		} else {

			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;

		}

		return reverseString(c, i+1, j-1, middle);
	}

}
