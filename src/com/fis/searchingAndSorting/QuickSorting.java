////http://www.java2novice.com/java-sorting-algorithms/quick-sort/
package com.fis.searchingAndSorting;

import com.fis.Arrays.ArrangementDearrangement.DisplayArray;

public class QuickSorting {

	// private static int arr[] = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12 };

	// private static int arr[] = { 12, 11, 6, 5, 13 };

	private static int arr[] = { 10, 100, 30, 90, 40, 50, 80 };

	public static void main(String[] args) {

		quickSort(0, arr.length - 1);
		DisplayArray.displayArray(arr);
	}

	private static void quickSort(int lowerIndex, int higherIndex) {

		int i = lowerIndex;
		int j = higherIndex;
		int pivot = arr[lowerIndex + (higherIndex - lowerIndex) / 2];

		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}

			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		if (lowerIndex < j) {
			quickSort(lowerIndex, j);
		}

		if (i < higherIndex) {
			quickSort(i, higherIndex);
		}

	}

}
