package com.fis.Arrays;

public class PracticeArray {
	public static void main(String[] args) {
		// int arr[] = { 1, 5, 3, 9, 4, 8, 2 }; /// 1,2,3,4,5,8,9
		char c[] = "Jatin".toCharArray();
		//int mid = c.length - 1 / 2;
		for (int i = 0; i < c.length / 2; i++) {
			char temp = c[c.length - 1 - i];
			c[c.length - 1 - i] = c[i];
			c[i] = temp;
		}
		System.out.print(new String(c));

	}
}
