package com.fis.tree.BinarySearchTree;

public class LowestCommonAncestorInBST {

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(5);
		tree.insert(2);
		tree.insert(1);
		tree.insert(3);
		tree.insert(6);
		tree.insert(5);

		Node n = getLCAOfBST(tree.root, 3, 6);
		System.out.println(n.key);

	}

	private static Node getLCAOfBST(Node root, int i, int j) {
		if (root == null) {
			return null;
		}
		if (root.key > i && root.key > j) {
			return getLCAOfBST(root.left, i, j);
		}
		if (root.key < i && root.key < j) {
			return getLCAOfBST(root.right, i, j);
		}
		return root;
	}

}
