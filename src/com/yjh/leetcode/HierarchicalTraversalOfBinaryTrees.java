package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class HierarchicalTraversalOfBinaryTrees {

	public static void main(String[] args) {
		
	}

	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if(root == null){
			return result;
		}
		ArrayList<Integer> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int start = 0, end = 1;
		while (!queue.isEmpty()) {
			TreeNode poll = queue.poll();
			list.add(poll.val);
			start++;
			if(poll.left!=null){
				queue.add(poll.left);
			}
			if(poll.right!=null){
				queue.add(poll.right);
			}
			if(start == end){
				result.add(list);
				list = new ArrayList<>();
				start = 0;
				end = queue.size();
			}
		}

		return result;
	}
}
