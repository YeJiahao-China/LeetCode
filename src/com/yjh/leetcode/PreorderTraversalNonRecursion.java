package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class PreorderTraversalNonRecursion {

	public static void main(String[] args) {

	}

	public static ArrayList<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode pop = stack.pop();
			list.add(pop.val);
			if (pop.right != null) {
				stack.push(pop.right);
			}
			if (pop.left != null) {
				stack.push(pop.left);
			}
		}
		return list;
	}

}
