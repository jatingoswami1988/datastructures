package com.fis.tree;

public class CheckIfLeafTraversalOfTwoBinaryTreesIsSame {

	public static void main(String[] args) {

		BinaryTree tree1 = new BinaryTree();
		tree1.root = new Node(26);
		tree1.root.left = new Node(10);
		tree1.root.right = new Node(3);
		tree1.root.left.left = new Node(4);
		tree1.root.left.right = new Node(6);
		//tree1.root.right.left = new Node(2);
		//tree1.root.right.right = new Node(1);

		BinaryTree tree2 = new BinaryTree();
		tree2.root = new Node(26);
		tree2.root.left = new Node(10);
		tree2.root.right = new Node(3);
		tree2.root.left.left = new Node(4);
		tree2.root.left.right = new Node(6);
		//tree2.root.right.left = new Node(2);
		//tree2.root.right.right = new Node(1);
		
		if(checkIfLeafTraversalIsSame(tree1.root,tree2.root)) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}

	}
	
	
	private static boolean checkIfLeafTraversalIsSame(Node root1, Node root2) {
		if(root1==null && root2==null) {
			return true;
		}
		
		if(root1 == null || root2 == null) {
			return false;
		}
		
		return (root1.key == root2.key && checkIfLeafTraversalIsSame(root1.left, root2.left)  
				&&  checkIfLeafTraversalIsSame(root1.right, root2.right));
	}

	/*private static boolean checkIfLeafTraversalIsSame(Node root1, Node root2) {
		if(root1==null || root2==null) {
			return false;
		}else if(root1==null && root2==null) {
			return true;
		}else {
			checkIfLeafTraversalIsSame(root1.left,root2.left);
			if(root1.key != root2.key) {
				return false;
			}
			//System.out.println(root1.key + "-" + root2.key);
			checkIfLeafTraversalIsSame(root1.right,root2.right);
		}
		return true;
	}*/

}
