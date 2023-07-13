package com.fis.LinkedList.CircularLinkedList;

class Node {

	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

public class CircularLinkedList {

	Node head;
	Node tail;

	public static void main(String[] args) {
		CircularLinkedList circularLinkedList = new CircularLinkedList();
		circularLinkedList.addInCircularList(1);
		circularLinkedList.addInCircularList(2);
		circularLinkedList.addInCircularList(3);
		circularLinkedList.addInCircularList(4);
		circularLinkedList.display();
		// circularLinkedList.sort();
		System.out.println("");
		if (checkIfCircular(circularLinkedList.head)) {
			System.out.println("Circular");
		} else {
			System.out.println("Not Circular");
		}
		circularLinkedList.deleteGivenNode(3);
		circularLinkedList.display();
	}

	private void deleteGivenNode(int data) {
		Node temp = this.head;
		Node prev = null;
		do {
			if (temp.getData() == data) {
				prev.setNext(temp.getNext());
				break;
			} else {
				prev = temp;
				temp = temp.getNext();
			}
		} while (temp != null && temp != this.head);

	}

	private static boolean checkIfCircular(Node head) {
		Node temp = head;
		do {
			temp = temp.getNext();
			if (temp == head) {
				return true;
			}
		} while (temp != null);
		return false;
	}

	public void addInCircularList(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
			tail = n;
			tail.setNext(head);
		} else {
			tail.setNext(n);
			tail = n;
			tail.setNext(head);
		}
	}

	public void display() {
		Node temp = this.head;
		do {
			System.out.print(" " + temp.data);
			temp = temp.getNext();
		} while (temp != null && temp != head);
	}

	private void sort() {
		Node temp = this.head;
		do {

		} while (temp.getNext() != this.head);

	}

}
