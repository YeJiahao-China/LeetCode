package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class TheSecondSmallestNodeInABinaryTree {

	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {

	}

	public static int findSecondMinimumValue(TreeNode root) {
		preOrder(root);
		Collections.sort(list);
		int res = -1;
		for (int i = 0; i < list.size()-1; i++) {
			if(list.get(i)<list.get(i+1)){
				res = list.get(i);
			}
		}
		return res;
	}

	public static void preOrder(TreeNode root) {
		list.add(root.val);
		if (root.left != null) {
			preOrder(root.left);
		}
		if (root.right != null) {
			preOrder(root.right);
		}
	}
}
