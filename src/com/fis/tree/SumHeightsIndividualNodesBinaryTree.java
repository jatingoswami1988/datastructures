package com.fis.tree;

public class SumHeightsIndividualNodesBinaryTree {

	public static int sum = 0;

	 /////    Check the GeeksForGeeks for another implementation.
	
	
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		//tree.root.left.left.left = new Node(1);

		sumHeightsIndividualNodesBinaryTree(tree.root);
		System.out.println(sum);
	}

	private static int sumHeightsIndividualNodesBinaryTree(Node root) {
		int sum = 0;
		int maxHeight = maxHeight(root);
		for (int i = 0; i < maxHeight; i++) {
			bfsTraversal(root, i);
		}
		return sum;
	}

	private static void bfsTraversal(Node root, int level) {
		
		if (root == null) {
			return;
		} else if (level == 0) {
			int max = maxHeight(root);
			//System.out.print(root.key + " -  "+max+" , ");
			//sum = sum + max; ////  Use static varaible to store the sum of Height
		} else if (level > 0) {
			bfsTraversal(root.left, level - 1);
			bfsTraversal(root.right, level - 1);
		}

	}

	private static int maxHeight(Node root) {
		if (root == null) {
			return 0;
		} else {
			return 1 + Math.max(maxHeight(root.left), maxHeight(root.right));
		}
		// return 0;
	}

}
