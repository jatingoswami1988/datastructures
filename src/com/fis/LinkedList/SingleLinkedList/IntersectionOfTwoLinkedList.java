package com.fis.LinkedList.SingleLinkedList;

public class IntersectionOfTwoLinkedList {

	public static void main(String[] args) {

		SingleLinkedList linkedList1 = new SingleLinkedList();
		/*
		 * linkedList1.addNodeAtEnd(1); linkedList1.addNodeAtEnd(2);
		 * linkedList1.addNodeAtEnd(3); linkedList1.addNodeAtEnd(4);
		 * linkedList1.addNodeAtEnd(6);
		 */
		linkedList1.addNodeAtEnd(4);
		linkedList1.addNodeAtEnd(1);
		linkedList1.addNodeAtEnd(8);
		linkedList1.addNodeAtEnd(4);
		linkedList1.addNodeAtEnd(5);

		SingleLinkedList linkedList2 = new SingleLinkedList();
		// linkedList2.addNodeAtEnd(4);
		linkedList2.addNodeAtEnd(5);
		linkedList2.addNodeAtEnd(6);
		linkedList2.addNodeAtEnd(1);
		linkedList2.addNodeAtEnd(8);
		linkedList2.addNodeAtEnd(4);
		linkedList2.addNodeAtEnd(5);

		// Returning new List with Common Elements
		// SingleLinkedList intersectionList = intersectionOfTwoList(linkedList1.head,
		// linkedList2.head);
		// intersectionList.displayList();

		Node intersectionPoint = intersectionPointOfTwoList(linkedList1.head, linkedList2.head);
		System.out.println(intersectionPoint.getData());
	}

	private static Node intersectionPointOfTwoList(Node head1, Node head2) {
		int length1 = getLength(head1);
		int length2 = getLength(head2);
		int max = length1 > length2 ? length1 - length2 : length2 - length1;
		if (length1 > length2) {
			Node temp1 = head1;
			int count = 0;
			while (count < max) {
				temp1 = temp1.getNextRef();
				count++;
			}
			Node temp2 = head2;
			while (temp1 != null && temp2 != null) {
				if (temp1.getData() == temp2.getData()) {
					return temp1;
				} else {
					temp1 = temp1.getNextRef();
					temp2 = temp2.getNextRef();
				}
			}

		} else {
			Node temp2 = head2;
			int count = 0;
			while (count < max) {
				temp2 = temp2.getNextRef();
				count++;
			}
			Node temp1 = head1;
			while (temp1 != null && temp2 != null) {
				if (temp1.getData() == temp2.getData()) {
					return temp1;
				} else {
					temp1 = temp1.getNextRef();
					temp2 = temp2.getNextRef();
				}
			}
		}
		return null;
	}

	private static int getLength(Node head) {
		Node temp = head;
		int length = 0;
		while (temp != null) {
			temp = temp.getNextRef();
			length++;
		}
		return length;
	}

	private static SingleLinkedList intersectionOfTwoList(Node head1, Node head2) {
		SingleLinkedList intersectionList = new SingleLinkedList();
		Node temp1 = head1;
		Node temp2 = head2;
		while (temp1 != null && temp2 != null) {
			if (temp1.getData() > temp2.getData()) {
				temp2 = temp2.getNextRef();
			} else if (temp1.getData() < temp2.getData()) {
				temp1 = temp1.getNextRef();
			} else if (temp1.getData() == temp2.getData()) {
				intersectionList.addNodeAtEnd(temp1.getData());
				temp1 = temp1.getNextRef();
				temp2 = temp2.getNextRef();
			}
		}
		return intersectionList;
	}

}
