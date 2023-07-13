package com.fis.heap;

public class MaximumOfAllSubarraysOfSizeK {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
		int size = 3;

		// Sliding Window
		// Method 1
		int max = 0;
		for (int i = 0; i < arr.length-size+1; i = i + 1) {
			max = arr[i];
			for (int j = i; j < size + i; j++) {
				if(max < arr[j]) {
					max  = arr[j];
				}
			}System.out.print(max+" ");
		}
		
		// Method 2
		
	}

}
