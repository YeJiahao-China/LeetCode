package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TheLayerAverageValueOfBinaryTree {

	public static void main(String[] args) {
		
	}

	public static List<Double> averageOfLevels(TreeNode root) {
		ArrayList<ArrayList<Integer>> storage = new ArrayList<ArrayList<Integer>>();
		List<Double> res = new ArrayList<Double>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int start = 0, end = 1;
		while (!queue.isEmpty()) {
			TreeNode poll = queue.poll();
			temp.add(poll.val);
			start++;
			if (poll.left != null) {
				queue.add(poll.left);
			}
			if (poll.right != null) {
				queue.add(poll.right);
			}
			if (start == end) {
				storage.add(temp);
				temp = new ArrayList<Integer>();
				end = queue.size();
				start = 0;
			}
		}
		for (int i = 0; i < storage.size(); i++) {
			ArrayList<Integer> arrayList = storage.get(i);
			double val = 0;
			for (int j = 0; j < arrayList.size(); j++) {
				val+=arrayList.get(j);
			}
			Double d = val/arrayList.size();
			res.add(d);
		}
		return res;
	}
}
