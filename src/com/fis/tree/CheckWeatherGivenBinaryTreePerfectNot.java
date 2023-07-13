package com.fis.tree;

class LeafNode {
	int leaflevel = 0;
	Node parentNode;
}

public class CheckWeatherGivenBinaryTreePerfectNot {
	
	public static Leaf mylevel = new Leaf();

	public static void main(String[] args) {
		
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(26);
		tree.root.left = new Node(10);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(6);
		tree.root.right.right = new Node(3);
		tree.root.right.right.right = new Node(3);
		if (check(tree.root)){
			System.out.println("Tree is perfect binary tree");
		}else{
			System.out.println("Tree is perfect binary tree");
		}

	}
	
	public static boolean checkUtil(Node node, int level, Leaf leafLevel,Node parentNode) {
		if (node == null)
			return true;
		if (node.left == null && node.right == null) {
			if (leafLevel.leaflevel == 0) {
				leafLevel.leaflevel = level;/// updating the leafLevel Here ....
				return true;
			}
			return (level == leafLevel.leaflevel) && (node.left!=null && node.right!=null);
		}
		return checkUtil(node.left, level + 1, leafLevel,node) && checkUtil(node.right, level + 1, leafLevel,node);
	}

	public static boolean check(Node node) {
		int level = 0;
		return checkUtil(node, level, mylevel,node);
	}

}
