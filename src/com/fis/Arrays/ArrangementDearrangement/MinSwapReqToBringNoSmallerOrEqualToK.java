package com.fis.Arrays.ArrangementDearrangement;

public class MinSwapReqToBringNoSmallerOrEqualToK {

	public static void main(String[] args) {
	    //Given an array of n positive integers and a number k. 
		//Find the minimum number of swaps required to bring all the numbers less than or equal to k together.
		//int arr[] = {2, 1, 5, 6, 3};
		int arr[] = {2, 7, 9, 5, 8, 7, 4};
		//int k = 3;
		int k=5;
		int count = 0;
		int noOfSwap = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= k) {
				if (count != i) {
					int temp = arr[count];
					arr[count] = arr[i];
					arr[i] = temp;
					noOfSwap++;
				}
				count++;
			}

		}
		System.out.println("No Of Swap Required >" + noOfSwap);

		//// Read O(n2) , Two Pointer Technique and Sliding window technique also.
		
		
		
	}

}
