package com.fis;

import java.util.HashMap;
import java.util.Map;

public class Testing {

	Map<Integer, Integer> map = new HashMap<>();

	int capacity;

	Node head = new Node(-1, -1);
	Node tail = new Node(-1, -1);

	public Testing(int capacity) {
		this.capacity = capacity;
		this.head.next = tail;
		this.tail.prev = head;
	}

	public static void main(String ars[]) {

		//Testing lru = new Testing(3);
		//lru.put(1, 1);
		
		System.out.println(String.format("%s_%s", "E", "Nitin"));
		System.out.println(11%6);
		System.out.println(11/6);

	}

	private void put(int key, int val) {

		if (map.get(key) != null) {
			remove(key);
			insert(key, val);

		} else {
			insert(key, val);
		}
	}

	private void insert(int key, int val) {
		map.put(key, val);
		Node newNode = new Node(key, val);
		Node temp = head.next;
		head.next = newNode;
		newNode.next = temp;
	}

	private void remove(int key) {


		
		
	}
}

class Node {

	int key;
	int value;
	Node prev;
	Node next;

	public Node(int key, int val) {
		this.key = key;
		this.value = val;
	}

}
