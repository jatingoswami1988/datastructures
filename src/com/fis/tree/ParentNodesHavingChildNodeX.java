package com.fis.tree;

public class ParentNodesHavingChildNodeX {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();

		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(2);
		tree.root.right.left = new Node(2);
		tree.root.right.right = new Node(2);

		getTheParentNode(tree.root, 2);

	}

	private static void getTheParentNode(Node root, int x) {

		if (root == null || root.left == null || root.right == null) {
			return;
		} else {

			if ((root.left.key == x || root.right.key == x)) {

				System.out.println("Root Node > "+root.key);
				getTheParentNode(root.left, x);
				getTheParentNode(root.right, x);

			}

		}

	}

	/*
	 * private static void getTheParentNode(Node root, int x) { if(root==null ||
	 * root.left==null || root.right==null){ return; } if(root.left.key==x ||
	 * root.right.key==x){ System.out.println("Root > "+root.key);
	 * getTheParentNode(root.left, x); getTheParentNode(root.right, x); } }
	 */

}
