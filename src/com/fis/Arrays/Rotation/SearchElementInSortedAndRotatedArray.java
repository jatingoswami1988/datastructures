package com.fis.Arrays.Rotation;

import java.util.Arrays;

public class SearchElementInSortedAndRotatedArray {

	public static void main(String arry[]) {

		int arr[] = { 3, 4, 5, 1, 2 };
		int key = 4;
		//Arrays.sort(arr);
		//System.out.println(Arrays.binarySearch(arr, 5));

		int pivot = findThePivot(arr);
		if (arr[pivot] > key) {
			System.out.println(Arrays.binarySearch(arr, 0,pivot, key));
		} else {
			System.out.println(Arrays.binarySearch(arr, pivot,arr.length-1, key));
		}
		
		
		//// 2ndMethod
		// Improved BinarySearch

	}

	public static int findThePivot(int[] arr) {
		int pivot = -1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				pivot = i;
				break;
			}
		}
		return pivot;
	}

}
