package com.fis.Arrays.ArrangementDearrangement;

public class SlidingWindowTechnique {

	public static void main(String[] args) {
		int arr[] = { 100, 200, 300, 400 };
		int k = 2;
		System.out.println(maxSum(arr, arr.length, k));
	}

	public static int maxSum(int arr[], int n, int k) {
		if (n < k) {
			System.out.println("Invalid");
			return -1;
		}

		// Two Loops
		int max_sum = 0;
		for (int i = 0; i < k; i++) {
			max_sum += arr[i];
		}

		int window_sum = max_sum;
		for (int i = k; i < n; i++) {
			window_sum += arr[i] - arr[i - k];
			max_sum = Math.max(max_sum, window_sum);
		}

		return max_sum;
	}

}
