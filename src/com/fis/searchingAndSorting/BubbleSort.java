package com.fis.searchingAndSorting;

import com.fis.Arrays.ArrangementDearrangement.DisplayArray;

public class BubbleSort {

	public static void main(String args[]) {

		/// Move the max element to last >>>

		int arr[] = { 5, 1, 12, -5, 16 };

		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		DisplayArray.displayArray(arr);
	}

}
