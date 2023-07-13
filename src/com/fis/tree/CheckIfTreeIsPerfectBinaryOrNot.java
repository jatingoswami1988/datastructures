package com.fis.tree;

class CheckLeafNode {
	int leafLevel = 0;
}

/// Every node has two children and level of leaf node is equal
public class CheckIfTreeIsPerfectBinaryOrNot {

	public static CheckLeafNode leafNode = new CheckLeafNode();

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(26);
		tree.root.left = new Node(10);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(6);
		tree.root.right.left = new Node(2);
		tree.root.right.right = new Node(1);

		System.out.println(checkIfTreeisBinaryTreeOrNot(tree.root, 0, leafNode));

	}

	private static boolean checkIfTreeisBinaryTreeOrNot(Node root, int level, CheckLeafNode leafNode) {
		if (root == null || (root.left == null && root.right == null)) {

			if (leafNode.leafLevel == 0) {
				leafNode.leafLevel = level;
				return true;
			}
			return level == leafNode.leafLevel;

		} else if (root.left == null || root.right == null) { /// check if binary tree with both the children.
			return false;
		}

		return checkIfTreeisBinaryTreeOrNot(root.left, level + 1, leafNode)
				&& checkIfTreeisBinaryTreeOrNot(root.right, level + 1, leafNode);

	}

}
