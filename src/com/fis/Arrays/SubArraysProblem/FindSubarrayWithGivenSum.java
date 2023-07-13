package com.fis.Arrays.SubArraysProblem;

public class FindSubarrayWithGivenSum {

	public static void main(String[] args) {
		//int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int arr[] = {1,2,3};
		subArraySum(arr, arr.length, 5);
	}

	public static int subArraySum(int arr[], int n, int sum) {
		int curr_sum, i, j;
		for (i = 0; i < n; i++) {
			curr_sum = arr[i];
			for (j = i + 1; j <= n; j++) {
				if (curr_sum == sum) {
					int p = j - 1;
					System.out.println("Sum found between indexes " + i + " and " + p);
					// kth Largest contigous subarray > Keep pushing in priorityQueue
					return 1;
				}
				if (curr_sum > sum || j == n) {
					break;
				}
				curr_sum = curr_sum + arr[j];
			}
		}
		System.out.println("No subarray found");
		return 0;
	}
}
