package com.yjh.leetcode;

import java.util.ArrayList;


public class ConvertBinarySearchTreeToAccumulationTree {

	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		TreeNode treeNode5 = new TreeNode(2);
		TreeNode treeNode2 = new TreeNode(1);
		TreeNode treeNode13 = new TreeNode(3);
		
		treeNode5.left = treeNode2;
		treeNode5.right = treeNode13;
		
		TreeNode convertBST = convertBST(treeNode5);
		System.out.println(convertBST.val);
		System.out.println(convertBST.left.val);
		System.out.println(convertBST.right.val);
	}

	public static TreeNode convertBST(TreeNode root) {
		if(root==null || (root.left==null && root.right==null)){
			return root;
		}
		preOrder(root);
		judge(root);
		return root;
	}

	public static void preOrder(TreeNode root) {
		list.add(root.val);
		if (root.left != null) {
			preOrder(root.left);
		}
		if (root.right != null) {
			preOrder(root.right);
		}
	}

	public static void judge(TreeNode root){
		int temp = root.val;
		int newRootVal = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)>temp){
				newRootVal+=list.get(i);
			}
		}
		root.val = temp+newRootVal;
		if(root.left!=null){
			judge(root.left);
		}
		if(root.right!=null){
			judge(root.right);
		}
	}
}
