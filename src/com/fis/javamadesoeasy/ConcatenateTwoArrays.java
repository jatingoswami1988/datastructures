package com.fis.javamadesoeasy;

import java.util.Arrays;

import com.fis.Arrays.ArrangementDearrangement.DisplayArray;

public class ConcatenateTwoArrays {

	public static void main(String[] args) {

		int firstArray[] = { 1, 2, 3 };
		int secondArray[] = { 4, 5, 6 };
		int concatenatedArrayLength = firstArray.length + secondArray.length;
		int[] concatenatedArray = Arrays.copyOf(firstArray, concatenatedArrayLength);
		System.arraycopy(secondArray, 0, concatenatedArray, firstArray.length, secondArray.length);
		DisplayArray.displayArray(concatenatedArray);
	}

}
