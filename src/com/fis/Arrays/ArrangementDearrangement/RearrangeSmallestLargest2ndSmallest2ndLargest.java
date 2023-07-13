package com.fis.Arrays.ArrangementDearrangement;

import java.util.Arrays;

public class RearrangeSmallestLargest2ndSmallest2ndLargest {

	public static void main(String[] args) {

		int arr[] = { 5, 8, 1, 4, 2, 9, 3, 7, 6 };
		int left = 0;
		int right = arr.length - 1;
		int temp[] = new int[arr.length];
		int i = 0;
		Arrays.sort(arr);

		while (left < right) {

			temp[i++] = arr[left++];
			temp[i++] = arr[right--];
		}

		if (arr.length % 2 != 0) {
              temp[i] = arr[right];
		}

		DisplayArray.displayArray(temp);
		
		/*Please read the following method also*/
		/*Rearrange an array in maximum minimum form | Set 2 (O(1) extra space)*/
		

	}

}
