package com.fis.tree;

public class CheckValueExistsInBT {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(26);
		tree.root.left = new Node(10);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(6);
		tree.root.right.left = new Node(2);
		tree.root.right.right = new Node(1);

		//if (checkIfValueExists(tree.root, 6)) {
		//	System.out.println("TRUE");
		//} else {
		//	System.out.print("FALSE");
		//}
		
		Node result = getValueNode(tree.root,30);
		System.out.print(result);
	}

	private static Node getValueNode(Node root, int key) {

		if (root == null) {
			return null;
		}
		if (root.key == key) {
			return root;
		}

		Node left = getValueNode(root.left, key);
		Node right = getValueNode(root.right, key);
		return left != null ? left : right;
	}

	private static boolean checkIfValueExists(Node root, int key) {
		if (root == null) {
			return false;
		}
		if (root.key == key) {
			return true;
		}
		// return checkIfValueExists(root.left, key) || checkIfValueExists(root.right, key);
		
		boolean left = checkIfValueExists(root.left, key);
		boolean right = checkIfValueExists(root.right, key);
		return left || right;
	}

}
