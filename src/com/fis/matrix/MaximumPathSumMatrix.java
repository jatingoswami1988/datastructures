package com.fis.matrix;

import java.util.HashMap;
import java.util.Map;

public class MaximumPathSumMatrix {

	public static void main(String[] args) {
		/*
		 * Given a matrix of N * M. Find the maximum path sum in matrix. The maximum
		 * path is sum of all elements from first row to last row where you are allowed
		 * to move only down or diagonally to left or right. You can start from any
		 * element in first row.
		 */

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		maximumPathSumMatrix(arr, 3, 3);

	}

	private static void maximumPathSumMatrix(int[][] arr, int m, int n) {
		int k = 0;
		int maxSum = arr[0][0];
		int column = 0;

		for (int i = 0; i < n; i++) {
			if (arr[k][i] > maxSum) {
				maxSum = arr[k][i];
				column = i;
			}
		}
		
		k++;

		while (k < m) {

			if (column == 0) {
				if ((maxSum + arr[k][column]) > (maxSum + arr[k][column + 1])) {
					maxSum = maxSum + arr[k][column];
				} else {
					maxSum = maxSum + arr[k][column + 1];
					column = column + 1;
				}
			} else if (column == n - 1) {
				if ((maxSum + arr[k][column]) > (maxSum + arr[k][column - 1])) {
					maxSum = maxSum + arr[k][column];
				} else {
					maxSum = maxSum + arr[k][column - 1];
					column = column - 1;
				}
			} else {
				if (arr[k][column - 1] > arr[k][column]) {
					if (arr[k][column - 1] > arr[k][column + 1]) {
						maxSum = arr[k][column - 1];
						column = column - 1;
					} else {
						maxSum = arr[k][column];
					}
				} else if (arr[k][column - 1] > arr[k][column + 1]) {
					maxSum = arr[k][column];
				} else {
					maxSum = arr[k][column];
					//column = column;
				}

			}

			k++;

		}

	}

	private static Map<Integer, Integer> getMax(int[][] arr, int column, int k) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		if (arr[k][column - 1] > arr[k][column]) {
			if (arr[k][column - 1] > arr[k][column + 1]) {
				map.put(column - 1, arr[k][column - 1]);
			} else {
				map.put(column, arr[k][column]);
			}
		} else if (arr[k][column - 1] > arr[k][column + 1]) {
			map.put(column - 1, arr[k][column - 1]);
		} else {
			map.put(column + 1, arr[k][column + 1]);
		}
		// }

		return map;
	}

}
