package com.fis.matrix;

public class MaximumElementInRow {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 1, 4, 9 }, { 76, 34, 21 } };
		printMaxInEachRow(arr, 3, 3);

	}

	private static void printMaxInEachRow(int[][] arr, int m, int n) {
		for (int i = 0; i < m; i++) {
			int max = arr[i][0];
			for (int j = 1; j < n; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
			System.out.println(max);
		}
	}
}
