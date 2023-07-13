package com.fis.tree;

public class MaximumSpiralSumInBinaryTree {

	public static void main(String[] args) {

		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = new Node(1);
		binaryTree.root.left = new Node(2);
		binaryTree.root.right = new Node(3);
		binaryTree.root.left.left = new Node(4);
		binaryTree.root.left.right = new Node(5);
		binaryTree.root.right.left = new Node(6);
		binaryTree.root.right.right = new Node(7);

		int maxHeight = getMaxHeight(binaryTree.root);
		boolean flag = false;
		for (int i = 1; i <= maxHeight; i++) {
			spiralTraversal(binaryTree.root, i, flag);
			flag = !flag;
		}

	}

	private static int getMaxHeight(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(getMaxHeight(root.left), getMaxHeight(root.right));
	}

	private static void spiralTraversal(Node root, int level, boolean flag) {

		if (root == null) {
			return;
		} else if (level == 1) {
			System.out.print(root.key + " ");
		} else if (level > 1) {
			if (flag)
				spiralTraversal(root.left, level - 1, flag);
			    spiralTraversal(root.right, level - 1, flag);
		} else {
			    spiralTraversal(root.right, level - 1, flag);
			    spiralTraversal(root.left, level - 1, flag);
		}

	}

}
