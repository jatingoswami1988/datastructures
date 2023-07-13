package com.fis.tree;

public class FindSumRightLeavesGivenBinaryTree {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(26);
		tree.root.left = new Node(10);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(6);
		tree.root.right.right = new Node(3);
		tree.root.right.right.right = new Node(8);

		printRightLeaveNode(tree.root);

		int sum = findSumOfRightLeaveNode(tree.root, 0);
		System.out.println(sum);
	}

	private static void printRightLeaveNode(Node root) {
		if(root==null){
			return;
		}else if (root.right != null && root.right.right == null) {
			System.out.println(root.right.key);
		} else {
			printRightLeaveNode(root.left);
			printRightLeaveNode(root.right);
		}

	}

	private static int findSumOfRightLeaveNode(Node root, int sum) {
		if(root==null){
			return sum;
		}else if (root.right != null && root.right.right == null) {
			sum = sum + root.right.key;
		} else {
			sum = findSumOfRightLeaveNode(root.left, sum);
			sum = findSumOfRightLeaveNode(root.right, sum);
		}

		return sum;
	}

}
