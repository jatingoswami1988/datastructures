package com.fis.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNoFormed {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("54");
		list.add("546");
		list.add("548");
		list.add("60");

		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				String temp1 = str1 + str2;
				String temp2 = str2 + str1;
				return temp2.compareTo(temp1);
			}
		});

		list.forEach(System.out::print);
	}
}
