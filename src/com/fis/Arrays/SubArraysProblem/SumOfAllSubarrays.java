package com.fis.Arrays.SubArraysProblem;

public class SumOfAllSubarrays {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		long result = 0, temp = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = 0;
			for (int j = i; j < arr.length; j++) {
				temp += arr[j];
				result += temp;
			}
		}
		
		System.out.println(result);

	}

}
