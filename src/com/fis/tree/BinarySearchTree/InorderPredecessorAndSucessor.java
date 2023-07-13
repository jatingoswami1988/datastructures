package com.fis.tree.BinarySearchTree;

public class InorderPredecessorAndSucessor {

	public static int predecessor = 0;
	public static int sucessor = 0;

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(5);
		tree.insert(3);
		tree.insert(7);
		tree.insert(2);
		tree.insert(4);
		tree.insert(6);
		tree.insert(9);

		preAndSucessor(tree.root, 3);
		System.out.println(predecessor + " - " + sucessor);
	}

	private static void preAndSucessor(Node root, int key) {
		if (root == null) {
			return;
		}
		if (root.key == key) {
			if (root.left != null) {
				Node tmp = root.left;
				while (tmp.right != null) {
					tmp = tmp.right;
				}
				predecessor = tmp.key;
			}

			if (root.right != null) {
				Node tmp = root.right;

				while (tmp.left != null)
					tmp = tmp.left;

				sucessor = tmp.key;
			}
		}

		if (root.key > key) {
			preAndSucessor(root.left, key);
		} else {
			preAndSucessor(root.right, key);
		}

	}

	/*
	 * private static Node inorderSucessor(Node root, int key) { if (root == null) {
	 * return null; } // else {
	 * 
	 * if (root.key == key) { return getInorderSucessor(root); } Node left =
	 * inorderSucessor(root.left, key); Node right = inorderSucessor(root.right,
	 * key); return left != null ? left : right; }
	 * 
	 * private static Node getInorderSucessor(Node root) { if (root == null) {
	 * return null; } Node temp = null;
	 * 
	 * return temp; }
	 */

}
