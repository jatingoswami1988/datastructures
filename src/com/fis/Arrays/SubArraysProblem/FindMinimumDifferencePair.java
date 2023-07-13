package com.fis.Arrays.SubArraysProblem;

import java.util.Arrays;

public class FindMinimumDifferencePair {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 3, 19, 18, 25 };// 1,3,5,18,19,25
		Arrays.sort(arr);// O(nlogn)
		int minDif = 0;
		int no1 = 0;
		int no2 = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (minDif == 0) {
				minDif = arr[i + 1] - arr[i];
				no1 = arr[i];
				no2 = arr[i+1];
			} else {
				if (arr[i + 1] - arr[i] < minDif) {
					minDif = Math.abs(arr[i] - arr[i + 1]);
					no1 = arr[i];
					no2 = arr[i+1];
				}
			}
		}
		System.out.println(minDif + "->"+ no1 + "->"+no2);

	}

}
