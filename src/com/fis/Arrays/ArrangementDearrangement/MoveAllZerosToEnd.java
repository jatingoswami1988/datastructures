package com.fis.Arrays.ArrangementDearrangement;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
        //// Method 1
		int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9, 6, 0, 2, 6, 8, 0 };
		int countToZero = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0) {
				if (countToZero != i) {
					int data = arr[i];
					arr[i] = arr[countToZero];
					arr[countToZero] = data;
				}
				countToZero++;
			}
		}
		
		DisplayArray.displayArray(arr);
		
		//// Method 2
		
		
		int array[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9, 6, 0, 2, 6, 8, 0 }; 
		///1 9 8 4 2 7 6 9 6 2 6 8 0 0 0 0 0 0
		int count=0;
		
		for(int i=0;i<array.length;i++){
			if(array[i]>0){
				array[count] = array[i];
				count++;
			}
		}
		
		while(count<array.length){
			array[count] = 0;
			count++;
		}
		

		//DisplayArray.displayArray(array);
		
		
		/////// Double the first element and move zero to end
		////{2, 2, 0, 4, 0, 8} >>>> 4 4 8 0 0 0
		
		
		

	}

}
