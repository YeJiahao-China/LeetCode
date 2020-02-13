package com.yjh.leetcode;

public class TheDepthOfBinaryTree {

	public static void main(String[] args) {

	}

	public int maxDepth(TreeNode root) {
		if(root == null){
			return 0;
		}
		return height(root);
	}
	public int height(TreeNode node){
		return Math.max(node.left==null ? 0 : height(node.left), node.right==null ? 0 : height(node.right))+1;
	}
}
