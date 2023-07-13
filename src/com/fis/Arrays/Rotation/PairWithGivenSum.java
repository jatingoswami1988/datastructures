package com.fis.Arrays.Rotation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PairWithGivenSum {

	public static void main(String[] args) {

		//// Check again
		//// >>>https://www.geeksforgeeks.org/given-a-sorted-and-rotated-array-find-if-there-is-a-pair-with-a-given-sum/

		int arr[] = { 3, 4, 5, 6, 1, 2 };
		int sum = 7;
		int result = 0;
		int left = 0;
		int right = arr.length - 1;
        Arrays.sort(arr);
		while (left <= right) {
			result = arr[left] + arr[right];
			if (sum == result) {
				//System.out.println(arr[left] + "-" + arr[right]);
				left++;
				right--;
			} else if (sum < result) {
				left++;
			} else if (sum > result) {
				right--;
			}
		}

		
		/*Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(sum - arr[i])) {
				System.out.println(map.get(sum - arr[i]) + "-" + i);
			} else {
				map.put(arr[i], i);
			}
		}*/
		
		HashSet<Integer> s = new HashSet<Integer>(); 
        for (int i = 0; i < arr.length; ++i) { 
            int temp = sum - arr[i]; 
  
            // checking for condition 
            if (s.contains(temp)) { 
                System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")"); 
            } 
            s.add(arr[i]); 
        }
		
	}

}

// }
