package com.fis.tree;

public class SumOfAllNodes {

	static int sum = 0;

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(22);
		tree.root.left = new Node(8);
		tree.root.right = new Node(6);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(2);
		tree.root.right.right = new Node(1);

		// int check = sumPropertyOfTree(tree.root);
		
		int sumOfAllNode = sumOfAllNode(tree.root);
		System.out.println("Sum of Node > " + sumOfAllNode);
 
		int sumOfAllNode2 = sumOfAllNodeMethod2(tree.root);
		System.out.println("Sum of Node > " + sumOfAllNode2);
		
	}

	
	private static int sumOfAllNodeMethod2(Node root) {
		if(root==null) {
			return 0;
		}else {
			
			sum = sum + root.key;
			sumOfAllNodeMethod2(root.left);
			sumOfAllNodeMethod2(root.right);
		}
		return sum;
	}


	/// Method 1
	private static int sumOfAllNode(Node root) {
		if (root == null) {
			return 0;
		} else {
			return root.key + sumOfAllNode(root.left) + sumOfAllNode(root.right);
		}
	}

	private static int sumPropertyOfTree(Node root) {
		if (root == null) {
			return 0;
		}
		int leftSum = getSumOfChildTree(root.left);
		int rightSum = getSumOfChildTree(root.right);
		if (root.key == (leftSum + rightSum)) {
			return 1;
		} else {
			return 0;
		}

	}

	private static int getSumOfChildTree(Node root) {
		if (root == null) {
			return 0;
		}
		return root.key + getSumOfChildTree(root.left) + getSumOfChildTree(root.right);

	}

}
