package com.fis.Arrays.ArrangementDearrangement;

public class RearrangeArr {

	public static void main(String args[]) {
		
		int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
		
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=0 && arr[i]!=i){
				//swap
				
				int temp = arr[arr[i]];
				arr[arr[i]] = arr[i];
				arr[i] = temp;
				
			}
		}
		
		
		DisplayArray.displayArray(arr);

	}

}
