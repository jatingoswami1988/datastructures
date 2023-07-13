package com.fis.LinkedList.SingleLinkedList;

public class RecursivelyReverseLinkedList {

	public static void main(String[] args) {
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNodeAtEnd(1);
		linkedList.addNodeAtEnd(2);
		linkedList.addNodeAtEnd(3);
		linkedList.addNodeAtEnd(4);
		linkedList.addNodeAtEnd(5);
		linkedList.head = recursiveReverse(linkedList.head, null);
		linkedList.displayList();
	}

	private static Node recursiveReverse(Node temp, Node prev) {
		if (temp == null) {
			return prev;
		}
		Node next = temp.getNextRef();
		temp.setNextRef(prev);
		prev = temp;
		temp = next;
		return recursiveReverse(next, prev);
	}

}
