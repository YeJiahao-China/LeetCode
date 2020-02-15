package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TheSumOfTheDeepestLeafNodes {

	public static void main(String[] args) {

	}

	public static int deepestLeavesSum(TreeNode root) {

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
				start = 0;
				end = queue.size();
			}
		}
		int result = 0;
		for (int i = 0; i < res.get(res.size() - 1).size(); i++) {
			result += res.get(res.size() - 1).get(i);
		}
		return result;
	}

}
