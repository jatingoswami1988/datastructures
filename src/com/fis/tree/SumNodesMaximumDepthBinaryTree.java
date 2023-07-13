package com.fis.tree;

public class SumNodesMaximumDepthBinaryTree {

	private static int maxSum = 0;
	private static int maxHeight = 0;

	public static void main(String[] args) {

		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = new Node(1);
		binaryTree.root.left = new Node(2);
		binaryTree.root.right = new Node(3);
		binaryTree.root.left.left = new Node(4);
		binaryTree.root.left.right = new Node(5);
		binaryTree.root.right.left = new Node(6);
		binaryTree.root.right.right = new Node(7);
		//binaryTree.root.right.right.right = new Node(8);
		//binaryTree.root.right.right.right.right = new Node(10);

		maxHeight = getMaxHeight(binaryTree.root);

		//System.out.println(findSumNodesMaximumDepthBinaryTree(binaryTree.root, maxHeight));
		
		//// Second Solution

		//for (int i = 1; i <= maxHeight; i++) {
       // 	findSumNodesMaximumDepthBinaryTreeSecond(binaryTree.root, i);
        //}
		//System.out.println(maxSum);
		
		sumOfMaxDepthLeafNode(binaryTree.root,1);
		System.out.print(maxSum);
	}

	private static void sumOfMaxDepthLeafNode(Node root, int level) {
		if(root == null) {
			return ;
		}else if(root.left == null && root.right == null) {
			if(maxHeight == level) {
				maxSum = maxSum + root.key;
			}
		}else {
			sumOfMaxDepthLeafNode(root.left, level+1);
			sumOfMaxDepthLeafNode(root.right, level+1);
		}
		
	}

	private static void findSumNodesMaximumDepthBinaryTreeSecond(Node root, int level) {

		if (root == null) {
			return;
		} else if (level == maxHeight) {
			maxSum = maxSum + root.key;
		} else if (level != maxHeight) {
			findSumNodesMaximumDepthBinaryTree(root.left, level);
			findSumNodesMaximumDepthBinaryTree(root.left, level);
		}

	}

	private static int findSumNodesMaximumDepthBinaryTree(Node root, int level) {
		if (root == null) {
			return 0;
		}

		if (level == 1) {
			return root.key;
		}

		return findSumNodesMaximumDepthBinaryTree(root.left, level - 1)
				+ findSumNodesMaximumDepthBinaryTree(root.right, level - 1);

	}

	private static int getMaxHeight(Node root) {

		if (root == null) {
			return 0;
		}
		return 1 + Math.max(getMaxHeight(root.left), getMaxHeight(root.right));
	}

}
