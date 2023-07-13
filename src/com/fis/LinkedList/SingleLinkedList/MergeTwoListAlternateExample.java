package com.fis.LinkedList.SingleLinkedList;

public class MergeTwoListAlternateExample {

	public static void main(String[] args) {

		SingleLinkedList linkedList1 = new SingleLinkedList();
		linkedList1.addNodeAtEnd(1);
		linkedList1.addNodeAtEnd(3);
		linkedList1.addNodeAtEnd(5);
		linkedList1.addNodeAtEnd(7);
		linkedList1.addNodeAtEnd(9);
		// linkedList1.addNodeAtEnd(1);

		SingleLinkedList linkedList2 = new SingleLinkedList();
		linkedList2.addNodeAtEnd(2);
		linkedList2.addNodeAtEnd(4);
		linkedList2.addNodeAtEnd(6);
		linkedList2.addNodeAtEnd(8);
		linkedList2.addNodeAtEnd(10);
		// linkedList1.addNodeAtEnd(1);

		Node head = mergeList(linkedList1.head, linkedList2.head);
		displayList(head);

	}

	private static void displayList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNextRef();
		}

	}

	private static Node mergeList(Node head1, Node head2) {
		Node temp1 = head1;
		Node temp2 = head2;
		while (temp1 != null) {

			Node temp1Next = temp1.getNextRef();
			Node temp2Next = temp2.getNextRef();
			temp2.setNextRef(temp1Next);
			temp1.setNextRef(temp2);
			temp1 = temp1.getNextRef().getNextRef();
			temp2 = temp2Next;

		}

		return head1;
	}

}
