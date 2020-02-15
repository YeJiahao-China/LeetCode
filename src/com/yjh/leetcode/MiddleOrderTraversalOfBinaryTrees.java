package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MiddleOrderTraversalOfBinaryTrees {

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

		List<Integer> inorderTraversal = inorderTraversal(treeNode1);
		
		for (Integer integer : inorderTraversal) {
			System.out.println(integer);
		}
	}

	// 迭代的方法中序遍历二叉树
	public static List<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode cur = root;
		while (cur != null || !stack.isEmpty()) {
			while(cur!=null){
				stack.push(cur);
				cur = cur.left;
			}
			cur = stack.pop();
			res.add(cur.val);
			cur = cur.right;
		}
		return res;
	}
}
