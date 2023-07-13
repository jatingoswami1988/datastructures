package com.fis.Arrays.Rotation;

import com.fis.Arrays.ArrangementDearrangement.DisplayArray;

public class JuglingAlgorithm {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int d = 3;
		int GCD = 3;// getGCD(arr.length, d);
		int j = 0;
		for (int i = 0; i < d; i++) {
			int temp = arr[i];
			j = i;
			while (true) {
				if (j + GCD <= arr.length - 1) {
					arr[j] = arr[j + GCD];
					j = j + GCD;
				} else {
					arr[j] = temp;
					break;
				}
			}
		}

		DisplayArray.displayArray(arr);

	}

	private static int getGCD(int length, int d) {
		int temp = length > d ? d : length;
		int GCD = 1;
		for (int i = 2; i < temp; i++) {

			if (length % i == 0 && d % i == 0) {
				GCD = i;
			}

		}
		return GCD;
	}

}
