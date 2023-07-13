package com.fis.Stack;

import java.util.Stack;

public class InorderTreeTraversalWithoutRecursion {

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

		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			while (root.left != null) {
				stack.push(root.left);
				root = root.left;
			}

			Node node = stack.pop();
			System.out.print(node.key+" ");
			while (node.right != null) {
				stack.push(node.right);
				node = node.right;
			}
		}

	}

}
