package com.fis.tree.BinarySearchTree;

public class SearchAKeyInBST {

	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.insert(6);
		binarySearchTree.insert(3);
		binarySearchTree.insert(8);
		binarySearchTree.insert(2);
		binarySearchTree.insert(4);
		binarySearchTree.insert(7);
		binarySearchTree.insert(9);
		boolean isExist = searchInBST(binarySearchTree.root, 4);
		System.out.println(isExist);
	}

	private static boolean searchInBST(Node root, int key) {
		if (root == null) {
			return Boolean.FALSE;
		}
		if (root.key == key) {
			return Boolean.TRUE;
		}

		if (root.key > key) {
		   return searchInBST(root.left, key);
		}else {
		   return searchInBST(root.right, key);
		}
	}

}
