package com.fis.tree.BinarySearchTree;

public class FindTheMinimumElementInBinarySearchTree {

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		int min = findMinimumElementInBST(tree.root);
		System.out.println(min);
	}

	private static int findMinimumElementInBST(Node root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null) {
			return root.key;
		}
		return findMinimumElementInBST(root.left);
	}

}
