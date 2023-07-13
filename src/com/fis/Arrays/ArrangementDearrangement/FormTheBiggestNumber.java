package com.fis.Arrays.ArrangementDearrangement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FormTheBiggestNumber {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("54", "546", "548", "60");
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				String first = s1 + s2;
				String second = s2 + s1;
				return second.compareTo(first);
			}
		});

		System.out.println(list);
		
		//secondMethod Java8
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				String first = s1 + s2;
				String second = s2 + s1;
				return second.compareTo(first);
			}
		});
		
		System.out.println(list);
		

	}

}
