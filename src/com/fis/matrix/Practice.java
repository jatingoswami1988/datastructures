package com.fis.matrix;

public class Practice {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		printMatrixInSpiralForm(arr, 4, 4);

	}

	private static void printMatrixInSpiralForm(int[][] arr, int m, int n) {

		int k = 0, l = 0;

		while (k < m && l < n) {

			for (int i = l; i < n; i++) {
				System.out.print(arr[k][i]);
			}

			k++;

			for (int i = k; i < m; i++) {
				System.out.print(arr[i][n - 1]);
			}

			n--;

			for (int i = n - 1; i >= l; i--) {
				System.out.print(arr[m - 1][i]);
			}
			
			m--;

			for (int i = m - 1; i >= k; i--) {
				System.out.print(arr[i][l]);
			}
			
			l++;
		}

	}

}
