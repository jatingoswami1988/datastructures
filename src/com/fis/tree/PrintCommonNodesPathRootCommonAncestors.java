package com.fis.tree;

public class PrintCommonNodesPathRootCommonAncestors {

	public static void main(String[] args) {
		
		///// Find LCA and print Root to LCA
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

	}

}
