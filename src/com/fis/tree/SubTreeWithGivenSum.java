package com.fis.tree;

public class SubTreeWithGivenSum {

	static int currSum = 18;

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(3);
		root.right = new Node(6);
		root.left.left = new Node(5);
		root.left.right = new Node(9);
		// root.left.right.left = new Node(1);
		// root.left.right.right = new Node(12);
		// root.left.right.right.right = new Node(2);
		//root.right.right = new Node(11);
		// root.right.right.left = new Node(3);

		//// Testing
		
		int sum = 17;
		
		if(check(root,0,sum)) {
			System.out.print("TRUE");
		}else {
			System.out.print("FALSE");
		}
		

	}

	private static boolean check(Node root, int curr_Sum, int sum) {
		if (root == null || root.left == null || root.right == null) {
			return Boolean.FALSE;
		} else {
			return (root.key + root.left.key + root.right.key == sum) || check(root.left, 0, sum)
					|| check(root.right, 0, sum);
		}
	}

}
