package com.fis.LinkedList.SingleLinkedList;

import java.util.Stack;

public class Practise {

	public static int result = 0;

	public static void main(String args[]) {

		SingleLinkedList linkedList1 = new SingleLinkedList();

		linkedList1.addNodeAtEnd(1);
		linkedList1.addNodeAtEnd(2);
		//linkedList1.addNodeAtEnd(4);
		linkedList1.addNodeAtEnd(7);

		SingleLinkedList linkedList2 = new SingleLinkedList();

		linkedList2.addNodeAtEnd(0);
		linkedList2.addNodeAtEnd(3);
		//linkedList2.addNodeAtEnd(4);
		//linkedList2.addNodeAtEnd(8);

		Node mergedList = mergeTwoLists(linkedList1.head, linkedList2.head);
		// mergedList.displayList();
		System.out.println(mergedList);
		while(mergedList!=null) {
			System.out.print(mergedList.getData()+"-");
			mergedList = mergedList.getNextRef();
		}

		// nextGreatestElement(linkedList.head);

		// int no = getTotalNoOfNode(linkedList.head);
		// int integerValue = (int) getIntegerValue(linkedList.head, no - 1);
		// System.out.println(integerValue);

		// System.out.println(getDecimalValue(linkedList.head));

		// boolean result = checkForLoop(linkedList.head);
		// System.out.println(result);
		// linkedList.head = removeElements(linkedList.head, 1);
		// linkedList.displayList();

		// linkedList1.head = deleteANode(linkedList1.head, 3);
		// linkedList1.displayList();
	}

	private static Node mergeTwoLists(Node l1, Node l2) {
		if (l1 == null || l2 == null) {
			return l1 == null ? l2 : l1;
		}
		
		if (l1.getData() > l2.getData()) {
			return mergeTwoLists(l2, l1);
		}
		
		Node temp = mergeTwoLists(l1.getNextRef(), l2);
		l1.setNextRef(temp);
		return l1;
	}

	private static Node deleteANode(Node head, int no) {
		Node temp = head;
		Node prev = null;
		while (temp != null) {
			if (temp.getData() == no) {
				if (prev == null) {
					temp = temp.getNextRef();
					head = temp;
				} else {
					prev.setNextRef(temp.getNextRef());
					temp = temp.getNextRef();
				}
			} else {
				prev = temp;
				temp = temp.getNextRef();
			}
		}
		return head;
	}

	public static int getDecimalValue(Node head) {
		if (head == null)
			return result;
		result = result << 1;
		result += head.getData();
		getDecimalValue(head.getNextRef());
		return result;

	}

	private static double getIntegerValue(Node head, int no) {
		Node temp = head;
		double integerValue = 0;
		while (temp != null) {
			double multiplier = Math.pow(2, no--);
			integerValue = integerValue + temp.getData() * multiplier;
			temp = temp.getNextRef();
		}
		return integerValue;
	}

	private static int getTotalNoOfNode(Node head) {
		Node temp = head;
		int no = 0;
		while (temp != null) {
			no++;
			temp = temp.getNextRef();
		}
		return no;
	}

	private static void nextGreatestElement(Node head) {

		Node temp = head;
		// Node next = temp.getNextRef();
		Stack<Integer> stack = new Stack<>();
		stack.push(head.getData());
		while (temp != null) {
			while (!stack.isEmpty()) {
				int peek = stack.peek();
				if (peek < temp.getData()) {

				} else {

				}

			}
		}
	}

	private static boolean checkForLoop(Node head) {

		Node slowPtr = head;
		Node fastPtr = head;

		while (slowPtr != null || fastPtr != null) {
			if (slowPtr == fastPtr) {
				return true;
			} else {
				slowPtr = slowPtr.getNextRef();
				fastPtr = fastPtr.getNextRef() != null ? fastPtr.getNextRef().getNextRef() : null;
			}
		}

		return false;
	}

	private static Node removeElements(Node head, int val) {
		Node temp = head;
		Node prev = null;
		while (temp != null) {
			if (temp.getData() == val) {
				if (prev == null) {
					Node nextNode = temp.getNextRef();
					temp.setNextRef(null);
					temp = nextNode;
				} else {
					prev.setNextRef(temp.getNextRef());
					temp = temp.getNextRef();
				}
			} else {
				prev = temp;
				temp = temp.getNextRef();
			}
		}
		return temp;
	}

}
