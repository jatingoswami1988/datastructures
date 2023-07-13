package com.fis.Stack;

import java.util.Stack;

class QueueImplementMethod1 {

	Stack<Integer> s1;
	Stack<Integer> s2;

	public QueueImplementMethod1() {
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}

	public void pushing(Integer item) {

		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}

		s1.push(item);
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}

	public Integer pop() {

		return s1.pop();

	}

	public Integer peek() {
		return s1.peek();
	}

}

public class QueueUsingStackMethod1 {

	public static void main(String args[]) {

		QueueImplementMethod1 queueImplementMethod1 = new QueueImplementMethod1();
		queueImplementMethod1.pushing(5);
		queueImplementMethod1.pushing(23);
		queueImplementMethod1.pushing(98);
		queueImplementMethod1.pushing(12);
		System.out.println(queueImplementMethod1.peek());
		System.out.println(queueImplementMethod1.pop());
		// System.out.println(queueImplementMethod1.pop());
	}

}
