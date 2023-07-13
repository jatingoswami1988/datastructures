package com.fis.tree;

public class PrintNodesOddLevelsTree {

	public static void main(String[] args) {
	    //// IMPORTANT
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(26);
		tree.root.left = new Node(10);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(6);
		tree.root.right.right = new Node(3);
		printNodesOddLevelsTree(tree.root, true);

	}

	private static void printNodesOddLevelsTree(Node root, boolean flag) {

		if (root == null) {
			return;
		}

		if (flag) {
			System.out.print(root.key+" ");
		}

		printNodesOddLevelsTree(root.left, !flag);
		printNodesOddLevelsTree(root.right, !flag);

	}

	private static void printOddLevels(Node root, int level) {
		if (root == null) {
			return;
		}

		if (level % 2 != 0) {
			System.out.println(root.key);
			// return;
		}
		if (level % 2 == 0) {
			printOddLevels(root.left, level);
			printOddLevels(root.right, level);
		}

	}

	private static int getMaxHeight(Node root) {
		if (root == null) {
			return 0;
		} else {
			return 1 + Math.max(getMaxHeight(root.left), getMaxHeight(root.right));
		}
	}

}
