package com.yjh.leetcode;

public class FlipBinaryTree {

	public static void main(String[] args) {

	}

	public TreeNode invertTree(TreeNode root) {
		invertTreeSub(root);
		return root;
	}

	public void invertTreeSub(TreeNode root) {
		if (root.left == null && root.right == null) {
			return;
		}
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		if (root.left != null) {
			invertTreeSub(root.left);
		}
		if(root.right!=null){
			invertTree(root.right);
		}
	}
}
