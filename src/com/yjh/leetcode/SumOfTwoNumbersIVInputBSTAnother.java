package com.yjh.leetcode;

import java.util.ArrayList;

public class SumOfTwoNumbersIVInputBSTAnother {
	static ArrayList<Integer> list = new ArrayList<>();
	static boolean result = false;

	public static void main(String[] args) {
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode0 = new TreeNode(0);
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode_4 = new TreeNode(-4);
		TreeNode treeNode1 = new TreeNode(1);

		treeNode2.left = treeNode0;
		treeNode2.right = treeNode3;

		treeNode0.left = treeNode_4;
		treeNode0.right = treeNode1;


		boolean findTarget = findTarget(treeNode2, -1);
		System.out.println(findTarget);
	}

	public static boolean findTarget(TreeNode root, int k) {
		if (root == null || (root.left == null && root.right == null)) {
			return false;
		}
		judge(root, k);
		return result;
	}

	public static void judge(TreeNode node, int k) {
		if (node == null) {
			return;
		}
		
		if (list.size() == 0) {
			list.add(node.val);
		}else {
			for (int i = 0; i < list.size(); i++) {
				if (node.val + list.get(i) == k) {
					result = true;
					return;
				}
			}
		}
		list.add(node.val);
		judge(node.left, k);
		judge(node.right, k);
	}
}
