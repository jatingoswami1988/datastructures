package com.fis.hashing;

import java.util.HashMap;
import java.util.Map;

public class MaximumDistanceTwoOccurrencesElementArray {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2, 3, 9, 1 };
		Map<Integer, Integer> map = new HashMap<>();
		int maxDistance = 0;
		int no = 0;
		for (int i = 0; i < arr.length; i++) {
			if (map.get(Integer.valueOf(arr[i])) != null) {
				// map.put(Integer.valueOf(arr[i]), Integer.valueOf(i));
				if (maxDistance < Math.abs(map.get(arr[i]) - i)) {
					maxDistance = Math.abs(map.get(arr[i]) - i);
					//no = arr[i];
				}
			} else {
				map.put(Integer.valueOf(arr[i]), Integer.valueOf(i));
			}

		}

		System.out.println("Number >" + no + " - " + maxDistance);

	}

}
