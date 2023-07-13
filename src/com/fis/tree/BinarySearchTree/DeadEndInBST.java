package com.fis.tree.BinarySearchTree;

public class DeadEndInBST {

	public static void main(String[] args) {
		// UseHashMap or Recursion
		
		// or
		
		//If its BST and Value is positive.
		//Root can have value from [1,Infinity]
		//If Root is val then leftSubTree >[1,val-1] and rightSubTree >[val+1,Infinity].
		//If min and max value is equal then cant add new node
		
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.insert(8);
		binarySearchTree.insert(5);
		binarySearchTree.insert(2);
		binarySearchTree.insert(3);
		binarySearchTree.insert(7);
		binarySearchTree.insert(11);
		binarySearchTree.insert(4);

		if (deadEnd(binarySearchTree.root, 1, Integer.MAX_VALUE))
			System.out.println("Yes ");
		else
			System.out.println("No ");

	}

	private static boolean deadEnd(Node root, int min, int max) {
		if (root == null)
			return false;

		if (min == max)
			return true;

		return deadEnd(root.left, min, root.key - 1) || deadEnd(root.right, root.key + 1, max);
	}

}
