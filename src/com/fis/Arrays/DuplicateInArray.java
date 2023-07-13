package com.fis.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 1, 3, 6, 6 };
		Arrays.sort(arr); // {1,1,2,3,3,6,6}

		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println("Duplicate :" + arr[i]);
			}
		}
		
		//Set<Integer> list = new HashSet<>();
		//list.add(e) >> Return Boolean
		
		// We can use hashmap also
		
		// Same logic for Missing nos also Run loop from 1 - 100. Put them in hashmap.
	}

}
