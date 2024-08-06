package com.fis.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {

	public static void main(String args[]) {

		List<List<Integer>> finalList = new ArrayList<>();
		int arr[] = { 1, 2, 3, 3 };
		R(finalList, arr, 0, 0, 6, new ArrayList<>());
		System.out.println(finalList);

	}

	private static void R(List<List<Integer>> finalList, int arr[], int index, int sum, int targetSum,
			List<Integer> output) {
		if (sum == targetSum) {
			finalList.add(output);
			return;
		}

		if (index == arr.length) {
			return;
		}
		R(finalList, arr, index + 1, sum, targetSum, new ArrayList<>(output));
		output.add(arr[index]);
		R(finalList, arr, index + 1, sum + arr[index], targetSum, new ArrayList<>(output));
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		int n = nums1.length > nums2.length ? nums2.length : nums1.length;

		Set<Integer> set = new HashSet<>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int x = 0;
		int i = 0;
		int j = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j]) {
				set.add(nums1[i]);
				i++;
				j++;
				// x++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			}
		}
		int result[] = new int[set.size()];
		for (Integer s : set) {
			result[x++] = s;
		}
		return result;
	}

}
