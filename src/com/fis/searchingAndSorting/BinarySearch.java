package com.fis.searchingAndSorting;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
		int left = 0;
		int rigth = arr.length - 1;
		int middle = 0;
		int searchElement = 1;
		Boolean flag = Boolean.FALSE;
		while (left <= rigth) {
			middle = (left + rigth) / 2;
			if (searchElement > arr[middle]) {
				left = middle;
			} else if (searchElement < arr[middle]) {
				rigth = middle;
			} else {
				System.out.println("Index is >" + middle);
				flag = Boolean.TRUE;
				break;
			}

		}

	}

}
