package com.fis.tree;

public class FindNthNodeInorderTraversal {

	public static int nth = 4;

	public static int count = 0;

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(26);
		tree.root.left = new Node(10);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(6);
		tree.root.right.right = new Node(3);

		inorderTraversal(tree.root);

	}

	private static void inorderTraversal(Node root) {

		if (root == null) {
			return;
		} else if (count <= nth) {
			inorderTraversal(root.left);
			count = count + 1;
			if (count == nth) {
				System.out.println(root.key);
			}
			inorderTraversal(root.right);
		}

	}

}
