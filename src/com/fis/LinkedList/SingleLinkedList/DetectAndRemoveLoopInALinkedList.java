package com.fis.LinkedList.SingleLinkedList;

public class DetectAndRemoveLoopInALinkedList {

	public static void main(String[] args) {
		
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNodeAtEnd(1);
		linkedList.addNodeAtEnd(2);
		linkedList.addNodeAtEnd(3);
		linkedList.addNodeAtEnd(4);
		linkedList.addNodeAtEnd(5);
		linkedList.addNodeAtEnd(6);

		linkedList.tail.setNextRef(linkedList.head.getNextRef().getNextRef());

	}

}
