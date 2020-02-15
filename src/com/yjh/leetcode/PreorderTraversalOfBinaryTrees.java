package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PreorderTraversalOfBinaryTrees {

	public static void main(String[] args) {
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode0 = new TreeNode(0);
		TreeNode treeNode48 = new TreeNode(48);
		TreeNode treeNode12 = new TreeNode(12);
		TreeNode treeNode49 = new TreeNode(49);
		TreeNode treeNode5 = new TreeNode(5);
		TreeNode treeNode7 = new TreeNode(7);

		treeNode1.left = treeNode0;
		treeNode1.right = treeNode48;

		treeNode0.left = treeNode5;
		treeNode0.right = treeNode7;

		treeNode48.left = treeNode12;
		treeNode48.right = treeNode49;

		preorderTraversal(treeNode1);
	}

	// 迭代的方法前序遍历二叉树
	public static List<Integer> preorderTraversal(TreeNode root) {
		LinkedList<TreeNode> stack = new LinkedList<>();
		ArrayList<Integer> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		stack.add(root);

		while (!stack.isEmpty()) {
			TreeNode pollLast = stack.pollLast();
			result.add(pollLast.val);
			if (pollLast.right != null) {
				stack.add(pollLast.right);
			}
			if (pollLast.left != null) {
				stack.add(pollLast.left);
			}
		}
		return result;
	}

}
