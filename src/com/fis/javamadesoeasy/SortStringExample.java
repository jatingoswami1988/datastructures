package com.fis.javamadesoeasy;

import com.fis.Arrays.ArrangementDearrangement.DisplayArray;

public class SortStringExample {

	public static void main(String[] args) {

		///Bubble sort example /////  Similar to sort a string
		
		int[] arr = new int[] { 6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		DisplayArray.displayArray(arr);
	}

}
