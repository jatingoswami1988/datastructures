package com.fis.tree.BinarySearchTree;

public class CheckIfBTisBSTOrNot {

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(5);
		tree.insert(2);
		tree.insert(1);
		tree.insert(3);
		tree.insert(6);
		tree.insert(7);
		tree.insert(4);
		Boolean check = checkIfTreeIsBSTOrNot(tree.root);
		System.out.println("Check > " + check);

	}

	private static Boolean checkIfTreeIsBSTOrNot(Node root) {

		if (root == null || (root.left == null && root.right == null)) {
			return Boolean.TRUE;
		} else {
			if ((root.left.key < root.key && root.right.key > root.key) 
					&& checkIfTreeIsBSTOrNot(root.left)
					&& checkIfTreeIsBSTOrNot(root.right)) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}
		}

		// return Boolean.FALSE;

	}

}
