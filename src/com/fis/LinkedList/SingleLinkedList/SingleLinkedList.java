package com.fis.LinkedList.SingleLinkedList;

class Node {

	private int data;
	private Node nextRef;

	public Node(int data) {
		this.data = data;
	}

	public Node() {

	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextRef() {
		return nextRef;
	}

	public void setNextRef(Node nextRef) {
		this.nextRef = nextRef;
	}

}

public class SingleLinkedList {

	public Node head;
	public Node tail;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public void addNodeAtEnd(int data) {

		Node n = new Node();
		n.setData(data);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			tail.setNextRef(n);
			tail = n;
		}

	}

	public void displayList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + "  ");
			temp = temp.getNextRef();
		}
		System.out.println("");
	}

	public void addAtStart() {

	}

	public void addAtGivenPosition() {
		// TODO Auto-generated method stub

	}

	public void deleteFromStart() {
		// TODO Auto-generated method stub

	}

	public void deleteAtGivenPosition() {
		// TODO Auto-generated method stub

	}

	public void deleteFromEnd() {
		// TODO Auto-generated method stub

	}

	public void sortLinkedList() {

		Node temp = head;
		while (temp != null) {
			Node innerTemp = temp.getNextRef();
			while (innerTemp != null) {
				if (temp.getData() > innerTemp.getData()) {
					int dummy = temp.getData();
					temp.setData(innerTemp.getData());
					innerTemp.setData(dummy);
				}
				innerTemp = innerTemp.getNextRef();
			}
			temp = temp.getNextRef();
		}

	}

	public void reverseLinkedList() {

		Node current = head;
		Node prev = null;
		Node next = null;

		while (current != null) {

			next = current.getNextRef();
			current.setNextRef(prev);
			prev = current;
			current = next;
		}
		head = prev;

	}

}
