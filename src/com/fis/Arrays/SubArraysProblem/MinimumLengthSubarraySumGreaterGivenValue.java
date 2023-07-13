package com.fis.Arrays.SubArraysProblem;

public class MinimumLengthSubarraySumGreaterGivenValue {
	public static int smallestSubWithSum(int arr[], int n, int x) {
		int min_len = n + 1;
		for (int i = 0; i < n; i++) {
			int curr_sum = arr[i];
			System.out.println(arr[i] + " ");
			if (curr_sum > x)
				return 1;
			for (int j = i + 1; j < n; j++) {
				curr_sum += arr[j];
				System.out.print(arr[j] + " ");
				//System.out.println(" ");
				if (curr_sum > x && (j - i + 1) < min_len)
					min_len = (j - i + 1);
			}
		}
		return min_len;
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 4, 45, 6, 10, 19 }; // n*(n+1)/2 >> 6*7/2 > 21
		int x = 51;
		int n1 = arr1.length;
		int res1 = smallestSubWithSum(arr1, n1, x);
		if (res1 == n1 + 1) {
			System.out.println("Not Possible");
		}
		else {
			System.out.println(res1);
		}

	}
}
