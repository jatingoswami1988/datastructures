package com.fis.tree;

public class RootToLeafPathSumEqualToAGivenNumber {

	public static int max_sum = 23;

	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right.left = new Node(2);
		// root.left.right.right = new Node(12);
		// root.left.right.right.right = new Node(2);
		// root.right.right = new Node(11);
		// root.right.right.left = new Node(3);

		/*
		 * Constructed binary tree is 10 / \ 8 2 / \ / 3 5 2
		 */

		// 21 –> 10 – 8 – 3
        //	23 –> 10 – 8 – 5
		// 14 –> 10 – 2 – 2

		// Use sum - current

		if (checkIfPresent(root, 0)) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}

	}

	private static boolean checkIfPresent(Node root, int sum) {
		if (root == null) {
			if (max_sum == sum) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}
		}
		return checkIfPresent(root.left, sum + root.key) || checkIfPresent(root.right, sum + root.key);
	}

}
