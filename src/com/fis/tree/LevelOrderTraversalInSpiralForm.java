package com.fis.tree;

public class LevelOrderTraversalInSpiralForm {

	// public static boolean flag = true;

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(26);
		tree.root.left = new Node(10);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(6);
		tree.root.right.right = new Node(9);
		boolean flag = false;
		int maxHeight = maxHeight(tree.root);
		for (int i = 1; i <= maxHeight; i++) {
			levelOrderTraversalInSpiralForm(tree.root, i, flag);
			flag = !flag;
		}

	}

	private static int maxHeight(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxHeight(root.left), maxHeight(root.right));
	}

	private static void levelOrderTraversalInSpiralForm(Node root, int level, boolean flag) {
		if (root == null) {
			return;
		} else if (level == 1) {
			System.out.print(root.key + " ");
		} else if (level > 1) {
			if (flag) {
				levelOrderTraversalInSpiralForm(root.left, level - 1, flag);
				levelOrderTraversalInSpiralForm(root.right, level - 1, flag);
			} else {
				levelOrderTraversalInSpiralForm(root.right, level - 1, flag);
				levelOrderTraversalInSpiralForm(root.left, level - 1, flag);
			}
		}
	}

}
