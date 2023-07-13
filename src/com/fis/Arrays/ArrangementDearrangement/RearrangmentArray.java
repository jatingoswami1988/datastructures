package com.fis.Arrays.ArrangementDearrangement;

public class RearrangmentArray {

	public static void main(String args[]) {
		/// Method 1
		int arr[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0 && arr[i] != i) {

				int element = arr[arr[i]];
				arr[arr[i]] = arr[i];
				arr[i] = element;

			}
		}

		DisplayArray.displayArray(arr);

		// Method 2 Use hashSet

		// Put All elements in Hashset and then use contains method. If it
		// contains den put i else -1

	}

}
