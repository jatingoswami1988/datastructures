package com.fis.Arrays.SubArraysProblem;

public class SmallestMissingNo {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 2, 3, 4, 5, 6,7,8,9,10,11 };
		int m = 12;

		// 1)Binary search
		// Linear search
		// Modified BS

		for (int i = arr[0]; i < m-1; i++) {
			if (arr[i] != i) {
				System.out.println(i);
				break;
			}
		}

	}

}
