package com.fis.tree;

public class LargestSubTreeValue {

	static int sum = 0;

	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(9);
		root.right.left = new Node(1);
		root.right.right = new Node(2);
		int maxSum = findLargestSubtreeSum(root);
		System.out.println("Max Sum >" + maxSum);
	}

	private static int findLargestSubtreeSum(Node root) {

		if (root == null) {
			return 0;
		}

		int sumNode = root.key + getSubTreeSum(root.left) + getSubTreeSum(root.right);
		sum = Math.max(sum, sumNode);
		return sumNode;
	}

	private static int getSubTreeSum(Node root) {
		if (root == null) {
			return 0;
		}
		return root.key + getSubTreeSum(root.left) + getSubTreeSum(root.right);
	}

}
