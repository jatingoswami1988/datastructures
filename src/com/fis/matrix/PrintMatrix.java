package com.fis.matrix;

public class PrintMatrix {

	public static void printMatrix(int arr[][], int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
	}

}
