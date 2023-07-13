package com.fis.Arrays.ArrangementDearrangement;

public class MinSwapReqToBringNoSmallerOrEqualToK2 {
	
	public static void main(String[] args) {
		int arr[] = { 2, 1, 5, 6, 3 };
		int n = arr.length;
		int k = 3;
		System.out.print(minSwap(arr, n, k) + "\n");

		int arr1[] = { 2, 7, 9, 5, 8, 7, 4 };
		n = arr1.length;
		k = 5;
		//System.out.print(minSwap(arr1, n, k));
	}

	public static int minSwap(int arr[], int n, int k) {

		int count = 0;
		for (int i = 0; i < n; ++i) {
			if (arr[i] <= k)
				++count;
		}

		int bad = 0;
		for (int i = 0; i < count; ++i) {
			if (arr[i] > k)
				++bad;
		}

		int ans = bad;
		for (int i = 0, j = count; j < n; ++i, ++j) {

			// Decrement count of previous window
			if (arr[i] > k)
				--bad;

			// Increment count of current window
			if (arr[j] > k)
				++bad;

			// Update ans if count of 'bad'
			// is less in current window
			ans = Math.min(ans, bad);
		}
		return ans;
	}
}