package com.fis.LinkedList.SingleLinkedList;

import java.util.Stack;

public class CheckOfLinkedListIsPallindrome {

	public static void main(String[] args) {
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNodeAtEnd(1);
		linkedList.addNodeAtEnd(1);
		linkedList.addNodeAtEnd(2);
		linkedList.addNodeAtEnd(1);
		linkedList.addNodeAtEnd(2);
		linkedList.addNodeAtEnd(1);

		/// Using reverse
		Node newList = createNewList(linkedList.head);
		Node newListReverse = reverse(newList);
		boolean status = checkForPallindrome(linkedList.head, newListReverse);
		System.out.println(status);
		
		 
		 
		 //// Using Stack
		if (checkOfLinkedListIsPallindrome(linkedList.head)) { // using Stack
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		// by Reversing
		/*
		 * if (checkOfLinkedListIsPallindromeUsingReverse(linkedList.head)) {
		 * System.out.println("TRUE"); } else { System.out.println("FALSE"); }
		 */

	}

	private static Node createNewList(Node head) {
		Node temp = head;
		SingleLinkedList linkedList = new SingleLinkedList();
		while (temp != null) {
			linkedList.addNodeAtEnd(temp.getData());
			temp = temp.getNextRef();
		}
		return linkedList.head;
	}

	private static boolean checkForPallindrome(Node head, Node newList) {
		Node temp = head;
		boolean flag = true;
		while (temp != null) {
			if (temp.getData() != newList.getData()) {
				return false;
			}
			temp = temp.getNextRef();
			newList = newList.getNextRef();
		}
		return flag;
	}

	private static Node reverse(Node head) {
		Node temp = head;
		Node prev = null;
		Node next = null;
		while (temp != null) {
			next = temp.getNextRef();
			temp.setNextRef(prev);
			prev = temp;
			temp = next;
		}
		return prev;
	}

	/*
	 * This method takes O(n) time and O(1) extra space. 1) Get the middle of the
	 * linked list. 2) Reverse the second half of the linked list. 3) Check if the
	 * first half and second half are identical. 4) Construct the original linked
	 * list by reversing the second half again and attaching it back to the first
	 * half
	 */
	private static boolean checkOfLinkedListIsPallindromeUsingReverse(Node head) {

		return false;
	}

	private static boolean checkOfLinkedListIsPallindrome(Node head) {
		Stack<Integer> stack = new Stack<Integer>();
		Node temp = head;
		while (temp != null) {
			stack.push(temp.getData());
			temp = temp.getNextRef();
		}

		temp = head;
		while (temp != null) {
			if (temp.getData() != stack.pop()) {
				return false;
			} else {
				temp = temp.getNextRef();
			}
		}

		return true;
	}

}
