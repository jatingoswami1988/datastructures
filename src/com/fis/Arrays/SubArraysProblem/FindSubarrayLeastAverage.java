package com.fis.Arrays.SubArraysProblem;

public class FindSubarrayLeastAverage {

	public  static void main(String args[]) {
		
		
		// Sliding Window method
		int arr[] = {3, 7, 90, 20, 10, 50, 40};
		int k = 3;
		int sum = 0;
		for(int i=0;i<k;i++) {
			sum = sum + arr[i];
		}
		
		int average = sum/k; // Average
		int j=0;
		int low = 0;
		//int high = 0;
		for(int  i=k;i<arr.length;i++) {
			sum = sum + arr[i] - arr[j];
			if(average > sum/k) {
				average = sum/k;
				low = i;
			}
			j++;
		}
		System.out.println(average + " -> "+low+"-> "+low+k );
	}
	
	
	/*public static void main(String[] args) {
        int k = 3;
		int sum = 0;
		int avg = 0;
		int arr[] = { 3, 7, 90, 20, 10, 50, 40 };
		int minIndex = 0;
		for (int i = 0; i <= arr.length - k; i++) {
			for (int j = i; j < k + i; j++) {
				sum = sum + arr[j];
			}
			if (avg == 0) {
				avg = sum / k;
			} else if (avg > sum / k) {
				avg = sum / k;
				minIndex = i;
			}
			sum = 0;
		}
		System.out.println("Subarray between indexes " + minIndex + " and " + (minIndex + k - 1) + " and avg is " + avg);

	}*/
}
