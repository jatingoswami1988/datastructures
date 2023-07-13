package com.fis.Arrays.SubArraysProblem;

public class KadaneAlogorithm {

	public static void main(String[] args) {
		// subarray problem geeks for geeks
		 //int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

		//int[] arr = { 4, 5, -3, 2, 1, 4, -3 };
		//int[] arr = {-2, -3, -8, -1, -2, 1, 5, -3};

		int []arr= {6,-3,-10,0,2};
		
		int size = arr.length;
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + arr[i];
			if (max_so_far < max_ending_here) // if sum is increasing update the max_so_far
				max_so_far = max_ending_here;
			if (max_ending_here < 0)// why made  < 0 >>> new Array might start from -3 , -8 whose sum is greater then 4,5 
				                                     // so there value was is made 0
				max_ending_here = 0;
		}

		System.out.println(max_so_far);

		///// Print the subarray

		//int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int n = arr.length;
		maxSubArraySum(arr, n);

	}

	public static void maxSubArraySum(int a[], int size) {
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0, start = 0, end = 0, s = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here += a[i];

			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
				start = s;
				end = i;
			}

			if (max_ending_here < 0) {
				max_ending_here = 0;
				s = i + 1;
			}
		}
		System.out.println("Maximum contiguous sum is " + max_so_far);
		System.out.println("Starting index " + start);
		System.out.println("Ending index " + end);
	}

}
