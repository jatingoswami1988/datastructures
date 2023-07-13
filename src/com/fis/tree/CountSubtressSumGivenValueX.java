package com.fis.tree;

public class CountSubtressSumGivenValueX {

	public static int no = 0;

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(5);
		tree.root.left = new Node(-10);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(9);
		tree.root.left.right = new Node(8);
		tree.root.right.left = new Node(-4);
		tree.root.right.right = new Node(7);

		int count = countSubtressSumGivenValueX(tree.root, 6);
		System.out.println(count);

	}

	private static int countSubtressSumGivenValueX(Node root, int count) {

		if (root == null) {
			return 0;
		} else {
			int left = getSumTree(root.left);
			int right = getSumTree(root.right);
			if (count == (root.key + left + right) || countSubtressSumGivenValueX(root.left, count) != 0
					|| countSubtressSumGivenValueX(root.right, count) != 0) {
				return no = no + 1;
			} else {
				return no;
			}
		}

	}

	private static int getSumTree(Node root) {
		if (root == null) {
			return 0;
		} else {
			return root.key + getSumTree(root.left) + getSumTree(root.right);
		}
	}

}
