package com.fis.LinkedList.SingleLinkedList;

public class MiddleOfLinkedList {

	public static void main(String[] args) {

		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNodeAtEnd(1);
		linkedList.addNodeAtEnd(2);
		linkedList.addNodeAtEnd(3);
		linkedList.addNodeAtEnd(4);
		linkedList.addNodeAtEnd(5);
		linkedList.addNodeAtEnd(15);

		Node n = getMiddle(linkedList.head);
		System.out.println(n.getData());
		
		// middle to next node - fastPointer != null && fastPointer.getNextRef() != null && fastPointer.getNextRef().getNextRef()!=null
		// middle fastPointer != null && fastPointer.getNextRef() != null
	}

	private static Node getMiddle(Node head) {
		Node slowPointer = head;
		Node fastPointer = head;
		while (fastPointer != null && fastPointer.getNextRef() != null && fastPointer.getNextRef().getNextRef()!=null) {
			slowPointer = slowPointer.getNextRef();
			fastPointer = fastPointer.getNextRef().getNextRef();
		}
		return slowPointer;
	}

}
