package com.fis.Arrays;

import java.util.*;

public class FirstNegativeIntegerEveryWindowSizeK {

	public static void main(String[] args) {
		int arr[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
		int n = arr.length;
		int k = 3;
		printFirstNegativeInteger(arr, n, k);
	}

	public static void printFirstNegativeInteger(int arr[], int n, int k) {
		LinkedList<Integer> Di = new LinkedList<>();
		int i;
		for (i = 0; i < k; i++) {
			if (arr[i] < 0)
				Di.add(i);
		}

		for (; i < n; i++) {
			if (!Di.isEmpty()) {
				System.out.print(arr[Di.peek()] + " ");
			} else {
				System.out.print("0" + " ");

			}
			while ((!Di.isEmpty()) && Di.peek() < (i - k + 1)) {
				Di.remove();
			}

			if (arr[i] < 0)
				Di.add(i);
		}

		if (!Di.isEmpty()) {
			System.out.print(arr[Di.peek()] + " ");
		} else {
			System.out.print("0" + " ");
		}
	}

}

// This code is contributed by PrinciRaj1992
