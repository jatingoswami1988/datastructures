package com.fis.LinkedList.SingleLinkedList;

public class ArrangeTheSinleLinkList {

	public static void main(String[] args) {

		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNodeAtEnd(1);
		linkedList.addNodeAtEnd(2);
		linkedList.addNodeAtEnd(3);
		linkedList.addNodeAtEnd(4);
		linkedList.addNodeAtEnd(5);
		 linkedList.addNodeAtEnd(6);

		// Same logic as of pallindrome

		Node middle = getTheMiddle(linkedList.head);
		System.out.println(middle.getData());
		
		// reverse 
		
		Node afterReverse = reverse(middle.getNextRef()); 
		
	}

	private static Node reverse(Node middleNext) {
		Node temp  = middleNext;
		Node prev= null;
		Node next = null;
		while(temp!=null) {
			next = temp.getNextRef();
			temp.setNextRef(prev);
			prev = temp;
			temp = next;
		}
		return prev;
	}

	/*private static Node getTheMiddle(Node head) {
		Node slowPtr = head;
		Node fastPtr = head;
		while (fastPtr != null && fastPtr.getNextRef() != null) {
			slowPtr = slowPtr.getNextRef();
			fastPtr = fastPtr.getNextRef().getNextRef();
		}
		return slowPtr;
	}*/
	
	private static Node getTheMiddle(Node head) {
		Node slowPtr = head;
		Node fastPtr = head;
		while (fastPtr.getNextRef() != null && fastPtr.getNextRef().getNextRef() != null) {
			slowPtr = slowPtr.getNextRef();
			fastPtr = fastPtr.getNextRef().getNextRef();
		}
		return slowPtr;
	}

}
