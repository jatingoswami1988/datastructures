package com.fis.Arrays;

public class MinAndMaxNoInArray {

	public static void main(String[] args) {
		
		int arr [] = {3,5,9,7,1,2,6};
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 1;i<arr.length;i++) {
			if(arr[i] > max) { 
				max = arr[i];
			}else if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println(min + "-"+max);
		

	}

}
