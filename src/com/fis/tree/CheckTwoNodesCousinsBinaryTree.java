package com.fis.tree;

public class CheckTwoNodesCousinsBinaryTree {

	public static int parentNode1 = 0;
	public static int parentNode2 = 0;

	public static void main(String[] args) {

		///// Two nodes are cousins of each other if they are at same level and
		///// have different parents.

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(6);
		tree.root.left = new Node(3);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(8);
		tree.root.right.left = new Node(1);
		tree.root.right.right = new Node(3);

		if (isCousin(tree.root, 8, 7)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		/*
		 * if (getHeight(tree.root, 7) == getHeight(tree.root, 1)) { boolean
		 * result = checkTwoNodesCousinsBinaryTree(tree.root, 7, 1);
		 * System.out.println(result); } else {
		 * 
		 * System.out.println("false");
		 * 
		 * }
		 */
	}

	private static boolean isCousin(Node root, int a, int b) {

		return (getHeight(root, 7) == getHeight(root, 1)) && !isSiblings(root, a, b);
	}

	private static boolean isSiblings(Node root, int a, int b) {
		if (root == null) {
			return false;
		} else {
			return ((root.left != null && root.left.key == a) && (root.right != null && root.right.key == b))
					|| ((root.left != null && root.left.key == b) && (root.right != null && root.right.key == a))
					|| isSiblings(root.left, a, b) || isSiblings(root.right, a, b);
		}
	}

	private static int getHeight(Node root, int x) {

		if (root == null) {
			return 0;
		} else {

			return 1 + Math.max(getHeight(root.left, x), getHeight(root.right, x));
		}

	}

	private static boolean checkTwoNodesCousinsBinaryTree(Node root, int x, int y) {

		int parentNode1 = getParentNode(root, x);
		System.out.println(parentNode1);
		int parentNode2 = getParentNode(root, y);
		System.out.println(parentNode2);
		if (parentNode1 != parentNode2) {
			return true;
		} else {
			return false;
		}
	}

	private static int getParentNode(Node root, int x) {
		Node parentNode = null;
		if (root == null) {
			return 0;
		} else {
			parentNode = root;
			if (root.left != null && root.left.key == x) {
				parentNode1 = parentNode.key;
			} else {
				getParentNode(root.left, x);
				getParentNode(root.right, x);
			}
		}
		return parentNode1;
	}

}
