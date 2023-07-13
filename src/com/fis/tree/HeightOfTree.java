package com.fis.tree;

public class HeightOfTree {

	public static void main(String[] args) {

		// Max of left n right sub tree + 1

		BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Height of tree is : " + maxDepth(tree.root));

	}

	public static int maxDepth(Node node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
		}
	}
}
