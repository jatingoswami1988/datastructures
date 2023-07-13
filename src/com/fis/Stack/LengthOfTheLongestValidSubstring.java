package com.fis.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LengthOfTheLongestValidSubstring {

	public static void main(String[] args) {

		List<Character> opening = new ArrayList<>();
		opening.add('(');

		Stack<Character> stack = new Stack<Character>();
		String input = "()(()))))";
		char c[] = input.toCharArray();
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			if (stack.isEmpty()) {
				stack.push(c[i]);
			} else {
				if (opening.contains(c[i])) {
					stack.push(c[i]);
				} else {
					Character temp = stack.pop();
					if (check(c[i], temp)) {
						count = count + 2;
					}
				}
			}
		}
		System.out.println(count);
	}

	private static boolean check(char c, Character temp) {
		if (temp.equals('(') && c == ')') {
			return true;
		}
		return false;
	}

}
