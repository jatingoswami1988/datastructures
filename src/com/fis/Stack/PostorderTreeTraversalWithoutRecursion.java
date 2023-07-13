package com.fis.Stack;

import java.util.Stack;

public class PostorderTreeTraversalWithoutRecursion {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		postorder(tree.root);

	}

	private static void postorder(Node root) {
		Stack<Node> stack = new Stack<>();
		while (true) {
			while (root != null) {
				stack.push(root);
				stack.push(root);
				root = root.left;
			}
			if (stack.empty())
				return;
			root = stack.pop();
			if (!stack.empty() && stack.peek() == root) {
				root = root.right;
			} else {
				System.out.print(root.key + " ");
				root = null;
			}
		}
	}

}
