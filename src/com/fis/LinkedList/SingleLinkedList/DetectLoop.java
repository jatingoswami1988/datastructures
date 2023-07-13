package com.fis.LinkedList.SingleLinkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DetectLoop {

	public static void main(String[] args) {

		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNodeAtEnd(1);
		linkedList.addNodeAtEnd(2);
		linkedList.addNodeAtEnd(3);
		linkedList.addNodeAtEnd(4);
		linkedList.addNodeAtEnd(5);
		linkedList.addNodeAtEnd(6);

		// linkedList.tail.setNextRef(linkedList.head); // For Loop
		linkedList.tail.setNextRef(linkedList.head.getNextRef().getNextRef());

		/*
		 * if (detectLoop(linkedList.head)) { System.out.println("TRUE"); } else {
		 * System.out.println("FALSE"); }
		 */

		// SlowPointer / FastPointer // Floyd’s Cycle-Finding Algorithm
		// Flag visited
		Node slowPointer = linkedList.head;
		Node fastPointer = linkedList.head;
		boolean flag = false;
		while (fastPointer != null && fastPointer.getNextRef().getNextRef() != null) {
			slowPointer = slowPointer.getNextRef();
			fastPointer = fastPointer.getNextRef().getNextRef();
			if (slowPointer == fastPointer) {
				flag = true;
				break;
			}
		}

		System.out.println(flag + " - "+fastPointer.getData());
		slowPointer = linkedList.head;
		Node prev = null;
		while (slowPointer != null) {
			prev = fastPointer;
			slowPointer = slowPointer.getNextRef();
			fastPointer = fastPointer.getNextRef();
			if (slowPointer == fastPointer) {
				prev.setNextRef(null);
				break;
			}
		}
		linkedList.displayList();
		
		System.out.println("Check if loop exists");
		
		slowPointer = linkedList.head;
		fastPointer = linkedList.head;
		flag = false;
		while (fastPointer != null && fastPointer.getNextRef().getNextRef() != null) {
			slowPointer = slowPointer.getNextRef();
			fastPointer = fastPointer.getNextRef().getNextRef();
			if (slowPointer == fastPointer) {
				flag = true;
				break;
			}
		}
		
		System.out.println(flag + " - "+fastPointer.getData());
	}

	private static boolean detectLoop(Node head) {
		Set<Node> hashMap = new HashSet();
		Node temp = head;
		while (temp != null) {
			if (hashMap.contains(temp)) {
				return Boolean.TRUE;
			}
			hashMap.add(temp);
			temp = temp.getNextRef();
		}
		return false;
	}
}
