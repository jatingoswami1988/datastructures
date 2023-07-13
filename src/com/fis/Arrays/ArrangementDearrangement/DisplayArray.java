package com.fis.Arrays.ArrangementDearrangement;

public class DisplayArray {

	public static void displayArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void swapNumbers(int i, int j, int[] array) {
		  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
