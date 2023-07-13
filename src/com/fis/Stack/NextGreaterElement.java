package com.fis.Stack;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String args[]) {

		Stack<Integer> stack = new Stack<Integer>();
		int arr[] = { 4, 5, 2, 25 };
		for (int i = 0; i < arr.length; i++) {
			int next = arr[i];
			if (!stack.isEmpty()) {
				int element = stack.pop();
				while (element < next) {
					System.out.println(element + " --> " + next);
					if (stack.isEmpty()) {
						break;
					}
					element = stack.pop();
				}
				if (element > next)
					stack.push(element);
			}
			stack.push(next);
		}

		while (!stack.isEmpty()) {
			System.out.println(stack.pop()+" --> "+"-1");
		}
	}
}
