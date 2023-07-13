package com.fis.LinkedList.DoubleLinkedList;

public class ReverseDoubleLinkedList {

	public static void main(String[] args) {

		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		doubleLinkedList.add(12);
		doubleLinkedList.add(14);
		doubleLinkedList.add(1);
		doubleLinkedList.add(7);
		doubleLinkedList.add(90);
		doubleLinkedList.add(13);
		doubleLinkedList.add(66);
		Node head = reverse(doubleLinkedList.head);
		doubleLinkedList.head = head;
		doubleLinkedList.display();
	}

	private static Node reverse(Node head) {

		Node temp = head;
		Node prev = null;
		Node next = null;
	   while(temp!=null) {
			next = temp.getNext();
			temp.setNext(prev);
			prev= temp;
			temp = next;
		}
	   head = prev;
		
		return head;
	}

}
