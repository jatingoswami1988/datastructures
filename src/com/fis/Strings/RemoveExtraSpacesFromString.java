package com.fis.Strings;

public class RemoveExtraSpacesFromString {

	public static void main(String[] args) {

		String name = "   Hello Geeks . Welcome   to  GeeksforGeeks   .    ";
		char ch[] = name.toCharArray();
		
		int length = 0;
		int i = 0;
		int j = 0;

		// inbuild function in java replaceAll
		while (length < ch.length) {

			if (ch[j] == ' ') {
				j++;
			}

			if (ch[i] == ' ' && ch[j] != ' ') {
				ch[i] = ch[j];
				i++;
				j++;
			}

			length++;

		}
		
		System.out.println(new String(ch));

	}

}
