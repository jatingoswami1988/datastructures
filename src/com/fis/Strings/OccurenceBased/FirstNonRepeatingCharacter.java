package com.fis.Strings.OccurenceBased;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String name = "geeksforgeeks"; ///// f

		/// Use Hashmap

		/// character array

		char c[] = new char[26];
		for (int i = 0; i < name.length(); i++) {
			char temp = (char)(name.charAt(i)-'a');
			c[temp]++;

		}

		int index = 0;
		for (int j = 0; j < 26; j++) {
			char temp = (char)(name.charAt(j)-'a');
			if (c[temp] == 1) {
				index = j;
				break;
			}

		}

		System.out.println(name.charAt(index));
		
		
	}

}
