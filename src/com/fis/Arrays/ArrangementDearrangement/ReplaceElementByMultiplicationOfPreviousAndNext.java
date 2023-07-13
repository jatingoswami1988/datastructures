package com.fis.Arrays.ArrangementDearrangement;

public class ReplaceElementByMultiplicationOfPreviousAndNext {

	public static void main(String[] args) {

		// Method 1 Use temp array
		// Input: arr[] = {2, 3, 4, 5, 6}
		// Output: arr[] = {6, 8, 15, 24, 30}

		// Method 2

		int arr[] = { 2, 3, 4, 5, 6 };

		int prev = arr[0];

		arr[0] = arr[0] * arr[1];

		for (int i = 1; i < arr.length - 1; i++) {

			int current = arr[i];
			arr[i] = prev * arr[i + 1];
			prev = current;

		}

		arr[arr.length - 1] = prev * arr[arr.length - 1];

		DisplayArray.displayArray(arr);

	}

}
