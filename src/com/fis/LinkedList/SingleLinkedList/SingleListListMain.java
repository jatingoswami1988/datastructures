package com.fis.LinkedList.SingleLinkedList;

public class SingleListListMain {

	public static void main(String args[]) {

		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNodeAtEnd(5);
		linkedList.addNodeAtEnd(1);
		linkedList.addNodeAtEnd(578);
		linkedList.addNodeAtEnd(4);
		linkedList.addNodeAtEnd(34);
		//linkedList.displayList();
		// linkedList.addAtStart();
		// linkedList.addAtGivenPosition();
		// linkedList.deleteFromStart();
		// linkedList.deleteFromEnd();
		// linkedList.deleteAtGivenPosition();
		// linkedList.sortLinkedList();
		// linkedList.displayList();
		// linkedList.reverseLinkedList();
		// linkedList.displayList();
		Node node = reverseLinkedListUsingRecusion(linkedList.head, null, null);
		linkedList.head = node;
		linkedList.displayList();
	}

	private static Node reverseLinkedListUsingRecusion(Node temp, Node prev, Node next) {
		if (temp == null) {
			return prev;
		} else {
			next = temp.getNextRef();
			temp.setNextRef(prev);
			prev = temp;
			temp = next;
			Node previous = reverseLinkedListUsingRecusion(temp, prev, null);
			return previous;
		}
	}
}
