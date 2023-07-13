package com.fis.Stack;

class CustomStackException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomStackException() {
		super();
	}

	public CustomStackException(String message) {
		super(message);
	}
}

class CustomStack {

	int arr[] = new int[10];
	int size = 10;
	int top = -1;

	public void push(int item) {
		arr[++top] = item;
	}

	public int peek() {
		return arr[top];
	}

	public int pop() {
		if (top == -1) {
			throw new CustomStackException("Stack is Empty");
		} else {
			return arr[top--];
		}
	}

	public void display() {
		for (int i = top; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

	public boolean isFull() {
		return top == size;

	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void getMinimum() {

	}

}

public class ImplementStack {

	public static void main(String[] args) {

		CustomStack customStack = new CustomStack();
		customStack.push(10);
		customStack.push(30);
		customStack.push(90);
		customStack.push(40);
		customStack.display();
		// System.out.println(customStack.peek());
		System.out.println(customStack.pop());
		System.out.println("After Popping..");
		customStack.display();
		customStack.isFull();
		customStack.isEmpty();
		customStack.getMinimum();
		System.out.println(customStack.pop());
		//System.out.println(customStack.pop());
		//System.out.println(customStack.pop());
		//System.out.println(customStack.pop());
		//System.out.println(customStack.pop());

	}

}
