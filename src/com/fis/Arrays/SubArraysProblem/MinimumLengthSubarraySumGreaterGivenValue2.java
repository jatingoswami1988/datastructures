package com.fis.Arrays.SubArraysProblem;

public class MinimumLengthSubarraySumGreaterGivenValue2 {

	public static void main(String ars[]) {
		int arr[] = { 1, 4, 45, 6, 10, 19 };
		int minLength = 0;
		int minLengthTemp = 0;
		int sum = 29;
		int tempSum = 0;
		for (int i = 0; i < arr.length; i++) {
			// System.out.println("");
			for (int j = i; j < arr.length; j++) {
				// System.out.println("");
				for (int k = i; k <= j; k++) {
					// System.out.print(arr[k] + " ");
					tempSum = tempSum + arr[k];
					minLengthTemp = k;
					if (tempSum > sum) {
						if (minLength == 0) {
							minLength = minLengthTemp;
						} else if (minLengthTemp < minLength)
							minLength = minLengthTemp;
					}
				}
				tempSum = 0;
				minLengthTemp = 0;
			}

		}

		System.out.println(minLength);
	}
}
