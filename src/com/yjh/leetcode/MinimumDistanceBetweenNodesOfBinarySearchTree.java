package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumDistanceBetweenNodesOfBinarySearchTree {
	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode0 = new TreeNode(0);
		TreeNode treeNode48 = new TreeNode(48);
		TreeNode treeNode12 = new TreeNode(12);
		TreeNode treeNode49 = new TreeNode(49);
		
		treeNode1.left = treeNode0;
		treeNode1.right= treeNode48;
		treeNode48.left = treeNode12;
		treeNode48.right = treeNode49;
		
		int minDiffInBST = minDiffInBST(treeNode1);
		System.out.println(minDiffInBST);
	}

	public static int minDiffInBST(TreeNode root) {
		if (root == null || (root.left == null && root.right == null)) {
			return 0;
		}
		preOrder(root);
		ArrayList<Integer> d_ValList = new ArrayList<>();
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (!d_ValList.contains(Math.abs(list.get(i) - list.get(j)))) {
					d_ValList.add(Math.abs(list.get(i) - list.get(j)));
				}
			}
		}
		Collections.sort(d_ValList);
		return d_ValList.get(0);
	}

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
