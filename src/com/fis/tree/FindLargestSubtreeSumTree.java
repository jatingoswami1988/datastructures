package com.fis.tree;

public class FindLargestSubtreeSumTree {

	private static int largestSum = 0;

	public static void main(String[] args) {

		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = new Node(1);
		binaryTree.root.left = new Node(-2);
		binaryTree.root.right = new Node(3);
		binaryTree.root.left.left = new Node(4);
		binaryTree.root.left.right = new Node(5);
		binaryTree.root.right.left = new Node(-6);
		binaryTree.root.right.right = new Node(1);

		int min = findLargestSum(binaryTree.root, 0);
		System.out.println("LargestSum > " + min);
	}

	private static int findLargestSum(Node root, int ans) {
		if (root == null) {
			return 0;
		}
		int currSum = root.key + findLargestSum(root.left, ans) + findLargestSum(root.right, ans);
		ans = Math.max(currSum, ans);
		return currSum;
	}
}
