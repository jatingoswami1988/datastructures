package com.fis.tree;

public class CheckIfEveryNodeHasTwoChild {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(26);
		tree.root.left = new Node(10);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(6);
		tree.root.right.left = new Node(2);
		tree.root.right.right = new Node(1);

		System.out.println(checkIfTreeisBinaryTreeOrNot(tree.root));


	}

	private static boolean checkIfTreeisBinaryTreeOrNot(Node root) {
		if (root == null || (root.left == null && root.right == null)) {
			return true;
		}
		
		return (root.left!=null && root.right!=null) && checkIfTreeisBinaryTreeOrNot(root.left) && checkIfTreeisBinaryTreeOrNot(root.right);
	}

}
