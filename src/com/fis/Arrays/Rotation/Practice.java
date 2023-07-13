package com.fis.Arrays.Rotation;

import com.fis.Arrays.ArrangementDearrangement.DisplayArray;

public class Practice {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 1, 0, 1, 0 };
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				if (i != j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		DisplayArray.displayArray(arr);
	}
}
