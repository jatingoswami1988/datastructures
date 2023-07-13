package com.fis.tree;

public class ConvertTreeToItsMirror {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        //tree.root.left.left = new Node(4); 
        //tree.root.left.right = new Node(5); 
		tree.inOrder();
		Node head = convertIntoMirror(tree.root);
		tree.root = head;
		System.out.println("");
		tree.inOrder();
	}

	private static Node convertIntoMirror(Node root) {
		if (root == null)
			return root;

		Node left = convertIntoMirror(root.left);
		Node right = convertIntoMirror(root.right);

		root.left = right;
		root.right = left;
		return root;
	}

}
