package com.fis.LinkedList.SingleLinkedList;

public class NthNodeFromEnd {

	public static void main(String[] args) {
		
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNodeAtEnd(1);
		linkedList.addNodeAtEnd(2);
		linkedList.addNodeAtEnd(3);
		linkedList.addNodeAtEnd(4);
		linkedList.addNodeAtEnd(5);
		linkedList.addNodeAtEnd(6);
		int n1 = nthNodeFromEnd(linkedList.head,3);// Method 1
		int n2 = nthNodeFromEnd2(linkedList.head,3);// Method 2

	}

	private static int nthNodeFromEnd2(Node head, int i) {
		Node temp = head;
		// calculate the length
		while(temp!=null) {
			
		}
		return 0;
	}

	private static int nthNodeFromEnd(Node head, int i) {
		
		return 0;
	}

}
