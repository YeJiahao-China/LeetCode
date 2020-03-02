package com.yjh.leetcode;

import java.util.ArrayList;

/*给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。

说明：
你可以假设 k 总是有效的，1 ≤ k ≤ 二叉搜索树元素个数。*/

public class TheKthSmallestElementInBinarySearchTree {
	static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) {

	}

	public static int kthSmallest(TreeNode root, int k) {
		if(root == null){
			return 0;
		}
		return list.get(k-1);
	}

	public static void inOrder(TreeNode root) {
		if (root.left != null) {
			inOrder(root.left);
		}
		list.add(root.val);
		if (root.right != null) {
			inOrder(root.right);
		}
	}
}
