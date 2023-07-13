package com.fis.tree;

public class SumOfAllLeafNodes {
	
	public static int sum = 0;

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(22);
		tree.root.left = new Node(8);
		tree.root.right = new Node(6);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(2);
		tree.root.right.right = new Node(1);

		
		// Method 1
		int sumOfALlLeafNode = sumOfAllLeafNode(tree.root, 0);
		System.out.println(sumOfALlLeafNode);
		
		
		/// Method 2
		int sumOfALlLeafNode2 = sumOfLeafNode2(tree.root);
		System.out.println(sumOfALlLeafNode2);
		
		sumOfAllLeafNode1(tree.root);
		System.out.println(sum);
	}

	
	private static int sumOfLeafNode2(Node root) {
		if (root == null) {
			return 0;
		}
		return getLeafNodeValue(root) + sumOfLeafNode2(root.left) + sumOfLeafNode2(root.right);
	}


	private static int getLeafNodeValue(Node root) {
		if (root.left == null && root.right == null) {
			return root.key;
		} else {
			return 0;
		}
	}


	/// Method 1 Since the variable sum is used in recursion. 
	private static int sumOfAllLeafNode(Node root, int sum) {
		if (root == null) {
			return sum;
		} else if (isLeafNode(root)) {
			sum = sum + root.key;
		} else {
			sum = sumOfAllLeafNode(root.left, sum);
			sum = sumOfAllLeafNode(root.right, sum);
		}

		return sum;
	}

	private static boolean isLeafNode(Node root) {
		if (root.left == null && root.right == null) {
			return true;
		} else {
			return false;
		}
	}
	
	private static void sumOfAllLeafNode1(Node root) {
		if (root == null) {
			return ;
		} else if (isLeafNode(root)) {
			sum = sum + root.key;
		} else {
			sumOfAllLeafNode1(root.left);
			sumOfAllLeafNode1(root.right);
		}
		//return sum;
	}

}
