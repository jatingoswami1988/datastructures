package com.fis.tree;

class Leaf {
	int leaflevel = 0; /// can find the height of the tree as well.
}

public class CheckIfAllLeavesAreAtSameLevel {

	public static LeafNode mylevel = new LeafNode();
	public static int height = 0;
	
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.right.right.right = new Node(8);
		/*if (check(tree.root)){
			System.out.println("Leaves are at same level");
		}else{
			System.out.println("Leaves are not at same level");
		}*/
		
		height = getHeightOfTree(tree.root);
		
		if(test(tree.root,1)) {
			System.out.print("Leaves on Same Level");
		}else {
			System.out.print("Leaves not on on Same Level");

		}

	}

	private static int getHeightOfTree(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(getHeightOfTree(root.left), getHeightOfTree(root.right));
	}

	private static boolean test(Node root, int level) {
		if (root == null) {
			return true;
		}

		if (root.left == null && root.right == null) {
			if (height == level) {
				return true;
			}else {
				return false;
			}
		}
		return test(root.left, level + 1) && test(root.right, level + 1);
	}

	public static boolean checkUtil(Node node, int level, LeafNode leafLevel) {
		if (node == null)
			return true;
		if (node.left == null && node.right == null) {
			if (leafLevel.leaflevel == 0) {
				leafLevel.leaflevel = level;/// updating the leafLevel Here ....
				return true;
			}
			return (level == leafLevel.leaflevel);
		}
		return checkUtil(node.left, level + 1, leafLevel) && checkUtil(node.right, level + 1, leafLevel);
	}

	public static boolean check(Node node) {
		int level = 0;
		return checkUtil(node, level, mylevel);
	}

}
