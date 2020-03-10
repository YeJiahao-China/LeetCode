package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class PostorderTraversalNonRecursion {

	public static void main(String[] args) {
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode4 = new TreeNode(4);
		TreeNode treeNode7 = new TreeNode(7);
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode9 = new TreeNode(9);
		TreeNode treeNode6 = new TreeNode(6);
		TreeNode treeNode5 = new TreeNode(5);

		treeNode3.left = treeNode4;
		treeNode3.right = treeNode7;
		treeNode4.left = treeNode2;
		treeNode4.right = treeNode9;
		treeNode7.left = treeNode6;
		treeNode7.right = treeNode5;

		ArrayList<Integer> postorderTraversal = postorderTraversal(treeNode3);
		for (Integer integer : postorderTraversal) {
			System.out.println(integer);
		}
	}

	public static ArrayList<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode pop = stack.pop();
			list.add(0, pop.val);
			if (pop.left != null) {
				stack.push(pop.left);
			}
			if (pop.right != null) {
				stack.push(pop.right);
			}
		}
		return list;
	}

}
