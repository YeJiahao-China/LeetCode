package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevelTraversalOfBinaryTrees {

	public static void main(String[] args) {

	}

	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		List<List<Integer>> temp = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		if (root == null) {
			return result;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int start = 0, end = 1;
		while (!queue.isEmpty()) {
			TreeNode poll = queue.poll();
			start++;
			list.add(poll.val);
			if (poll.left != null) {
				queue.add(poll.left);
			}
			if (poll.right != null) {
				queue.add(poll.right);
			}
			if (start == end) {
				temp.add(list);
				list = new ArrayList<>();
				start = 0;
				end = queue.size();
			}
		}
		for (int i = 0; i < temp.size(); i++) {
			if (i % 2 == 0) {
				result.add(temp.get(i));
			} else {
				Collections.reverse(temp.get(i));
				result.add(temp.get(i));
			}
		}
		return result;
	}

}
