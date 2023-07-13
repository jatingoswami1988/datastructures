package com.fis.Stack;

import java.util.Stack;

public class ReverseAStackUsingRecursion {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		stack.push(67);
		stack.push(23);
		stack.push(90);
		stack.push(78);
		stack.push(11);
		reverseStack(stack);
		stack.toString();

	}

	private static void reverseStack(Stack<Integer> stack) {

		while (!stack.isEmpty()) {

			Integer temp = stack.peek();
			stack.pop();
			reverseStack(stack);
			insertIntoStack(stack, temp);
		}

	}

	private static void insertIntoStack(Stack<Integer> stack, Integer temp) {

		stack.push(temp);

	}

}
