package com.fis.Strings;

public class RemoveSpacesFromString {

	public static void main(String[] args) {
		String name = "g eeks for ge eeks";
		char c[] = name.toCharArray();
		int i = removeSpaces(c);
		System.out.println(String.valueOf(c).subSequence(0, i));
		String nam = String.valueOf(c);
		System.out.println(nam.subSequence(0,i));
		//String str = "Test";
	}

	private static int removeSpaces(char[] str) {
		int count = 0;

		// Traverse the given string.
		// If current character
		// is not space, then place
		// it at index 'count++'
		for (int i = 0; i < str.length; i++)
			if (str[i] != ' ')
				str[count++] = str[i]; // here count is
										// incremented

		return count;
	}

}
