package com.fis.Arrays.ArrangementDearrangement;

public class PositiveNegativeNumbers {

	public static void main(String arhs[]) {
       ///  Method 1 
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 }; ////// 2,-1,4,-3,4,5,6,-7,8,9
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0 && arr[i] < 0) {// Even
				int j = i;
				while (true) {
					if (j + 1 < arr.length && arr[j + 1] > 0) {
						int temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
						break;
					} else {
						if(j>arr.length-1){
							break;
						}
						j = j + 2;
					}
				}
			}
			if (i % 2 != 0 && arr[i] > 0) {// Odd
				int j = i;
				while (true) {
					if (j + 1 < arr.length && arr[j + 1] < 0) {
						int temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
						break;
					} else {
						if(j>arr.length-1){
							break;
						}
						j = j + 2;
					}
				}
			}
		}
		//DisplayArray.displayArray(arr);
		
		////Method 2
		
		
		//// Using Quick Sorting >>>>>
		
		
		//int array[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9}; //// >>>>>>>>>>   4   -3    5   -1    6   -7    2    8    9
		int array[] = {-1, 2, -3, 4, 5, 6, -7, 8, -9}; ////// 2,-1,4,-3,4,5,6,-7,8,9
		
		int i = -1; 
        for (int j = 0; j < array.length; j++) 
        { 
            if (arr[j] < 0) 
            { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // Now all positive numbers are at end and negative numbers at 
        // the beginning of array. Initialize indexes for starting point 
        // of positive and negative numbers to be swapped 
        int pos = i+1, neg = 0; 
  
        // Increment the negative index by 2 and positive index by 1, i.e., 
        // swap every alternate negative number with next positive number 
        while (pos < array.length && neg < array.length && arr[neg] < 0) 
        { 
            int temp = arr[neg]; 
            arr[neg] = arr[pos]; 
            arr[pos] = temp; 
            pos++; 
            neg += 2; 
        } 
		
		
		
		DisplayArray.displayArray(array); 
		
	}
}
