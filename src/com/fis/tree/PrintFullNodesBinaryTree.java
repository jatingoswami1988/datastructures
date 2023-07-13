package com.fis.tree;

public class PrintFullNodesBinaryTree {

	// Full Nodes are nodes which has both left and right children as non-empty.

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(26);
		tree.root.left = new Node(10);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(6);
		tree.root.right.right = new Node(3);

		printFullNodesBinaryTree(tree.root);

	}

	private static void printFullNodesBinaryTree(Node root) {

		if (root == null) {
			return;
		} else {

			if (root.left != null && root.right != null) {
				System.out.println(root.key);
				
			}
			
			printFullNodesBinaryTree(root.left);
			printFullNodesBinaryTree(root.right);

		}

	}

}
