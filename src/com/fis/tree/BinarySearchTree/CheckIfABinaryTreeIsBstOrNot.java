package com.fis.tree.BinarySearchTree;

public class CheckIfABinaryTreeIsBstOrNot {

	public static void main(String[] args) {
		
		// Method 1
		// 1) Do In-Order Traversal of the given tree and store the result in a temp array.
		//2) Check if the temp array is sorted in ascending order, if it is, then the
		// tree is BST.
		
		
		// Method 2
		//We can avoid the use of Auxiliary Array. While doing In-Order traversal, we can keep track of previously visited node. 
		//If the value of the currently visited node is less than the previous value, then tree is not BST
		
	}

}
