package com.fis.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fis.Arrays.ArrangementDearrangement.DisplayArray;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 4, 5 };
		int arr2[] = { 2, 4, 6, 8 };
		int tempArray[] = new int[arr1.length + arr2.length];
		int counter = 0;
		for (int i = 0; i < arr1.length; i++) {
			tempArray[counter++] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			tempArray[counter++] = arr2[i];
		}

		Arrays.sort(tempArray);
		DisplayArray.displayArray(tempArray);

		/// Put them in hashMap and then print.

		Map<String, String> map = new HashMap<String, String>();
		for (Map.Entry<String, String> result : map.entrySet()) {
			System.out.println(result.getKey() + "-" + result.getValue());
		}

	}

}
