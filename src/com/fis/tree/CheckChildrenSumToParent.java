package com.fis.tree;

public class CheckChildrenSumToParent {

	Node root;

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.right = new Node(2);
		Boolean check = checkIfChildrenSumEqualToParent(tree.root);
		// System.out.println(check==1?"SumTree":"Not SumTree");
		System.out.print(check);
	}

	private static boolean checkIfChildrenSumEqualToParent(Node root) {

		if (root == null) {
			return Boolean.TRUE;
		}

		return ((root.key == sum(root.left) + sum(root.right))) && checkIfChildrenSumEqualToParent(root.left)
				&& checkIfChildrenSumEqualToParent(root.right);

	}

	private static int sum(Node root) {
		if (root == null) {
			return 0;
		}
		return root.key + sum(root.left) + sum(root.right);
	}

	/*
	 * private static int checkIfChildrenSumEqualToParent(Node node) { int
	 * leftData=0 , rigthDate = 0; if (node == null || (node.left == null ||
	 * node.right == null)) { return 1; } else { if (node.left != null) { leftData =
	 * node.left.key; }
	 * 
	 * if (node.right != null) { rigthDate = node.right.key; }
	 * 
	 * if ((node.key == leftData + rigthDate) &&
	 * (checkIfChildrenSumEqualToParent(node.left)!=0) &&
	 * checkIfChildrenSumEqualToParent(node.right)!=0) return 1; else return 0; }
	 * 
	 * //return 0; }
	 */

}
