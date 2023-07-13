package com.fis.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,6};
		int key = 5;
		int left = 0;
		int right = arr.length-1;
		int mid = left+(right-left)/2;
		while(left<right) {
			if(arr[mid] > key) {
				right = mid;
				mid = left + (right-left)/2;
			}else if(arr[mid]<key) {
				left = mid;
				mid = left + (right-left)/2;
			}else if(arr[mid]==key) {
				System.out.println(mid);
				break;
			}
		}

	}

}
