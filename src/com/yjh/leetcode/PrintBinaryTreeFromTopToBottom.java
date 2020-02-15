package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintBinaryTreeFromTopToBottom {

	public static void main(String[] args) {
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode9 = new TreeNode(9);
		TreeNode treeNode20 = new TreeNode(20);
		TreeNode treeNode15 = new TreeNode(15);
		TreeNode treeNode7 = new TreeNode(7);
		
		treeNode3.left = treeNode9;
		treeNode3.right = treeNode20;
		
		treeNode20.left = treeNode15;
		treeNode20.right = treeNode7;
		
		int[] levelOrder = levelOrder(treeNode3);
		for (int i : levelOrder) {
			System.out.println(i);
		}
	}

	public static int[] levelOrder(TreeNode root) {
		if(root == null){
			int[] result = new int[0];
			return result;
		}
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);
		int start = 0, end = 1;
		while (!queue.isEmpty()) {
			TreeNode poll = queue.poll();
			list.add(poll.val);
			start++;
			if (poll.left != null) {
				queue.add(poll.left);
			}
			if (poll.right != null) {
				queue.add(poll.right);
			}
			if (start == end) {
				res.add(list);
				list = new ArrayList<>();
				end = queue.size();
				start = 0;
			}
		}
		int length = 0;
		for (int i = 0; i < res.size(); i++) {
			length += res.get(i).size();
		}
		int[] result = new int[length];
		int index = 0;
		for (int i = 0; i < res.size(); i++) {
			for (int j = 0; j < res.get(i).size(); j++) {
				result[index] = res.get(i).get(j);
				index++;
			}
		}
		return result;
	}
}
