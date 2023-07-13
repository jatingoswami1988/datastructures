package com.fis.tree.BinarySearchTree;

public class PerfectBST {

	//A Binary tree is Perfect Binary Tree in which all internal nodes have two children and all leaves are at the same level
	
	public static int leafLevel = 0;
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
       if(checkForPerfectBST(tree.root,0) && exactlyTwoChildren(tree.root)) {
           System.out.println(Boolean.TRUE);
       }else {
    	   System.out.println(Boolean.FALSE);
       }
	}

	private static boolean exactlyTwoChildren(Node root) {
		
		if(root == null) {
			return Boolean.TRUE;
		}
		
		if(root.left == null || root.right==null) {
			return Boolean.FALSE;
		}
		
		/*else {
			return Boolean.TRUE;
		}*/
		
		return exactlyTwoChildren(root.left) && exactlyTwoChildren(root.right);
	}

	private static boolean checkForPerfectBST(Node root, int level) {
		if (root == null) {
			return false;
		}

		if (root.left == null && root.right == null) {
			if (leafLevel == 0) {
				leafLevel = level;
			}

			return leafLevel == level;
		}

		return checkForPerfectBST(root.left, level + 1) && checkForPerfectBST(root.right, level + 1);
	}

}
