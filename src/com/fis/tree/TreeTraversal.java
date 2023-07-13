package com.fis.tree;

import java.util.Stack;

class Node {

	int key;
	Node left;
	Node right;

	public Node(int i) {
		this.key = i;
	}
}

class BinaryTree {

	Node root;

	private int count = 0;

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node node) {

		if (node == null)
			return;
		inOrder(node.left);
		System.out.print(node.key + " ");
		inOrder(node.right);
	}

	public void preOrder() {

		preOrder(root);

	}

	private void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.key + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(Node node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.key + " ");

	}

	public void inOrderUsingStack() {

		/*
		 * 1) Create an empty stack S. 2) Initialize current node as root 3) Push the
		 * current node to S and set current = current->left until current is NULL 4) If
		 * current is NULL and stack is not empty then a) Pop the top item from stack.
		 * b) Print the popped item, set current = popped_item->right c) Go to step 3.
		 * 5) If current is NULL and stack is empty then we are done.
		 */

		Node curr = root;
		Stack<Node> tempStack = new Stack<>();

		while (tempStack.size() > 0 || curr != null) {

			while (curr != null) {
				tempStack.push(curr);
				curr = curr.left;
			}

			Node pop = tempStack.pop();
			System.out.print(pop.key + " ");
			curr = pop.right;
		}

	}

	public Node constructTree(int[] pre, int size) {

		return null;
	}

	public void NthInorder(Node node, int n) {
		if (node == null)
			return;

		if (count <= n) {
			NthInorder(node.left, n);
			count++;

			if (count == n) {
				System.out.print(node.key + " ");
			}
			NthInorder(node.right, n);
		}

	}

	public void BFS(Node root2) {

	}

	public void constructTreeFromInorderAndPreorder(int[] inorder, int[] preOrder, int i, int j) {

	}

	public int heightOfBinaryTree(Node node) {
		if (node == null) {
			return 0;
		}
		return 1 + Math.max(heightOfBinaryTree(node.left), heightOfBinaryTree(node.right)) + 1;
	}

}

public class TreeTraversal {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("\nInorder traversal of binary tree is ");
		tree.inOrder();
		System.out.println("\nPostorder traversal of binary tree is ");
		tree.postOrder();
		System.out.println("");
		System.out.println("Preorder traversal of binary tree is ");
		tree.preOrder();
		System.out.println("");
		System.out.println("Inorder traversal of binary tree using stack >  ");
		tree.inOrderUsingStack();
		int preorder[] = new int[] { 15, 10, 8, 12, 20, 16, 25 };
		int size = preorder.length;
		System.out.println("");
		System.out.println("Construct BST from PreOrder >");
		tree.root = constructBST(preorder, 0, size - 1);
		tree.inOrder();
		int inorder[] = new int[] { 5, 10, 40, 30, 28 };
		tree.root = constructBSTfromInorder(inorder, 0, inorder.length - 1);
		// System.out.println("");
		// int height = heightOfBinaryTree(tree.root);
		// System.out.println("Height of Tree > " + height);
		// System.out.println("");
		// System.out.println("Nth Inorder Traversal >");
		// System.out.println("");
		// tree.NthInorder(tree.root,4);
		// tree.BFS(tree.root);
		// int inorder[] = new int[] {4,2,5,1,3};
		// int preOrder [] = new int [] {1, 2, 4, 5, 3 };
		// tree.root =
		// constructTreeFromInorderAndPreorder(inorder,preOrder,0,inorder.length-1);
	}

	public static Node constructTreeFromInorderAndPreorder(int[] inorder, int[] preOrder, int start, int end) {

		if (start > end) {
			return null;
		}

		Node node = new Node(preOrder[start]);

		if (start == end) {
			return node;
		}
		int i = 0;
		for (i = start; i <= end; i++) {
			if (inorder[i] == node.key)
				break;
		}

		node.left = constructTreeFromInorderAndPreorder(inorder, preOrder, start, i - 1);
		node.right = constructTreeFromInorderAndPreorder(inorder, preOrder, i + 1, end);
		return null;

	}

	public int heightOfBinaryTree(Node node) {
		// MaxHeight = Max(leftHeight, rightHeight) + 1;
		if (node == null) {
			return 0;
		}
		int leftHeight = heightOfBinaryTree(node.left);
		int rigthHeight = heightOfBinaryTree(node.right);

		return Math.max(leftHeight, rigthHeight) + 1;
	}

	private static Node constructBSTfromInorder(int[] inorder, int i, int j) {

		return null;
	}

	// [15, 10, 8, 12, 20, 16, 25]
	private static Node constructBST(int[] preorder, int start, int end) {
		// Tree is getting constructed from bottom to up
		if (start > end) {
			return null;
		}

		Node node = new Node(preorder[start]);
		int i;
		for (i = start; i <= end; i++) {
			if (preorder[i] > node.key) {
				break;
			}
		}
		node.left = constructBST(preorder, start + 1, i - 1);
		node.right = constructBST(preorder, i, end);
		return node;
	}

}
