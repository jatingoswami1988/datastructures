package com.fis.Arrays.ArrangementDearrangement;

public class RearrangeArrayAlternatingPositiveNegativeItems {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, -4, -1, 4 };
		// int arr[] = { 1, 0, 1, 0, 1, 0 };
		// Segregate positive and Negative No

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				if (i != j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		System.out.println(j);
		DisplayArray.displayArray(arr);
		int k = j;
		for (int i = 0; i < j; i = i + 2) {
			if (k < arr.length) {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				k++;
			}
		}
		System.out.println("");
		DisplayArray.displayArray(arr);
	}
}
