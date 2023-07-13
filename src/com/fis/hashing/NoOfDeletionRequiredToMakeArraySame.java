package com.fis.hashing;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NoOfDeletionRequiredToMakeArraySame {

	public static void main(String[] args) {

		int arr[] = { 1,2,3,4,5 };

		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		for (int i = 0; i < arr.length; i++) {
			if (map.get(Integer.valueOf(arr[i])) != null) {
				map.put(Integer.valueOf(arr[i]), map.get(Integer.valueOf(arr[i])) + 1);
			} else {
				map.put(Integer.valueOf(arr[i]), Integer.valueOf(arr[i]));
			}

		}
		//NavigableSet<Integer> n = map.navigableKeySet();
		int maxValue = map.navigableKeySet().first();
		int count = 0;
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() < maxValue) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
