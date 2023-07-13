package com.fis.Strings;

public class NoOfRotationToGetBackOriginalString {

	public static void main(String[] args) {

		String str1 = "jatin";
		String str2 = "injat";
		
		System.out.println(str1.substring(1));
		System.out.println(str1.substring(1,4));
		
		// int noOfRotation = noOfRotationToGetBackOriginalString(str1, str2);
		// System.out.println(noOfRotation);
		// str1.su
		//// Amazon
		// Boolean b = isRotated("amazon", "azonam");
		// System.out.println(b);
		//noOfRotatiions(str1, str2);

	}

	private static void noOfRotatiions(String str1, String str2) {
		int noOfR = 0;
		String temp = str1;
		for (int i = 0; i < str1.length(); i++) {
			String c = temp.substring(0,1);
			temp = temp.substring(1) + c;
			noOfR++;
			if(temp.equals(str2)) {
				System.out.println("Yes" + "- "+noOfR);
				return;
			}
		}

	}

	static boolean isRotated(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;

		String clock_rot = "";
		String anticlock_rot = "";
		int len = str2.length();

		// Initialize string as anti-clockwise rotation
		anticlock_rot = anticlock_rot + str2.substring(len - 2, len) + str2.substring(0, len - 2);

		// Initialize string as clock wise rotation
		clock_rot = clock_rot + str2.substring(2) + str2.substring(0, 2);

		// check if any of them is equal to string1
		return (str1.equals(clock_rot) || str1.equals(anticlock_rot));
	}

	private static int noOfRotationToGetBackOriginalString(String str1, String str2) {

		StringBuilder s = new StringBuilder(str1);
		s.append(str1);
		for (int i = 1; i < s.length(); i++) {
			if (i + str1.length() <= 10) {
				String subString = s.substring(i, str1.length() + i);
				if (subString.equals(str2)) {
					return i;
				}
			}

		}

		return str1.length();
	}

}
