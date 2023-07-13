package com.fis.Stack;

import java.util.Stack;

public class DleeteMiddleElementOfStack {

	public static void main(String[] args) {

		Stack<Character> st = new Stack<Character>();
		st.push('1');
		st.push('2');
		st.push('3');
		st.push('4');
		st.push('5');
		st.push('6');
		st.push('7');

		deleteMiddle(st, st.size(), 0);
		System.out.println(st.toString());

	}

	private static void deleteMiddle(Stack<Character> st, int size, int curr) {

		if (st.isEmpty() || curr == size) {
			return;
		}

		char c = st.pop();
		deleteMiddle(st, size, curr + 1);

		if (curr != size / 2)
			st.push(c);

	}

}
