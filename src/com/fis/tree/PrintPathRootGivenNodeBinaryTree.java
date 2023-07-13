package com.fis.tree;

import java.util.ArrayList;
import java.util.List;

public class PrintPathRootGivenNodeBinaryTree {

	public static void main(String[] args) {
		
		//// IMPORTANT

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		List<Integer> arr = new ArrayList<>();
		boolean flag = printPathRootGivenNodeBinaryTree(tree.root, arr, 8);
		if (flag) {
			System.out.println("Present");
		} else {
			System.out.println("Not Present");
		}

	}

	private static boolean printPathRootGivenNodeBinaryTree(Node root, List<Integer> arr, int x) {

		if (root == null) {
			return false;
		}

		arr.add(root.key);

		if (root.key == x) {
			return true;
		}

		if (printPathRootGivenNodeBinaryTree(root.left, arr, x)
				|| printPathRootGivenNodeBinaryTree(root.right, arr, x)) {
			return true;
		}

		arr.remove(arr.size() - 1);

		return false;

	}

}
