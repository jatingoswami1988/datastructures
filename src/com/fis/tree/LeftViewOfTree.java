package com.fis.tree;

public class LeftViewOfTree {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.right = new Node(2);
		int height = tree.heightOfBinaryTree(tree.root);
		for(int i=0;i<height;i++) {
			leftView(tree.root,i);
		}

	}

	private static void leftView(Node root, int level) {
		if (root == null) {
			return;
		} else if (level == 1) {
			System.out.print(root.key + " ");
		} else {
			leftView(root.left, level - 1);
			leftView(root.right, level - 1);
		}
	}

	private static int getHeight(Node root) {

		return 0;
	}

}
