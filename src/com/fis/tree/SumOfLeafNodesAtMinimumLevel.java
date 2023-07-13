package com.fis.tree;

import java.util.Map;

public class SumOfLeafNodesAtMinimumLevel {

	public static int minLevel = 0;

	public static int level = 0;
	public static int sum = 0;

	public static void main(String[] args) {

		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = new Node(1);
		binaryTree.root.left = new Node(2);
		binaryTree.root.right = new Node(3);
		binaryTree.root.left.left = new Node(4);
		binaryTree.root.left.right = new Node(5);
		binaryTree.root.right.left = new Node(6);
		binaryTree.root.right.right = new Node(7);
		binaryTree.root.right.right.right = new Node(8);

		// int height = getHeight(binaryTree.root);

		// for (int i = 1; i <= height; i++) {
		// getMinimumLevel(binaryTree.root, i,4);
		// }

		//TreeMap<Integer, Integer> map = new TreeMap<>();
		//getMin(binaryTree.root, map, 1);
		//System.out.println(map.firstEntry().getKey());
		//minLevel = map.firstEntry().getKey();
	//	int height = getHeight(binaryTree.root);
		//getMinimumLevel(binaryTree.root, height);

		////// 2nd Method

		sumOfLeafAtMin(binaryTree.root, 0);
		System.out.println(level + " <-> "+sum);
	}

	private static void sumOfLeafAtMin(Node root, int currentLevel) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			
			if (level == 0) {
				level = currentLevel;
			}

			if (level == currentLevel) {
				sum = sum + root.key;
			}

		}
		sumOfLeafAtMin(root.left, currentLevel + 1);
		sumOfLeafAtMin(root.right, currentLevel + 1);

	}

	private static void getMin(Node root, Map<Integer, Integer> map, int level) {

		if (root == null) {
			return;
		} else if (root.left == null && root.right == null) {
			map.put(level, root.key);
		} else {
			// if(root.left!=null)
			getMin(root.left, map, level + 1);
			// if(root.right!=null)
			getMin(root.right, map, level + 1);
		}
	}

	private static void getMinimumLevel(Node root, int level) {
		if (root == null) {
			return;
		} else if (level == minLevel) {
			// if(root.left == null && root.right == null) {
			System.out.print(root.key + " ");
			// min
			// }
		} else if (level != minLevel) {
			getMinimumLevel(root.left, level - 1);
			getMinimumLevel(root.right, level - 1);
		}

	}

	private static int getHeight(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(getHeight(root.left), getHeight(root.right));
	}

}
