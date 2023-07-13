package com.fis.tree;

public class BFSExample {

	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		int height = HeightOfTree.maxDepth(tree.root);
		for (int i = 1; i <= height; i++) {
			printBFS(tree.root, i);
		}

		/// Spiral Form

		boolean flag = Boolean.FALSE;
		for (int i = 1; i <= height; i++) {
			printBFSSpiralForm(tree.root, i, flag);
		}
		
		/// Reverse Travelling
		
		for (int i = height; i >=1; i++) {
			printBFSSpiralForm(tree.root, i, flag);
		}

	}

	private static void printBFSSpiralForm(Node root, int level, boolean flag) {

		if (root == null) {
			return;
		} else if (level == 1) {
			System.out.println(root.key + " ");
		} else if (level > 1) {
			if (flag) {
				printBFS(root.left, level - 1);
				printBFS(root.right, level - 1);
			} else {
				printBFS(root.right, level - 1);
				printBFS(root.left, level - 1);
				
			}
		}
	}

	private static void printBFS(Node root, int level) {
		if (root == null) {
			return;
		} else if (level == 1) {
			System.out.print(root.key + " ");
		} else if (level > 1) {
			printBFS(root.left, level - 1);
			printBFS(root.right, level - 1);
		}
	}
}
