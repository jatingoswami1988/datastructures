package com.fis.Arrays.ArrangementDearrangement;

public class EvenIndexSmallerOddIndexGreater {

	public static void main(String[] args) {

		/*
		 * Input : arr[] = {2, 3, 4, 5} Output : arr[] = {2, 4, 3, 5}
		 */
		
		/*Given an array, rearrange the array such that :

			If index i is even, arr[i] <= arr[i+1]
			If index i is odd, arr[i] >= arr[i+1]*/

		int arr[] = { 2, 3, 4, 5 };

		
		int temp;
		for (int i = 0; i < arr.length-1; i++) {
			if (i % 2 == 0 && arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}

			if (i % 2 != 0 && arr[i] < arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		
		DisplayArray.displayArray(arr);
		
		
		
		//Next problem
		
		/*Positive elements at even and negative at odd positions (Relative order not maintained)
		Input : arr[] = {1, -3, 5, 6, -3, 6, 7, -4, 9, 10}
		Output : arr[] = {1, -3, 5, -3, 6, 6, 7, -4, 9, 10}*/

	}

	

}
