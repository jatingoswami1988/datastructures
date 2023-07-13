package com.fis.Strings.string.imp;

public class ValidShuffle {

	/*
	 * we have a string array named results. It contains two strings: 1XY2 and Y12X.
	 * We are checking if these two strings are valid shuffle of strings first(XY)
	 * and second(12).
	 * 
	 * Here, the program says 1XY2 is a valid shuffle of XY and 12. However, Y12X is
	 * not a valid shuffle.
	 * 
	 * This is because Y12X has altered the order of string XY. Here, Y is used
	 * before X. Hence, to be a valid shuffle, the order of string should be
	 * maintained.
	 */

	public static void main(String[] args) {
		String first = "XY";
		String second = "12";
		String[] results = { "1XY2", "Y12X" };
		/*
		 * 1XY2 is a valid shuffle of XY and 12 Y12X is not a valid shuffle of XY and 12
		 */

		for (String result : results) {
			if (shuffleCheck(first, second, result) == true) {
				System.out.println(result + " is a valid shuffle of " + first + " and " + second);
			} else {
				System.out.println(result + " is not a valid shuffle of " + first + " and " + second);
			}
		}

	}

	private static boolean shuffleCheck(String first, String second, String result) {
		if (first.length() + second.length() != result.length()) {
			return false;
		}
		int k = 0;
		int i = 0;
		int j = 0;

		while (k < result.length() && i < first.length() && j < second.length()) {
			if (first.charAt(i) == result.charAt(k)) {
				i++;
				k++;
			} else if (second.charAt(j) == result.charAt(k)) {
				j++;
				k++;
			} else {
				return false;
			}
		}
		return true;
	}

}
