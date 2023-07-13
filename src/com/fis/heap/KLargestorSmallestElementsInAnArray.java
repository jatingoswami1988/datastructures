package com.fis.heap;

import java.util.PriorityQueue;

public class KLargestorSmallestElementsInAnArray {

	public static void main(String[] args) {
		int arr[] = { 1, 23, 12, 9, 30, 2, 50 }; // 1,2,9,12,23,30,50
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for (int i = 0; i < arr.length; i++) {
			queue.add(arr[i]);
		}

		int counter = 1;
		int k = 4;
		while (!queue.isEmpty()) {
			if (counter == k) {
				System.out.println(queue.poll());
			}
			queue.poll();
			counter++;

		}
	}

}
