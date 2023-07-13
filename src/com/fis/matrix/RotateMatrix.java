package com.fis.matrix;

public class RotateMatrix {

	public static void main(String[] args) {
		int m = 3;
		int n = 3;
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotateMatrix(arr, m, n);
		PrintMatrix.printMatrix(arr, m, n);

	}

	private static void rotateMatrix(int[][] arr, int m, int n) {

		int k = 0;
		int l = 0;

		int prev = 0;
		int curr = 0;
		while (k < m && l < n) {
			prev = arr[k + 1][l];
			for (int i = l; i < n; i++) {
				curr = arr[k][i];
				arr[k][i] = prev;
				prev = curr;
			}

			k++;

			for (int i = k; i < m; i++) {
				curr = arr[i][n - 1];
				arr[i][n - 1] = prev;
				prev = curr;
			}
			n--;

			if (k < m) {
				for (int i = n - 1; i >= l; i--) {
					curr = arr[m - 1][i];
					arr[m - 1][i] = prev;
					prev = curr;
				}
				m--;
			}

			if (l < n) {
				for (int i = m - 1; i >= k; i--) {
					curr = arr[i][l];
					arr[i][l] = prev;
					prev = curr;
				}
				l++;
			}
		}

	}

}
