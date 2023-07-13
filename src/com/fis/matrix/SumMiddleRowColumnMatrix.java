package com.fis.matrix;

public class SumMiddleRowColumnMatrix {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		sumMiddleRow(arr, 3, 3);
		sumMiddleColumn(arr, 3, 3);
	}

	private static void sumMiddleColumn(int[][] arr, int m, int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[m / 2][i];
		}
		System.out.println(sum);

	}

	private static void sumMiddleRow(int[][] arr, int m, int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i][n / 2];
		}
		System.out.println(sum);

	}

}
