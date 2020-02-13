package com.yjh.leetcode;


public class SumOfBinaryNumbersFromRootToLeafAnother {
	static int result;
	public static void main(String[] args) {
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode2 = new TreeNode(0);
		TreeNode treeNode3 = new TreeNode(1);
		TreeNode treeNode4 = new TreeNode(0);
		TreeNode treeNode5 = new TreeNode(1);
		TreeNode treeNode6 = new TreeNode(0);
		TreeNode treeNode7 = new TreeNode(1);

		treeNode1.left = treeNode2;
		treeNode1.right = treeNode3;
		treeNode2.left = treeNode4;
		treeNode2.right = treeNode5;
		treeNode3.left = treeNode6;
		treeNode3.right = treeNode7;

		int sumRootToLeaf = sumRootToLeaf(treeNode1);
		System.out.println(sumRootToLeaf);

	}

	public static int sumRootToLeaf(TreeNode root) {
		if (root == null) {
			return 0;
		}
		judge(root, "");
		return result;
	}

	public static void judge(TreeNode node, String temp) {
		if (node.left == null && node.right == null) {
			temp += node.val;
			result+=Integer.parseInt(temp, 2);
			return;
		}
		temp += node.val;
		if (node.left != null) {
			judge(node.left, temp);
		}
		if (node.right != null) {
			judge(node.right, temp);
		}
	}
}
