package com.yjh.leetcode;

import java.util.ArrayList;

//给定一个所有节点为非负值的二叉搜索树，求树中任意两节点的差的绝对值的最小值。

public class TheMinimumAbsoluteDifferenceOfBinarySearchTree {
	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode3 = new TreeNode(3);
		
		treeNode1.right = treeNode3;
		treeNode3.left = treeNode2;
		
		int minimumDifference = getMinimumDifference(treeNode1);
		System.out.println(minimumDifference);
	}

	public static int getMinimumDifference(TreeNode root) {
		preOrder(root);
		int res = Math.abs(list.get(0)-list.get(1));
		for (int i = 0; i < list.size()-1; i++) {
			for (int j = i+1; j < list.size(); j++) {
				if(Math.abs(list.get(i)-list.get(j))<res){
					res = Math.abs(list.get(i)-list.get(j));
				}
			}
		}
		return res;
	}

	// 存储二叉树的所有结点 然后2、2比较
	public static void preOrder(TreeNode node) {
		list.add(node.val);
		if (node.left != null) {
			preOrder(node.left);
		}
		if (node.right != null) {
			preOrder(node.right);
		}
	}

}
