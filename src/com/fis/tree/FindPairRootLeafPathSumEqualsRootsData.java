package com.fis.tree;

public class FindPairRootLeafPathSumEqualsRootsData {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(5);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(4);
		tree.root.left.right.left = new Node(6);
		tree.root.left.right.right = new Node(8);

		findPairRootLeafPathSumEqualsRootsData(tree.root, tree.root.key);

	}

	private static void findPairRootLeafPathSumEqualsRootsData(Node root, int sum) {

		if (root == null || root.left == null || root.right == null) {
			return;
		} else if (sum == root.left.key + root.right.key) {
			System.out.println("(" + root.left.key + "," + root.right.key + ")");
			findPairRootLeafPathSumEqualsRootsData(root.left, sum);
			findPairRootLeafPathSumEqualsRootsData(root.right, sum);
		}

	}

}
