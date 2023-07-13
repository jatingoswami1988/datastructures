package com.fis.tree;

public class SumTree extends Object {

	public static void main(String[] args) {
        /// Sum Tree >>>>root = ( left + right)
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(26);
		tree.root.left = new Node(10);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(6);
		tree.root.right.right = new Node(3);
		int test = isSumProperty(tree.root);
		if (test == 1) {
			System.out.println("Its a sum tree");
		} else {
			System.out.println("Its not sum tree");
		}
	}

	private static int isSumProperty(Node root) {	
        int leftSumTree = 0;
		int rightSumTree = 0;

		if (root == null || (root.left == null && root.right == null)) {
			return 1;
		} else {
			leftSumTree = getchildTreeSum(root.left);
			rightSumTree = getchildTreeSum(root.right);
			if ((root.key == leftSumTree + rightSumTree) && isSumProperty(root.left) != 0
					&& isSumProperty(root.right) != 0) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	private static int getchildTreeSum(Node node) {
		if (node == null)
			return 0;
		return node.key + getchildTreeSum(node.left) + getchildTreeSum(node.right);
	}

}
