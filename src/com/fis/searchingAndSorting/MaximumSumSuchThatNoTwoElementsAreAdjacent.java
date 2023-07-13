package com.fis.searchingAndSorting;

public class MaximumSumSuchThatNoTwoElementsAreAdjacent {

	public static void main(String ar[]) {
		//int[] arr = new int[] { 5, 5, 10, 100, 10, 5 };
		int arr[] = {1,2,3};

		System.out.println(findMaxSum(arr, arr.length));
	}

	public static int findMaxSum(int[] arr, int n) {
		int incl = arr[0];
		int excl = 0;
		int excl_new;
		int i;

		for (i = 1; i < n; i++) {
			excl_new = (incl > excl) ? incl : excl;
			incl = excl + arr[i];
			excl = excl_new;
		}

		return ((incl > excl) ? incl : excl);
	}
}
