package com.fis.tree;

public class ReverseLevelOrderTraversal {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(26);
		tree.root.left = new Node(10);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(6);
		tree.root.right.right = new Node(3);

		int maxHeight = getMaxHeight(tree.root);
		for (int i = maxHeight; i >= 1; i--) {
			printReverse(tree.root, i);
		}

	}

	private static void printReverse(Node root, int level) {

		if (root == null) {
			return;
		}

		if (level == 1) {
			System.out.print(root.key + " ");
		}

		if (level > 1) {
			printReverse(root.left, level - 1);
			printReverse(root.right, level - 1);
		}

	}

	private static int getMaxHeight(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(getMaxHeight(root.left), getMaxHeight(root.right));
	}

}
