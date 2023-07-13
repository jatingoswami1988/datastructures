package com.fis.Stack;

import java.util.Stack;

public class ReverseIndividualWords {

	public static void main(String[] args) {

		String name = "Hello World";
		String s[] = name.split(" ");
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length; i++) {
			char c[] = s[i].toCharArray();
			for (int j = 0; j < c.length; j++) {
				stack.push(c[j]);
			}
			while (!stack.isEmpty()) {
				System.out.print(stack.pop());
			}
			System.out.print(" ");
		}

	}

}
