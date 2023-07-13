package com.fis.Stack;

import java.util.Stack;

public class PreOrderTreeTraversalWithoutRecursion {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		inorder(tree.root);

	}

	private static void inorder(Node root) {
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node current = stack.pop();
			System.out.print(current.key+" ");
			if (current.right != null) {
				stack.push(current.right);
			}
			if (current.left != null) {
				stack.push(current.left);
			}
		}
	}

}
