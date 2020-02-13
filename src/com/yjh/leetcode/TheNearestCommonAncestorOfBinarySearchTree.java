package com.yjh.leetcode;

public class TheNearestCommonAncestorOfBinarySearchTree {
	static TreeNode res = null;
	public static void main(String[] args) {
		TreeNode treeNode6 = new TreeNode(6);
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode8 = new TreeNode(8);
		TreeNode treeNode0 = new TreeNode(0);
		TreeNode treeNode4 = new TreeNode(4);
		TreeNode treeNode7 = new TreeNode(7);
		TreeNode treeNode9 = new TreeNode(9);
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode5 = new TreeNode(5);
		
		treeNode6.left = treeNode2;
		treeNode6.right = treeNode8;
		treeNode2.left = treeNode0;
		treeNode2.right = treeNode4;
		treeNode8.left = treeNode7;
		treeNode8.right = treeNode9;
		treeNode4.left = treeNode3;
		treeNode4.right = treeNode5;
		
		lowestCommonAncestor(treeNode6, treeNode3, treeNode5);
		System.out.println(res);
	}

	public static void lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if ((p.val > root.val && q.val < root.val) || (p.val < root.val && q.val > root.val)) {
			res = root;
			return ;
		}
		if (root.val == p.val || q.val == root.val) {
			res = root;
			return ;
		}
		if (p.val > root.val && q.val > root.val) {
			// 往右子树查找
			lowestCommonAncestor(root.right, p, q);
		}

		if (p.val < root.val && q.val < root.val) {
			// 往左子树查找
			lowestCommonAncestor(root.left, p, q);
		}
	}
}
