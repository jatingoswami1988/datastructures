package com.fis.LinkedList.DoubleLinkedList;

class Node {

	int data;
	Node prev;
	Node next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}

public class DoubleLinkedList {

	Node head;
	Node tail;

	public static void main(String args[]) {

		DoubleLinkedList dll = new DoubleLinkedList();
		dll.add(5);
		dll.add(12);
		dll.add(78);
		dll.add(35);
		dll.display();

	}

	public void display() {

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.getNext();
			System.out.print(" ");
		}

	}

	public  void add(int data) {
		Node n = new Node();
		n.setData(data);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			Node temp = tail;
			temp.setNext(n);
			tail = n;
			tail.setPrev(temp);

		}
	}

}
