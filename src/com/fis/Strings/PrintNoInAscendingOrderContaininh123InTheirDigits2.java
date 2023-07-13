package com.fis.Strings;

import java.util.Arrays;

public class PrintNoInAscendingOrderContaininh123InTheirDigits2 {

	public static void main(String[] args) {

		int arr[] = { 123, 1232, 456, 234, 32145 };
		int tempArray [] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if(checkIfOneTwoThreePresent(arr[i])){
				tempArray[i] = arr[i];
			}
		}
		
		Arrays.sort(tempArray);
		System.out.println(Arrays.toString(tempArray));

	}

	private static boolean checkIfOneTwoThreePresent(int number) {
		boolean one = false;
		boolean two = false;
		boolean three = false;
		//int remainder = 0;
		while (number > 0) {
			int temp = number % 10;
			if (temp == 1) {
				one = true;
			} else if (temp == 2) {
				two = true;
			} else if (temp == 3) {
				three = true;
			}
			number = number / 10;
		}
		if(one && two && three){
			return true;
		}
		return false;
	}

}
