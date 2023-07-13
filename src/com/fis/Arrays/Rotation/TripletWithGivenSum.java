package com.fis.Arrays.Rotation;

import java.util.Arrays;

public class TripletWithGivenSum {

	public static void main(String args[]) {

		int arr[] = { 1, 4, 45, 6, 10, 8 };
		int sum = 22;
        //// 1 4 6 10 45
		Arrays.sort(arr);
		int result = 0;
		for (int i = 0; i < arr.length; i++) {

			int left = i + 1;
			int right = arr.length - 1;

			while (left <= right) {
				result = arr[i] + arr[left] + arr[right];
				if (sum == result) {
					System.out.println(arr[i] + "-" + arr[left] + "-" + arr[right]);
					left++;
					right--;
				} else if (sum < result) {
					left++;
				} else if (sum > result) {
					right--;
				}
			}

		}

	}

}
