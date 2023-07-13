package com.fis.Arrays.ArrangementDearrangement;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 7, 1, 9, 5, 3, 8 };

		for (int i = 0; i <= (arr.length - 1) / 2; i++) {

			int data = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = data;

		}

		DisplayArray.displayArray(arr);
		
		//// Similar to String 
		
		
		
		//// Postive Negative No > O(n) and O(1) [-1, 2, -3, 4, 5, 6, -7, 8, 9] >>>> [9, -7, 8, -3, 5, -1, 2, 4, 6]
		
		
        }

}
