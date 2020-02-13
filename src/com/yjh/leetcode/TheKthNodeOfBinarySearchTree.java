package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class TheKthNodeOfBinarySearchTree {
	static ArrayList<Integer> list;

	public static void main(String[] args) {

	}

	public static int kthLargest(TreeNode root, int k) {
		if(k<=0 || k>list.size()){
			return 0;
		}
		Collections.sort(list);
		return list.get(list.size()-k);
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
