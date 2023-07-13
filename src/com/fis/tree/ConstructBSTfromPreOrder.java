package com.fis.tree;

public class ConstructBSTfromPreOrder {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree(); 
		int pre[] = new int[]{10, 5, 1, 7, 40, 50}; 
		int size = pre.length;
		Node root = tree.constructTree(pre, size); 

	}

}
