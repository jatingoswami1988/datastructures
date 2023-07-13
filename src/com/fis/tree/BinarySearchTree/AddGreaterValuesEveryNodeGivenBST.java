package com.fis.tree.BinarySearchTree;

public class AddGreaterValuesEveryNodeGivenBST {

	public static int sum = 0;

	public static void main(String[] args) {
		
		/*50
        /      \
      30        70							
     /   \      /  \
   20    40    60   80 */
		
		/*260
        /      \
      330        150
     /   \       /  \
   350   300    210   80*/
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		addGreaterValuesEveryNodeGivenBST(tree.root);
		System.out.println("Inorder Traversal");
		inorder(tree.root);

	}

	private static void inorder(Node root) {
		if (root == null) {
			return;
		}

		inorder(root.left);
		System.out.print(root.key + " ");
		inorder(root.right);

	}

	private static void addGreaterValuesEveryNodeGivenBST(Node root) {

		if (root == null) {
			return;
		}
		addGreaterValuesEveryNodeGivenBST(root.right);
		sum = sum + root.key;
		root.key = sum;
		addGreaterValuesEveryNodeGivenBST(root.left);
	}

}
