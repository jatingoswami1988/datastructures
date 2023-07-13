package com.fis.tree;

public class SumNodeskThLevelTreeRepresentedString {

	public static void main(String[] args) {

		// Given an integer ‘K’ and a binary tree in string format. Every node of a tree
		// has value in range from 0 to 9. We need to find sum of elements at K-th level
		// from root. The root is at level 0.

		// Tree is given in the form: (node value(left subtree)(right subtree))
		String name = "(0(5(6()())(4()(9()())))(7(1()())(3()())))";

		Node root = new Node(1);
		root.left = new Node(3);
		root.right = new Node(6);
		root.left.left = new Node(5);
		root.left.right = new Node(9);
		root.left.right.left = new Node(1);
		root.left.right.right = new Node(12);
		root.left.right.right.right = new Node(2);

	}

}
