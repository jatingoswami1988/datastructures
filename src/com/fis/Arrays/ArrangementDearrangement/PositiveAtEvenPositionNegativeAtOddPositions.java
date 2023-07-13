package com.fis.Arrays.ArrangementDearrangement;

public class PositiveAtEvenPositionNegativeAtOddPositions {

	public static void main(String args[]) {

		int arr[] = { 1, -3, 5, 6, -3, 6, 7, -4, 9, 10 };

		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0 && arr[i] < 0) {
				index = i;
				while (arr[index] < 0 && index < arr.length) {
					index = index + 2;
				}

				if (index < arr.length) {
					int temp = arr[index];
					arr[index] = arr[i];
					arr[index] = temp;
				}

			}

			if (i % 2 != 0 && arr[i] > 0) {

			}
		}
		
		DisplayArray.displayArray(arr);
	}
}
