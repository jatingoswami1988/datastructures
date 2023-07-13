package com.fis.matrix;

public class SquareOfDiagnolMatrix {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		squareOfDiagnolMatrix(arr, 3, 3);

	}

	private static void squareOfDiagnolMatrix(int[][] arr, int m, int n) {

		for (int i = 0; i < m; i++) {
			System.out.print(arr[i][i] + " ");
		}

		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i][i] + " ");
		}

		for (int i = n - 1, k = 0; i >= 0; i--, k++) {
			System.out.print(arr[k][i] + " ");
		}

	}

}
