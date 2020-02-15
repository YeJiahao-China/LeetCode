package com.yjh.leetcode;


public class MinimumDistanceBetweenNodesOfBinarySearchTreeAnother {

	static Integer prev, ans;

	public static void main(String[] args) {
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode0 = new TreeNode(0);
		TreeNode treeNode48 = new TreeNode(48);
		TreeNode treeNode12 = new TreeNode(12);
		TreeNode treeNode49 = new TreeNode(49);

		treeNode1.left = treeNode0;
		treeNode1.right = treeNode48;
		treeNode48.left = treeNode12;
		treeNode48.right = treeNode49;

		int minDiffInBST = minDiffInBST(treeNode1);
		System.out.println(minDiffInBST);
	}

	public static int minDiffInBST(TreeNode root) {
		prev = null;
		ans = Integer.MAX_VALUE;
		dfs(root);
		return ans;
	}

	public static void dfs(TreeNode node) {
		if(node == null){
			return;
		}
		dfs(node.left);
		if(prev!=null){
			ans = Math.min(ans, node.val-prev);
		}
		prev = node.val;
		dfs(node.right);
	}

}
