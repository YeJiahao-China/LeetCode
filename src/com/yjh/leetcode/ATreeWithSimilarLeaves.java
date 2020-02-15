package com.yjh.leetcode;

import java.util.ArrayList;


public class ATreeWithSimilarLeaves {
	static ArrayList<Integer> list1 = new ArrayList<Integer>();
	static ArrayList<Integer> list2 = new ArrayList<Integer>();

	public static void main(String[] args) {

	}

	public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
		if(root1==null || root2==null){
			return false;
		}
		preOrder1(root1);
		preOrder2(root2);
		if(list1.size() != list2.size()){
			return false;
		}
		for (int i = 0; i < list1.size(); i++) {
			if(list1.get(i)!=list2.get(i)){
				return false;
			}
		}
		return true;
	}

	public static void preOrder1(TreeNode root1) {
		if (root1.left == null && root1.right == null) {
			list1.add(root1.val);
		}
		if (root1.left != null) {
			preOrder1(root1.left);
		}
		if (root1.right != null) {
			preOrder1(root1.right);
		}
	}

	public static void preOrder2(TreeNode root2) {
		if (root2.left == null && root2.right == null) {
			list2.add(root2.val);
		}
		if (root2.left != null) {
			preOrder2(root2.left);
		}
		if (root2.right != null) {
			preOrder2(root2.right);
		}
	}

}
