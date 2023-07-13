package com.fis.Arrays.Rotation;

import com.fis.Arrays.ArrangementDearrangement.DisplayArray;

public class ArrayRotation {

	public static void main(String args[]) {

		
		  int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		  
		  // Method 1 > Use temp array
		  
		  int noOfRotation = 3; int temp[] = new int[noOfRotation]; for (int i
		  = 0; i < noOfRotation; i++) { temp[i] = arr[i]; }
		  
		  for (int i = 2; i < arr.length; i++) { arr[i - 2] = arr[i]; }
		  
		  for (int i = 0; i < temp.length; i++) { arr[(arr.length - 2) + i] =
		  temp[i]; }
		  
		  DisplayArray.displayArray(arr);
		  
		  /// Method 2 > Using Temp data
		  
		 for (int i = 0; i < noOfRotation; i++) { 
			  int tempData = arr[0];
	     for(int j = 0; j < arr.length - 1; j++) {
	    	 arr[j] = arr[j + 1]; }
		     arr[arr.length - 1] = tempData;
		  }
		  
		 DisplayArray.displayArray(arr);
		 

		///// Juggling algorithm

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int rotation = 3;
		int gcd = getGCD(array.length, rotation);

		for (int i = 0; i < gcd; i++) {

			int tempValue = array[i];
			int j = i;
			int k = i;
			while (true) {
				if (j + gcd > array.length - 1) {
					array[j] = tempValue;
					break;
				} else {
					array[k] = array[j + gcd];
					k = k + gcd;
					j = j + gcd;
				}
			}

		}

		DisplayArray.displayArray(array);

	}

	private static int getGCD(int length, int rotation) {

		int gcd = 1;
		for (int i = 1; i <= rotation; i++) {
			if (length % i == 0 && rotation % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

}
