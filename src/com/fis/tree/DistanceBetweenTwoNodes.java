package com.fis.tree;

public class DistanceBetweenTwoNodes {

	public static void main(String[] args) {

		// Distance between two node is LCA

		// 1) Find LCA
		// 2) Find distance of two nodes from d1 = LCA > n1 and d2 = LCA > n2 and then
		// add d1+d2

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		Node LCA = findLCA(tree.root, 4, 5);
		int d1 = distanceOfNodefromLCA(LCA, 4, 0);
		int d2 = distanceOfNodefromLCA(LCA, 5, 0);
		System.out.println(d1 + d2);
	}

	private static int distanceOfNodefromLCA(Node root, int i, int level) {

		if (root == null)
			return -1;
		if (root.key == i)
			return level;
		int left = distanceOfNodefromLCA(root.left, i, level + 1);
		if (left == -1)
			return distanceOfNodefromLCA(root.right, i, level + 1);
		return left;
	}

	private static Node findLCA(Node root, int i, int j) {
		if (root == null) {
			return null;
		}
		return root;
	}

}
