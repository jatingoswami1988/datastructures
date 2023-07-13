package com.fis.tree;

public class MaximumWidthOfABinaryTree {

	
	/////////////  Similar sum sum level order
	
	private static int maxWidth = 0;

	public static void main(String[] args) {

		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = new Node(1);
		binaryTree.root.left = new Node(2);
		binaryTree.root.right = new Node(3);
		binaryTree.root.left.left = new Node(4);
		binaryTree.root.left.right = new Node(5);
		binaryTree.root.right.left = new Node(6);
		binaryTree.root.right.right = new Node(7);

		int maxHeight = getHeight(binaryTree.root);
		for (int i = 1; i <= maxHeight; i++) {
			int tempWidth = getWidth(binaryTree.root, i);
			if (tempWidth > maxWidth) {
				maxWidth = tempWidth;
			}
		}
		
		
		System.out.println(maxWidth);
	}

	private static int getWidth(Node root, int level) {
		if (root == null) {
			return 0;
		} else if (level == 1) {
			return 1;
		}
		return getWidth(root.left, level - 1) + getWidth(root.right, level - 1);
	}

	private static int getHeight(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(getHeight(root.left), getHeight(root.right));

	}

}
