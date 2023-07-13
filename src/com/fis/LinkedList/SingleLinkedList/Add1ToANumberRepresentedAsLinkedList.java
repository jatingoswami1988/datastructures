package com.fis.LinkedList.SingleLinkedList;

public class Add1ToANumberRepresentedAsLinkedList {

	public static void main(String[] args) {

		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNodeAtEnd(1);
		linkedList.addNodeAtEnd(2);
		linkedList.addNodeAtEnd(3);
		linkedList.addNodeAtEnd(4);
		linkedList.addNodeAtEnd(5);

		Node temp = reverseLinkedList(linkedList.head);
		linkedList.head = temp;
		add1ToANumberRepresentedAsLinkedList(linkedList.head, 1);

	}

	private static Node reverseLinkedList(Node head) {
		Node temp = head;
		Node prev = null;
		Node next = null;
		while (temp != null) {
			next = temp.getNextRef();
			temp.setNextRef(prev);
			prev = temp;
			temp = next;
		}
		temp = prev;
		return temp;
	}

	private static void add1ToANumberRepresentedAsLinkedList(Node head, int value) {

		Node temp = head;
		int x = 0;
		int sum = 0;
		while(temp!=null ) {
			sum = x + temp.getData() + value;
			if(sum > 10) {
				x = sum%10;
			}
		}
	}

}
