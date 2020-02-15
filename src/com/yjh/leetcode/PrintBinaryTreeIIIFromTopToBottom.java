package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintBinaryTreeIIIFromTopToBottom {

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

		List<List<Integer>> levelOrder = levelOrder(treeNode1);
		for (List<Integer> list : levelOrder) {
			for (Integer integer : list) {
				System.out.println(integer);
			}
		}
	}

	public static List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> temp = new ArrayList<>();
		List<List<Integer>> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		ArrayList<Integer> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int start = 0, end = 1;
		while (!queue.isEmpty()) {
			TreeNode poll = queue.poll();
			start++;
			if (poll.left != null) {
				queue.add(poll.left);
			}
			if (poll.right != null) {
				queue.add(poll.right);
			}
			list.add(poll.val);
			if (start == end) {
				temp.add(list);
				list = new ArrayList<>();
				end = queue.size();
				start = 0;
			}
		}
		for (int i = 0; i < temp.size(); i++) {
			if (i % 2 == 0) {
				res.add(temp.get(i));
			} else {
				Collections.reverse(temp.get(i));
				res.add(temp.get(i));
			}
		}
		return res;
	}
}
