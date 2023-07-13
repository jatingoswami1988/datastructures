package com.fis.Strings;

import java.util.Arrays;
import java.util.Comparator;

public class SortAString {

	public static void main(String[] args) {
		
		String name = "jatin";
		char c[] = name.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}

		System.out.println(new String(c));
		Arrays.sort(c);
		System.out.println(c);

		//// 2nd Method
		Character tempArray[] = new Character[name.length()];
		for (int i = 0; i < name.length(); i++) {
			tempArray[i] = name.charAt(i);
		}

		Arrays.sort(tempArray, new Comparator<Character>() {

			@Override
			public int compare(Character c1, Character c2) {

				return Character.compare(Character.toLowerCase(c1), Character.toLowerCase(c2));
			}

		});
		
		StringBuilder sb = new StringBuilder(tempArray.length); 
        for (Character c3 : tempArray) {
        	sb.append(c3.charValue()); 
		}
        
        System.out.println(sb.toString());
	   
	}    

}
