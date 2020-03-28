package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TotalPathII {
	static List<List<Integer>> listAll = new ArrayList<>();

	public static void main(String[] args) {
		TreeNode treeNode51 = new TreeNode(5);
		TreeNode treeNode41 = new TreeNode(4);
		TreeNode treeNode8 = new TreeNode(8);
		TreeNode treeNode11 = new TreeNode(11);
		TreeNode treeNode13 = new TreeNode(13);
		TreeNode treeNode42 = new TreeNode(4);
		TreeNode treeNode7 = new TreeNode(7);
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode52 = new TreeNode(5);
		TreeNode treeNode1 = new TreeNode(1);

		treeNode51.left = treeNode41;
		treeNode51.right = treeNode8;
		treeNode41.left = treeNode11;
		treeNode8.left = treeNode13;
		treeNode8.right = treeNode42;
		treeNode11.left = treeNode7;
		treeNode11.right = treeNode2;
		treeNode42.left = treeNode52;
		treeNode42.right = treeNode1;

		List<List<Integer>> pathSum = pathSum(treeNode51, 22);
		for (List<Integer> list : pathSum) {
			for (Integer integer : list) {
				System.out.print(integer);
			}
			System.out.println();
		}
	}

	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
		judge(root, sum, new ArrayList<>(), 0);

		return listAll;
	}

	public static void judge(TreeNode root, int sum, List<Integer> list, int singleSum) {
		// 记录每条序列的总和
		singleSum += root.val;

		// 记录该条序列的序列值
		list.add(root.val);
		// 子序列的判断条件，以及是否==sum
		if (root.left == null && root.right == null) {
			if (sum == singleSum) {
				listAll.add(new ArrayList<>(list));
			}
			return;
		}
		if (root.left != null) {
			// 每次退出时删除已经遍历过的节点值
			judge(root.left, sum, list, singleSum);
			list.remove(list.size() - 1);
		}
		if (root.right != null) {
			// 每次退出时删除已经遍历过的节点值
			judge(root.right, sum, list, singleSum);
			list.remove(list.size() - 1);
		}

		return;

	}
}
