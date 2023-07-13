package com.fis.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(13);
		q.add(76);
		q.add(90);
		q.add(44);
		q.add(56);
		q.add(87);
		q.add(8);
		q.add(29);
		display(q);
		reverseQueue(q);
		display(q);
		reverseUsingRecursion(q);

	}

	private static void reverseUsingRecursion(Queue<Integer> q) {
		
		
		
	}

	private static void display(Queue<Integer> q) {
		Iterator<Integer> itr = q.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.print(i + " ");
		}
		System.out.println(" ");

	}

	private static void reverseQueue(Queue<Integer> queue) {

		Stack<Integer> stack = new Stack<>();

		while (!queue.isEmpty()) {
			stack.add(queue.poll());
		}

		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}

	}

}
