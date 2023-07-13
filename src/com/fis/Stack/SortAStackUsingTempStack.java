package com.fis.Stack;

import java.util.Stack;

public class SortAStackUsingTempStack {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> tempStack = new Stack<Integer>();
		stack.push(34);
		stack.push(3);
		stack.push(31);
		stack.push(98);
		stack.push(92);
		stack.push(23);
		sortStack(stack,tempStack);
		System.out.println(tempStack.toString());
		
	}

	private static void sortStack(Stack<Integer> stack, Stack<Integer> tempStack) {
		while (!stack.isEmpty()) {
			int temp = stack.pop();  // tempStack top > temp
			while (!tempStack.isEmpty() && tempStack.peek() > temp) {
				stack.push(tempStack.pop());
			}
			tempStack.push(temp);
		}
	}
}
