package com.fis.Strings.string.imp;

import java.util.HashMap;
import java.util.Map;

public class CheckIfTwoGivenStringsAreIsomorphic {

	public static void main(String[] args) {

		String s1 = "aab";
		String s2 = "xzy";
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		Map<Character, Character> result = new HashMap<>();
		boolean flag = true;
		for (int i = 0; i < c1.length; i++) {
			if (result.get(c1[i]) == null) {
				result.put(c1[i], c2[i]);
			} else {
				if (c2[i] != result.get(c1[i])) {
					//System.out.println("Not Isomorphic");
					flag = false;
				}else {
					continue;
				}
			}
		}
		if(flag) {
			System.out.println("Isomorphic");
		}else {
			System.out.println("Not Isomorphic");
		}
	}

}
