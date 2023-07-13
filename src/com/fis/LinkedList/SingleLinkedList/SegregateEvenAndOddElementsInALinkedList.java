package com.fis.LinkedList.SingleLinkedList;

public class SegregateEvenAndOddElementsInALinkedList {

	public static void main(String[] args) {

		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNodeAtEnd(17);
		linkedList.addNodeAtEnd(14);
		linkedList.addNodeAtEnd(9);
		linkedList.addNodeAtEnd(12);
		linkedList.addNodeAtEnd(1);
		linkedList.addNodeAtEnd(2);

		Node result = segregate(linkedList.head, linkedList.tail);
		linkedList.head = result;
		linkedList.displayList();
	}

	private static Node segregate(Node head, Node tail) {
		Node temp = head;
		Node prev = null;

		
		while (temp != tail) {
			if (temp.getData() % 2 == 0) {
				Node lastNode  = temp;
				Node nextNode = temp.getNextRef();
				prev.setNextRef(nextNode);
				temp = nextNode;
				lastNode.setNextRef(null);
				tail.setNextRef(lastNode);
			} else {
				prev = temp;
				temp = temp.getNextRef();
			}
		}
		return head;
	}

}
