package com.fis.Strings;

public class CountUpperLowerNumberAndSpecial {

	public static void main(String[] args) {

		/*
		 * a-z 97-122 A-Z 65-90 0-9 48 > 57 Rest Special Character
		 */

		String str = "#GeeKs01fOr@gEEks07";
		int upper = 0, lower = 0, number = 0, special = 0;
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if (c > 'a' && c < 'z') {
				lower++;
			} else if (c > 'A' && c < 'Z') {
				upper++;
			} else if (c > '0' && c < '9') {
				number++;
			} else {
				special++;
			}

		}

		System.out.println("Lower case letters : " + lower);
		System.out.println("Upper case letters : " + upper);
		System.out.println("Number : " + number);
		System.out.println("Special characters : " + special);

		String inputString = "Java Made So Easy";
		char ar[] = inputString.toCharArray();
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] >= 65 && ar[i] <= 90) {
				// implicit casting
				ar[i] = (char) ((int) ar[i] + 32);
			} else if (ar[i] >= 97 && ar[i] <= 122) { // convert lowerCase to upperCase.
				ar[i] -= 32;
			}
		}

		System.out.println((int) 'a');

		System.out.println(new String(ar));

	}

}
