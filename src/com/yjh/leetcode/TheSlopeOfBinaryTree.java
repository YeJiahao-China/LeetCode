package com.yjh.leetcode;

import java.util.ArrayList;

public class TheSlopeOfBinaryTree {
	static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode5 = new TreeNode(5);

		treeNode1.left = treeNode2;
		treeNode1.right = treeNode3;
		treeNode2.right = treeNode5;
		
		int findTilt = findTilt(treeNode1);
		System.out.println(findTilt);
	}

	public static int findTilt(TreeNode root) {
		judge(root);
		int res = 0;
		for (int i = 0; i < list.size(); i++) {
			res += list.get(i);
		}
		return res;
	}

	public static void judge(TreeNode root) {
		if (root.left == null && root.right == null) {
			return;
		}
		if (root.left == null) {
			list.add(root.right.val);
		} else if (root.right == null) {
			list.add(root.left.val);
		} else {
			list.add(Math.abs(root.left.val - root.right.val));
		}

		if (root.left != null) {
			judge(root.left);
		}
		if (root.right != null) {
			judge(root.right);
		}
	}
}
