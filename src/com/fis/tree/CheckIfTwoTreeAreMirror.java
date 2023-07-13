package com.fis.tree;

public class CheckIfTwoTreeAreMirror {

	public static void main(String[] args) {

		BinaryTree tree1 = new BinaryTree();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(3);
		tree1.root.left.left = new Node(4);
		tree1.root.left.right = new Node(5);
		// tree1.root.right.left = new Node(2);
		// tree1.root.right.right = new Node(1);

		BinaryTree tree2 = new BinaryTree();
		tree2.root = new Node(1);
		tree2.root.left = new Node(3);
		tree2.root.right = new Node(2);
		// tree2.root.left.left = new Node(4);
		// tree2.root.left.right = new Node(6);
		tree2.root.right.left = new Node(5);
		tree2.root.right.right = new Node(4);

		if (checkIfMirror(tree1.root, tree2.root)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	private static boolean checkIfMirror(Node root1, Node root2) {

		if (root1 == null && root2 == null) {
			return true;
		}

		if (root1 == null || root2 == null) {
			return false;
		}

		return (root1.key == root2.key) && checkIfMirror(root1.left, root2.right)
				&& checkIfMirror(root1.right, root2.left);
	}

}
