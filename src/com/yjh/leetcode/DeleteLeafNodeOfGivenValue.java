package com.yjh.leetcode;

public class DeleteLeafNodeOfGivenValue {

	public static void main(String[] args) {
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode21 = new TreeNode(2);
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode22 = new TreeNode(2);
		TreeNode treeNode23 = new TreeNode(2);
		TreeNode treeNode4 = new TreeNode(4);
		
		treeNode1.left = treeNode21;
		treeNode1.right = treeNode3;
		treeNode21.left = treeNode22;
		treeNode3.left = treeNode23;
		treeNode3.right = treeNode4;
		
		
	}	

	public static TreeNode removeLeafNodes(TreeNode root, int target) {
		if (root == null) {
			return null;
		}

		root.left = removeLeafNodes(root.left, target);
		root.right = removeLeafNodes(root.right, target);

		if (root.left == null && root.right == null && root.val == target) {
			return null;
		}

		return root;

	}

}
