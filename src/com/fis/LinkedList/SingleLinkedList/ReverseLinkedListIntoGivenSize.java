package com.fis.LinkedList.SingleLinkedList;

public class ReverseLinkedListIntoGivenSize {

	public static void main(String[] args) {
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNodeAtEnd(1);
		linkedList.addNodeAtEnd(2);
		linkedList.addNodeAtEnd(3);
		linkedList.addNodeAtEnd(4);
		linkedList.addNodeAtEnd(5);
		linkedList.addNodeAtEnd(6);
		linkedList.addNodeAtEnd(7);
		linkedList.addNodeAtEnd(8);
		linkedList.addNodeAtEnd(9);
		Node head = reverseLinkedListIntoGivenSize(linkedList.head, 3);
		linkedList.head = head;
		linkedList.displayList();
	}

	private static Node reverseLinkedListIntoGivenSize(Node head, int k) {
		if (head == null) {
			return head;
		}
		Node temp = head;
		int count = 0;
		Node prev = null;
		Node next = null;
		while (temp != null && count < k) {
			next = temp.getNextRef();
			temp.setNextRef(prev);
			prev = temp;
			temp = next;
			count++;
		}
		Node node = reverseLinkedListIntoGivenSize(next, k);
		head.setNextRef(node);
		return prev;
	}

}
