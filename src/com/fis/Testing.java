package com.fis;

public class Testing {

	public static void main(String ars[]) {

		// int arr[] = { 10, 1, 3, 1, 2, 2, 1, 0, 4 };
		// int arr[] = { 5, 3, 1, 3, 2, 3 };
		// int arr[] = { 9, 9, 9, 9, 9 };
		int arr[] = { 1, 5, 2, 4, 3, 3 };
		int finalCount = 0;
		for (int i = 0; i < arr.length; i++) {	
			int temp = 0;
			int count = 0;
			for (int j = i; j < arr.length - 1; j++) {
				if (temp == 0) {
					temp = arr[j] + arr[j + 1];
					j++;
					count++;
					finalCount = finalCount > count ? finalCount : count;
				} else if (temp == (arr[j] + arr[j + 1])) {
					count++;
					finalCount = finalCount > count ? finalCount : count;
					j++;
				}
			}
		}
		System.out.println(finalCount);
	}
}
