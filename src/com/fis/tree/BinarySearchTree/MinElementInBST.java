package com.fis.tree.BinarySearchTree;

public class MinElementInBST {

	public static void main(String[] args) {

		//// Traverse Recursivily to the left of Root till we found a node which
		//// has left as NULL

		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(5);
		tree.insert(2);
		tree.insert(1);
		tree.insert(3);
		tree.insert(6);
		tree.insert(5);
		Node min = findMinimumm(tree.root);
		System.out.println("Min Node >" + min.key);
	}

	private static Node findMinimumm(Node root) {
		/*if (root.left == null) {
			return root;
		} else {
			return findMinimumm(root.left);
		}*/
		
		while(root.left!=null){
			root = root.left;
		}
		
		return root;
	}

}
