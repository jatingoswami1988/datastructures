package com.fis.tree.BinarySearchTree;

public class FindClosestElementBinarySearchTree {

	public static int minDiff = 0;
	public static int min = 0;

	public static void main(String[] args) {

		BinarySearchTree b = new BinarySearchTree();
		b.insert(9);
		b.insert(4);
		b.insert(17);
		b.insert(3);
		b.insert(6);
		b.insert(5);
		b.insert(7);
		b.insert(22);
		b.insert(20);
		// b.insert(22);
		findTheClosest(b.root, 18);
		System.out.println(min);

	}

	private static void findTheClosest(Node root, int no) {

		if (root == null) {
			return;
		}

		if (no == root.key) {
			min = root.key;
			return;
		}

		if (no < root.key) {

			minDiff = Math.abs(no - root.key);
			min = root.key;
			findTheClosest(root.left, no);

		}

		if (no > root.key) {

			minDiff = Math.abs(no - root.key);
			min = root.key;
			findTheClosest(root.right, no);

		}

	}

}
