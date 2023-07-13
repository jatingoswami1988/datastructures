package com.fis.Strings;

public class StringContainingFirstLetterEveryWordGivenStringSpaces {

	public static void main(String[] args) {

		String str = "happy   coding";
		String ch[] = str.split(" ");

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != " " && ch[i].length() > 0) {
				System.out.print(ch[i].charAt(0));
			}
		}

	}

}
