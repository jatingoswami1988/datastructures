package com.fis.tree;

public class CheckSumCoveredUncoveredNodesBinaryTree {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(8);
		tree.root.left = new Node(3);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(6);
		tree.root.left.right.left = new Node(4);
		tree.root.left.right.right = new Node(7);

		tree.root.right = new Node(10);
		tree.root.right.right = new Node(14);
		tree.root.right.right.left = new Node(13);

		if (isSumSame(tree.root))
			System.out.println("Sum of covered and uncovered is same");
		else
			System.out.println("Sum of covered and uncovered is not same");

	}

	public static boolean isSumSame(Node root) {
		int sumUC = uncoverSum(root);
		int sumT = sum(root);
		return (sumUC == (sumT - sumUC));
	}

	public static int uncoverSum(Node t) {
		int lb = 0, rb = 0;
		if (t.left != null)
			lb = uncoveredSumLeft(t.left);
		if (t.right != null)
			rb = uncoveredSumRight(t.right);
		return t.key + lb + rb;
	}

	public static int uncoveredSumRight(Node t) {
		if (t.left == null && t.right == null)
			return t.key;

		if (t.right != null)
			return t.key + uncoveredSumRight(t.right);
		else
			return t.key + uncoveredSumRight(t.left);
	}

	public static int uncoveredSumLeft(Node t) {
		if (t.left == null && t.right == null)
			return t.key;

		if (t.left != null)
			return t.key + uncoveredSumLeft(t.left);
		else
			return t.key + uncoveredSumLeft(t.right);
	}

	public static int sum(Node t) {
		if (t == null)
			return 0;
		return t.key + sum(t.left) + sum(t.right);
	}

}
