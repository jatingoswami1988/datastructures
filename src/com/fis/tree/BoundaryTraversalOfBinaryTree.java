package com.fis.tree;

public class BoundaryTraversalOfBinaryTree {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(12);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(14);
		tree.root.right = new Node(22);
		tree.root.right.right = new Node(25);
		printBoundary(tree.root);

	}

	public static void printBoundary(Node root) {
		System.out.print(root.key + " ");
		printLeftBoundary(root.left);
		printRightBoundary(root.right);
		printLeafNode(root.left);
		printLeafNode(root.right);

	}

	private static void printLeftBoundary(Node root) {

		if (root == null || root.left == null) {
			return;
		}
		System.out.print(root.key + " ");
		printLeftBoundary(root.left);
	}

	private static void printRightBoundary(Node root) {
		if (root == null || root.right == null) {
			return;
		}
		System.out.print(root.key + " ");
		printRightBoundary(root.right);
	}

	private static void printLeafNode(Node root) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			System.out.print(root.key + " ");
		} else {
			printLeafNode(root.left);
			printLeafNode(root.right);
		}
	}

}
