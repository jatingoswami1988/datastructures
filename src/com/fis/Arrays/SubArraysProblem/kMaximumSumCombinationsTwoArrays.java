package com.fis.Arrays.SubArraysProblem;

import java.util.Collections;
import java.util.PriorityQueue;

public class kMaximumSumCombinationsTwoArrays {

	public static void main(String[] args) {

		// Use PriorityQueue
		// https://www.geeksforgeeks.org/k-maximum-sum-combinations-two-arrays/

		int A[] = { 4, 2, 5, 1 };
		int B[] = { 8, 0, 5, 3 };
		int k = 3;

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				priorityQueue.add(A[i] + B[j]);
			}
		}
		int count = 0;
		while(count < k) {
			priorityQueue.poll();
			count++;
		}
		
		System.out.println(priorityQueue.peek());

	}

}
