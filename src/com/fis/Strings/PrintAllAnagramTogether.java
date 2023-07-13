package com.fis.Strings;

import java.util.HashMap;
import java.util.Map;

/*Anagram pair using two countArray or Hashmap*/

public class PrintAllAnagramTogether {

	public static void main(String[] args) {
		String arr[] = { "cat", "dog", "tac", "god", "act" };
		
		
		
		
		
		/// Use count array
		/// for one + and for other -
		/// check if any value is not equal to zero
		/// Use sorting all anagram pairs will come together and then linearly compare.

		Map<String, String> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			map.put(sort(arr[i]), arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			// if(arr[i].contains(s))
		}

	}

	private static String sort(String string) {
		//// You can use any sorting technique here ..... to sort string.
		char c[] = string.toCharArray();
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] > c[i + 1]) {
				char cha = c[i];
				c[i] = c[i + 1];
				c[i + 1] = cha;
			}
		}
		return new String(c);
	}

}
