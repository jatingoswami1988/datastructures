package com.fis.searchingAndSorting;

import com.fis.Arrays.ArrangementDearrangement.DisplayArray;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = { 64, 25, 12, 22, 11 };

		int min = 0;

		for (int i = 0; i < arr.length; i++) {

			min = arr[i];

			for (int j = i + 1; j < arr.length; j++) {
				if (min > arr[j]) {
					int temp = arr[j];
					arr[j] = min;
					min = temp;
				}
			}

			arr[i] = min;

		}

		DisplayArray.displayArray(arr);

	}

}
