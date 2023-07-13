package com.fis.tree;

public class DaimeterOfTree {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.right = new Node(2);
		
		// getLeftTreeHeight  + getRightTreeHeight + root
		
		

	}

}
