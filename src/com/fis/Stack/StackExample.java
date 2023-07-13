package com.fis.Stack;

import java.util.Stack;

public class StackExample {
	
	public static void main(String args[]){
		
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(stack.empty());
		stack.push(23);
		stack.push(22);
		stack.push(29);
		stack.push(34);
		stack.peek();//Looks at the object at the top of this stack without removing it from the stack.
		stack.pop();//Removes the object at the top of this stack and returns thatobject as the value of this function.
		System.out.println(stack.toString());
		//System.out.println(.stack.to);
		
	}

}
