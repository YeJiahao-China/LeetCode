package com.yjh.leetcode;

public class SearchInBinarySearchTree {

	public static void main(String[] args) {
		TreeNode treeNode4 = new TreeNode(4);
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode7 = new TreeNode(7);
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode3 = new TreeNode(3);
		
		treeNode4.left = treeNode2;
		treeNode4.right = treeNode7;
		
		treeNode2.left = treeNode1;
		treeNode2.right = treeNode3;
		
		TreeNode searchBST = searchBST(treeNode4, 2);
		System.out.println(searchBST.val);
		System.out.println(searchBST.left.val);
		System.out.println(searchBST.right.val);
	}

	public static TreeNode searchBST(TreeNode root, int val) {
		if(root==null){
			return null;
		}
		if(val>root.val){
			return searchBST(root.right, val);
		}else if (val<root.val) {
			return searchBST(root.left, val);
		}else {
			return root;
		}
	}
}
