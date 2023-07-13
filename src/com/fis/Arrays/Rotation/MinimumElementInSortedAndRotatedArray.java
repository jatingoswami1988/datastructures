package com.fis.Arrays.Rotation;

public class MinimumElementInSortedAndRotatedArray {

	public static void main(String[] args) {
		 /// Method 1 O(n)
		
		 int arr[] = {5, 6, 9, 2, 3, 4};
		 int min = arr[0];
		 for(int i=1;i<arr.length;i++){
			 
			 if(arr[i] < min){
				 min = arr[i];
			 }			 
		 }
		 
		 System.out.println("Minimum No > "+ min);

	}

}
