package com.fis.Strings.SortingAndSearching;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringUsingLength {

	public static void main(String[] args) {
		String name[] = { "GeeksforGeeeks", "I", "from", "am" };

		Arrays.sort(name, new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {

				return str1.compareTo(str2);
			}
		});
		
		//System.out.println(Arrays.toString(name));

	}

}
