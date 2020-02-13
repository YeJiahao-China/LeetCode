package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;;
public class LevelTraversalofBinaryTreeII {

	public static void main(String[] args) {
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode9 = new TreeNode(9);
		TreeNode treeNode20 = new TreeNode(20);
		TreeNode treeNode15 = new TreeNode(15);
		TreeNode treeNode7 = new TreeNode(7);
		treeNode3.left  =treeNode9;
		treeNode3.right = treeNode20;
		treeNode20.left = treeNode15;
		treeNode20.right = treeNode7;
		
		levelOrderBottom(treeNode3);
		
	}

	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		queue.add(root);
		int start = 0;
		int end = 1;
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			arrayList.add(node.val);
			start++;
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
			if (start == end) {
				start = 0;
				list.add(arrayList);
				arrayList = new ArrayList<Integer>();
				end = queue.size();
			}
		}
		List<List<Integer>> res = new ArrayList<>();
		for (int i = list.size()-1; i >= 0; i--) {
			res.add(list.get(i));
		}
		return res;
	}
}
