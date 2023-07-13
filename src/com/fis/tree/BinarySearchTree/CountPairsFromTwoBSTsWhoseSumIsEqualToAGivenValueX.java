package com.fis.tree.BinarySearchTree;

public class CountPairsFromTwoBSTsWhoseSumIsEqualToAGivenValueX {

	public static int count = 0;

	public static void main(String[] args) {

		BinarySearchTree binarySearchTree1 = new BinarySearchTree();
		binarySearchTree1.insert(6);
		binarySearchTree1.insert(3);
		binarySearchTree1.insert(8);
		binarySearchTree1.insert(2);
		binarySearchTree1.insert(4);
		binarySearchTree1.insert(7);
		binarySearchTree1.insert(9);

		BinarySearchTree binarySearchTree2 = new BinarySearchTree();
		binarySearchTree2.insert(1);
		binarySearchTree2.insert(2);
		binarySearchTree2.insert(3);
		binarySearchTree2.insert(4);
		binarySearchTree2.insert(5);
		binarySearchTree2.insert(6);
		binarySearchTree2.insert(7);
		countPair(binarySearchTree1.root, binarySearchTree2.root, 16);

	}

	private static void countPair(Node root1, Node root2, int sum) {
		if (root1 == null) {
			return;
		}
		countPair(root1.left, root2, sum);

	}

}
