package com.fis.matrix;

public class PrintMatrixReverseSpiralForm {

	public static void main(String[] args) {

		// int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// printMatrixReverseSpiral(arr, 3, 3);
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		printMatrixRevers(arr, 4, 4);

	}

	private static void printMatrixRevers(int[][] arr, int i, int j) {

		
		
	}

	private static void printMatrixReverseSpiral(int[][] arr, int m, int n) {

		int k = 0; // Row
		int l = 0; // Column
		while (k < m && l < n) {

			for (int i = k; i < m; i++) {
				System.out.println(arr[i][l]);
			}

			l++;

			for (int i = l; i < n; i++) {
				System.out.println(arr[m - 1][i]);
			}

			m--;

			for (int i = m - 1; i >= k; i--) {
				System.out.println(arr[i][n - 1]);
			}

			n--;

			for (int i = n - 1; i <= l; i++) {
				System.out.println(arr[k][i]);
			}
			k++;

		}

	}

}
