package com.fis.tree;

public class SumNodesLongestPathRootLeafNode {

	static int max_Sum = 0;
	static int max_Length = 0;

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
       

		findSumOfNodeLongestPathFromRootToLeaf(root, 0, 0);
		System.out.println("Sum >" + max_Sum);
		System.out.println("Lenght >" + max_Length);
	}

	private static void findSumOfNodeLongestPathFromRootToLeaf(Node root, int sum, int length) {
		if (root == null) {
			if (max_Sum < sum) {
				max_Sum = sum;
			}
			if (max_Length < length) {
				max_Length = length;
			}
			return;
		}
		findSumOfNodeLongestPathFromRootToLeaf(root.left, sum + root.key, length + 1);
		findSumOfNodeLongestPathFromRootToLeaf(root.right, sum + root.key, length + 1);

		// return 0;
	}

}
