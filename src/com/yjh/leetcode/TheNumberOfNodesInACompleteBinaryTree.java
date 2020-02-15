package com.yjh.leetcode;

import java.util.ArrayList;

public class TheNumberOfNodesInACompleteBinaryTree {
	static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) {

	}

	public static int countNodes(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return list.size();
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
