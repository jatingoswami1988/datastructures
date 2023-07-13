package com.fis.LinkedList.SingleLinkedList;

public class RemoveDuplicatesFromSortedLinkedList {

	public static void main(String[] args) {

		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNodeAtEnd(10);
		linkedList.addNodeAtEnd(11);
		linkedList.addNodeAtEnd(11);
		linkedList.addNodeAtEnd(11);
		linkedList.addNodeAtEnd(14);
		linkedList.addNodeAtEnd(18);
		linkedList.addNodeAtEnd(20);
		removeDuplicate(linkedList.head);
		linkedList.displayList();
	}

	private static void removeDuplicate(Node head) {
		Node temp = head;
		while (temp != null && temp.getNextRef() != null) {
			if (temp.getData() == temp.getNextRef().getData()) {
				temp.setNextRef(temp.getNextRef().getNextRef());
			} else {
				temp = temp.getNextRef();
			}
		}
	}

}
