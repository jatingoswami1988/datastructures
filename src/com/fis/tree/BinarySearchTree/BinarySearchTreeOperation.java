package com.fis.tree.BinarySearchTree;

class Node {
	int key;
	Node left;
	Node right;

	public Node(int data) {
		this.key = data;
		left = right = null;
	}
}

class BinarySearchTree {

	Node root;

	public void insert(int data) {
		root = insertRec(root, data);
	}

	private Node insertRec(Node root, int data) {

		if (root == null) {
			root = new Node(data);
			return root;
		} else if (root.key > data) {
			root.left = insertRec(root.left, data);
		} else if (root.key < data) {
			root.right = insertRec(root.right, data);
		}

		return root;

	}

	public void inorder() {
		inOrderRec(root);
	}

	private void inOrderRec(Node node) {

		if (node != null) {
			inOrderRec(node.right);
			System.out.print(node.key + " ");
			inOrderRec(node.left);
		}
	}

	public void findMinimumm(Node root) {

	}

}

public class BinarySearchTreeOperation {

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		//// inorder traversal

		tree.inorder();
		// construct BST from Inorder Traversal

	}

}
