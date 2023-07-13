package com.fis.LinkedList.SingleLinkedList;

public class Add1NumberRepresentedLinkedList {

	public static void main(String[] args) {

		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNodeAtEnd(9);
		linkedList.addNodeAtEnd(9);
		linkedList.addNodeAtEnd(9);
		linkedList.addNodeAtEnd(9);
		linkedList.reverseLinkedList();
		Node n = add1NumberRepresentedLinkedList(linkedList.head, 1);
		linkedList.head = n;
		linkedList.reverseLinkedList();
		linkedList.displayList();
	}

	private static Node add1NumberRepresentedLinkedList(Node head, int number) {
		Node temp = head;
		int carry = 0;
		int no = 0;
		while (temp != null) {
			if (carry == 1) {
				no = temp.getData() + carry;
			} else {
				no = temp.getData() + number;
			}
			if (no >= 10) {
				carry = 1;
				temp.setData(0);
			} else {
				temp.setData(no);
				carry = 0;
			}
			if (temp.getNextRef() == null && carry == 1) {
				Node n = new Node(carry);
				temp.setNextRef(n);
				carry = 0;
			} else {
				temp = temp.getNextRef();
			}
		}
		// }

		return head;
	}

}
