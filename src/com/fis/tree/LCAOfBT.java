package com.fis.tree;

public class LCAOfBT {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(26);
		tree.root.left = new Node(10);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(6);
		tree.root.right.right = new Node(3);
		tree.root.right.right.right = new Node(8);

		Node lca = findLCA(tree.root, 10, 8);
		System.out.println(lca.key);

	}

	//// Use boolean to check if not null.
	
	
	private static Node findLCA(Node root, int n1, int n2) {

		if (root == null) {
			return null;
		}

		if (root.key == n1 || root.key == n2) {
			return root;
		}

		Node left = findLCA(root.left, n1, n2);
		Node right = findLCA(root.right, n1, n2);

		if (left != null && right != null) {
			return root;
		}
		return left != null ? left : right;
	}

}
