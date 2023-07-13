package com.fis.Queue;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueExample {

	int front = 0;
	int rear = -1;
	int arr[];
	int size = 0;

	public QueueExample(int length) {

		this.arr = new int[length];

	}

	public static void main(String[] args) {

		QueueExample queue = new QueueExample(10);
		queue.add(5);
		queue.add(10);
		queue.add(8);
		queue.add(2);
		queue.add(67);
		queue.add(90);
		queue.add(11);
		queue.print();
		System.out.println("Element >" + queue.deQueue());
		System.out.println("Element >" + queue.deQueue());
		System.out.println("Element >" + queue.deQueue());
		queue.print();
		queue.reverse();

	}

	private void reverse() {
		
		
	}

	private int deQueue() {

		return this.arr[front++];
	}

	private void print() {
		for (int i = front; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	private void add(int data) {

		arr[++rear] = data;
		size++;

	}

}
