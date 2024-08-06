package com.fis.searchingAndSorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumNumberSwapsRequiredSortArray {

	public static void main(String[] args) {

		// BruteForceApproach

		 int arr[] = { 4, 3, 2, 1 };
		//int arr[] = { 101, 758, 315, 730, 472, 619, 460, 479 };
		//[101, 315, 460, 472, 479, 619, 730, 758]
		//int arr[] = { 1, 5, 4, 3, 2 };

		// Sort the array {1,2,3,4}
		// loop over arr. BS of arr[i] and find its position. Put the current element
		// and its position Element in the map
		// Keep count of swap.
		int tempArray[] = new int[arr.length];
		tempArray = Arrays.copyOf(arr, arr.length);
		Arrays.sort(tempArray);
		
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			result.put(arr[i], i);
		}

		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i != result.get(arr[i])) {
				int tempIndex = result.get(arr[i]);
				int temp = arr[tempIndex];
				arr[tempIndex] = arr[i];
				arr[i] = temp;
				counter++;
			}
		}

		System.out.println("Swap Required " + counter);
	}

}
