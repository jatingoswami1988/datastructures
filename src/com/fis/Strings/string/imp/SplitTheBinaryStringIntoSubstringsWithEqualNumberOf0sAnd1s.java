package com.fis.Strings.string.imp;

public class SplitTheBinaryStringIntoSubstringsWithEqualNumberOf0sAnd1s {

	public static void main(String[] args) {
		
		//String str = "0100110101";
		String str = "0111100010";
		int countZero =0;
		int countOne =0;
		int pair = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='0') {
				countZero++;
			}else {
				countOne++;
			}
			
			if(countZero == countOne) {
				pair++;
			}
		}
		
		System.out.println(pair);
		
		/*String str = "0100110101";
		//String str = "0111100010";
		char c[] = getToCharArray(str);
		int i = 0;
		int countZero = 0;
		int countOne = 0;
		int pair = 0;
		while (i < str.length()) {
			if (c[i] == '0') {
				if (countOne == 0) {
					countZero++;
				} else {
					countOne--;
					if (countOne == 0) {
						pair++;
					}
				}
				// count++;
			} else if (c[i] == '1') {
				if (countZero == 0) {
					countOne++;
				} else {
					countZero--;
					if (countZero == 0) {
						pair++;
					}
				}
			}
			i++;
		}
		if (pair == 0) {
			System.out.println("-1");
		} else {
			System.out.println(pair);
		}*/

	}

	private static char[] getToCharArray(String str) {
		char c[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			c[i] = str.charAt(i);
		}
		return c;
	}

}
