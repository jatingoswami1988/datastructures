package com.fis.Stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CheckForBalancedParenthesesInAnExpression {

	public static void main(String[] args) {

		String parenthesis = "[()]{}{[()()]()}";
		List<Character> openingParenthesis = Arrays.asList('[', '{', '(');
		List<Character> closingParenthesis = Arrays.asList(']', '}', ')');
		if (checkForBalancedParenthesesInAnExpression(parenthesis.toCharArray(), openingParenthesis,
				closingParenthesis)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

	private static boolean checkForBalancedParenthesesInAnExpression(char[] array, List<Character> openingParenthesis,
			List<Character> closingParenthesis) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < array.length; i++) {
			if (openingParenthesis.contains(array[i])) {
				stack.push(array[i]);
			} else {
				Character temp = stack.pop();
				if (check(array[i], temp)) {
					continue;
				} else {
					return Boolean.TRUE;
				}
			}
		}
		return Boolean.TRUE;
	}

	private static Boolean check(Character c, Character temp) {
		if (c.equals(']') && temp.equals('[')) {
			return Boolean.TRUE;
		} else if (c.equals('}') && temp.equals('{')) {
			return Boolean.TRUE;
		} else if (c.equals(')') && temp.equals('(')) {
			return Boolean.TRUE;
		} else
			return Boolean.FALSE;
	}

}
