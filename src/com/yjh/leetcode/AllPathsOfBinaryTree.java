package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class AllPathsOfBinaryTree {

	static ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode5 = new TreeNode(5);

		treeNode1.left = treeNode2;
		treeNode1.right = treeNode3;
		treeNode2.right = treeNode5;

		List<String> binaryTreePaths = binaryTreePaths(treeNode1);
		for (String string : binaryTreePaths) {
			System.out.println(string);
		}
	}

	public static List<String> binaryTreePaths(TreeNode root) {
		judge(root, "");
		return list;
	}

	public static void judge(TreeNode root, String res) {
		if (root.left == null && root.right == null) {
			res+=root.val;
			list.add(res);
			return;
		}
		res += root.val + "->";
		if (root.left != null) {
			judge(root.left, res);
		}
		if (root.right != null) {
			judge(root.right, res);
		}
	}
}
