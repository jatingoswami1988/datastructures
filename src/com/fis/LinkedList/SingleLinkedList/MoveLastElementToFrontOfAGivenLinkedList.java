package com.fis.LinkedList.SingleLinkedList;

public class MoveLastElementToFrontOfAGivenLinkedList {

	public static void main(String[] args) {

		// 1->2->3->4->5
		// 5->1->2->3->4

		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNodeAtEnd(1);
		linkedList.addNodeAtEnd(2);
		linkedList.addNodeAtEnd(3);
		linkedList.addNodeAtEnd(4);
		linkedList.addNodeAtEnd(5);

		Node head = moveLastElementToFrontOfAGivenLinkedList(linkedList.head);
		linkedList.head = head;
		linkedList.displayList();
	}

	private static Node moveLastElementToFrontOfAGivenLinkedList(Node head) {

		Node temp = head;
		Node prev = null;
		while (temp != null) {
			prev = temp;
			temp = temp.getNextRef();
			if (temp.getNextRef() == null) {
				prev.setNextRef(null);
				temp.setNextRef(head);
				return temp;
			}
		}
		return temp;
	}
}
