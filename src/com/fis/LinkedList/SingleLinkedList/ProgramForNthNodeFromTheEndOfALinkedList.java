package com.fis.LinkedList.SingleLinkedList;

public class ProgramForNthNodeFromTheEndOfALinkedList {

	public static void main(String[] args) {
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNodeAtEnd(1);
		linkedList.addNodeAtEnd(2);
		linkedList.addNodeAtEnd(3);
		linkedList.addNodeAtEnd(4);
		linkedList.addNodeAtEnd(5);
		linkedList.addNodeAtEnd(6);

		int data = nthNodeFromEnd(linkedList.head, 3);
		System.out.println(data);
	}

	private static int nthNodeFromEnd(Node head, int no) {
		Node temp = head;
		int pointer = 0;
		while (temp != null && pointer != no) {
			temp = temp.getNextRef();
			pointer++;
		}
		Node fastPointer = temp;
		Node slowPointer = head;
		while (fastPointer != null) {
			fastPointer = fastPointer.getNextRef();
			slowPointer = slowPointer.getNextRef();
		}
		return slowPointer.getData();
	}

}
