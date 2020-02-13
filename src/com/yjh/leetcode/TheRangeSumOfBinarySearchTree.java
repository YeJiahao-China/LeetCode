package com.yjh.leetcode;

import java.util.ArrayList;


/*给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
二叉搜索树保证具有唯一的值。

示例 1：
输入：root = [10,5,15,3,7,null,18], L = 7, R = 15
输出：32*/

public class TheRangeSumOfBinarySearchTree {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static String str;
	public static void main(String[] args) {
		TreeNode treeNode10 = new TreeNode(10);
		TreeNode treeNode5 = new TreeNode(5);
		TreeNode treeNode15 = new TreeNode(15);
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode7 = new TreeNode(7);
		TreeNode treeNode18 = new TreeNode(18);

		treeNode10.left = treeNode5;
		treeNode10.right = treeNode15;

		treeNode5.left = treeNode3;
		treeNode5.right = treeNode7;

		treeNode15.right = treeNode18;
		System.out.println(System.currentTimeMillis());
		int rangeSumBST = rangeSumBST(treeNode10, 7, 15);
		System.out.println(System.currentTimeMillis());
		System.out.println(rangeSumBST);
	}

	public static int rangeSumBST(TreeNode root, int L, int R) {
		if (root == null || L > R) {
			return 0;
		}
		preOrder(root);
		int result = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) >= L && list.get(i) <= R) {
				result += list.get(i);
			}
		}
		return result;

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
}
