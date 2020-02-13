package com.yjh.leetcode;

public class TheMaximumDepthOfABinaryTree {

	public static void main(String[] args) {

	}

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int depth = height(root);
		return depth;
	}

	public int height(TreeNode root) {
		return Math.max(root.left == null ? 0 : height(root.left), root.right == null ? 0 : height(root.right)) + 1;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		return "TreeNode [val=" + val + "]";
	}
	
	
}