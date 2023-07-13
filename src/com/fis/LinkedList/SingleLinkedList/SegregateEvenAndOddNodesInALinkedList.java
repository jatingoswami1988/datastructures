package com.fis.LinkedList.SingleLinkedList;

public class SegregateEvenAndOddNodesInALinkedList {

	public static void main(String[] args) {

		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNodeAtEnd(17);
		linkedList.addNodeAtEnd(15);
		linkedList.addNodeAtEnd(12);
		linkedList.addNodeAtEnd(10);
		linkedList.addNodeAtEnd(5);
		linkedList.addNodeAtEnd(4);
		linkedList.addNodeAtEnd(1);
		linkedList.addNodeAtEnd(7);
		linkedList.addNodeAtEnd(6);
		Node head = segregateEvenAndOddNodesInALinkedList(linkedList.head);
		linkedList.displayList();
	}

	private static Node segregateEvenAndOddNodesInALinkedList(Node head) {
		Node temp = head;
		// Getting the pointer to last node
		while (temp.getNextRef() != null) {
			temp = temp.getNextRef();
		}
		return null;
	}

}
