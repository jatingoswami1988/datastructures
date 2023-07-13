package com.fis.Arrays.SubArraysProblem;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		 // Max heap
		PriorityQueue<Integer> priorityQueue  = new PriorityQueue<>(new Comparator<Integer>() {//Collections.reverseOrder()

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		priorityQueue.add(4);
		priorityQueue.add(10);
		priorityQueue.add(1);
		priorityQueue.add(67);
		priorityQueue.add(23);
		
		
		
		while(!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll());
		}

	}

}
