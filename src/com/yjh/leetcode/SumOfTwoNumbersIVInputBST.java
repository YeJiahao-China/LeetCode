package com.yjh.leetcode;

import java.util.ArrayList;

//给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
public class SumOfTwoNumbersIVInputBST {

	static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		TreeNode treeNode5 = new TreeNode(5);
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode6 = new TreeNode(6);
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode4 = new TreeNode(4);
		TreeNode treeNode7 = new TreeNode(7);

		treeNode5.left = treeNode3;
		treeNode5.right = treeNode6;

		treeNode3.left = treeNode2;
		treeNode3.right = treeNode4;

		treeNode6.right = treeNode7;

		boolean findTarget = findTarget(treeNode5, 9);
		System.out.println(findTarget);
	}

	public static boolean findTarget(TreeNode root, int k) {
		if (root == null || (root.left == null && root.right == null)) {
			return false;
		}
		preOrder(root, k);
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) + list.get(j) == k) {
					return true;
				}
			}
		}
		return false;
	}

	public static void preOrder(TreeNode root, int k) {
		if (root.val <= k) {
			list.add(root.val);
		}
		if (root.left != null) {
			preOrder(root.left, k);
		}
		if (root.right != null) {
			preOrder(root.right, k);
		}
	}

}
