package com.fis.tree.BinarySearchTree;

public class FindAPairWithGivenSumInBST {

	public static int index = 0;

	public static void main(String[] args) {

		// Inorder Traversal of tree and put in Array.Inorder Traversal is always
		// Sorted.

		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(5);
		tree.insert(2);
		tree.insert(1);
		tree.insert(3);
		tree.insert(6);
		tree.insert(7);
		tree.insert(4);
		int arr[] = new int[7];
		inorderTraversal(tree.root, arr);
		// System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void inorderTraversal(Node root, int[] arr) {

		if (root == null) {
			return;
		}

		inorderTraversal(root.left, arr);
		arr[index] = root.key;
		index = index + 1;
		inorderTraversal(root.right, arr);

	}

}
