package com.yjh.leetcode;

public class PathSummation {
	static boolean res = false;

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		root.left = left;
		hasPathSum(root, 1, 0);
		System.out.println(res);
	}

	public static void hasPathSum(TreeNode root, int sum, int nodeSum) {
		nodeSum += root.val;
		if (root.left == null && root.right == null) {
			if (nodeSum == sum) {
				res = true;
			}
			return;
		}

		if (root.left != null) {
			hasPathSum(root.left, sum, nodeSum);
		}
		if (root.right != null) {
			hasPathSum(root.right, sum, nodeSum);
		}

	}
}
