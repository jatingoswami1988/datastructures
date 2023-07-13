package com.fis.LinkedList.SingleLinkedList;

public class DeleteNodesWhichHaveAGreaterValueOnRightSide {

	public static void main(String[] args) {
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNodeAtEnd(12);
		linkedList.addNodeAtEnd(15);
		linkedList.addNodeAtEnd(10);
		linkedList.addNodeAtEnd(11);
		linkedList.addNodeAtEnd(5);
		linkedList.addNodeAtEnd(6);
		linkedList.addNodeAtEnd(2);
		linkedList.addNodeAtEnd(3);

		Node head = deleteNodesWhichHaveAGreaterValueOnRightSide(linkedList, linkedList.head);
		linkedList.displayList(); // 17 > 15 > 11 > 6 > 3
	}

	private static Node deleteNodesWhichHaveAGreaterValueOnRightSide(SingleLinkedList linkedList, Node head) {
		Node temp = head;
		Node prev = null;
		while (temp != null && temp.getNextRef() != null) {
			if (temp.getData() < temp.getNextRef().getData()) {
				if (prev == null) {
					linkedList.head = temp.getNextRef();
				} else {
					prev.setNextRef(temp.getNextRef());
				}
			} else {
				prev = temp;
			}
			temp = temp.getNextRef();
		}
		// head = temp;
		return linkedList.head;
	}

}
