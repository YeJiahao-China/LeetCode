package com.yjh.leetcode;

public class ImageOfBinaryTree {

	public static void main(String[] args) {
		TreeNode treeNode4 = new TreeNode(4);
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode7 = new TreeNode(7);
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode6 = new TreeNode(6);
		TreeNode treeNode9 = new TreeNode(9);
		
		
		treeNode4.left = treeNode2;
		treeNode4.right = treeNode7;
		
		treeNode2.left = treeNode1;
		treeNode2.right = treeNode3;
		
		treeNode7.left = treeNode6;
		treeNode7.right = treeNode9;
		
		TreeNode mirrorTree = mirrorTree(treeNode4);
		preOrder(mirrorTree);
	}

	public static TreeNode mirrorTree(TreeNode root) {

		if (root == null || (root.left == null && root.right == null)) {
			return root;
		}
		judge(root);
		return root;
	}

	public static void judge(TreeNode root) {
		if(root == null){
			return;
		}
		TreeNode left = root.left;
		TreeNode right = root.right;
		root.left = right;
		root.right = left;
		judge(root.left);
		judge(root.right);
	}
	
	public static void preOrder(TreeNode root){
		System.out.println(root.val);
		if(root.left!=null){
			preOrder(root.left);
		}
		if(root.right!=null){
			preOrder(root.right);
		}
	}
}
