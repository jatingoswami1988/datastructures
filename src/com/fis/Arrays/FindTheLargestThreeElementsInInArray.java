package com.fis.Arrays;

public class FindTheLargestThreeElementsInInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 3, 50, 23, 90 ,8,54,21};
		int max1 = arr[0];
		int max2 = arr[0];
		int max3 = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max1) {
				max1 = arr[i];
			} else if (arr[i] > max2) {
				max2 = arr[i];
			} else if (arr[i] > max3) {
				max3 = arr[i];
			}
		}
		System.out.println(max1 + "-" + max2 + "-" + max3);
	}

}
