package com.fis.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintNoInAscendingOrderContaininh123InTheirDigits {

	public static void main(String[] args) {

		int arr[] = { 123, 1232, 456, 234, 32145 };
		System.out.println(printNumber(arr));

	}

	private static String printNumber(int[] arr) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (noContains(arr[i])) {
				list.add(arr[i]);
			}
		}
		Collections.sort(list);
		System.out.println(list.toString());

		return null;
	}

	private static boolean noContains(int number) {
		String no = String.valueOf(number);
		if (no.contains("1") && no.contains("2") && no.contains("3")) {
			return Boolean.TRUE;
		}
		return false;
	}

}
