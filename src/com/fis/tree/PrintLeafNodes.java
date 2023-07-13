package com.fis.tree;

public class PrintLeafNodes {

	public static void main(String[] args) {

		 // binary tree formation 
        Node root = new Node(4);         /*        4        */
        root.left = new Node(2);         /*       / \       */
        root.right = new Node(5);        /*      2   5      */
        root.left.left = new Node(7);    /*     / \ / \     */
        root.left.right = new Node(1);   /*    7  1 2  3    */
        root.right.left = new Node(2);   /*      /          */
        root.right.right = new Node(3);  /*     6           */
        root.left.right.left = new Node(6);
        root.right.right.right = new Node(10);
        printAllLeafNodeOfTree(root);

	}

	private static void printAllLeafNodeOfTree(Node root) {
		
		if((root.left==null && root.right==null)){
			System.out.println("Leaf Node >"+root.key);
		}else{
			if(root.left!=null){
				printAllLeafNodeOfTree(root.left);
			}
			if(root.right!=null){
				printAllLeafNodeOfTree(root.right);
			}
		}
		
	}

}
