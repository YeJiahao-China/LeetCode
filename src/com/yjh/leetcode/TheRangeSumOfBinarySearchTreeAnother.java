package com.yjh.leetcode;

public class TheRangeSumOfBinarySearchTreeAnother {
	static int result;

	public static void main(String[] args) {
		TreeNode treeNode10 = new TreeNode(10);
		TreeNode treeNode5 = new TreeNode(5);
		TreeNode treeNode15 = new TreeNode(15);
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode7 = new TreeNode(7);
		TreeNode treeNode18 = new TreeNode(18);

		treeNode10.left = treeNode5;
		treeNode10.right = treeNode15;

		treeNode5.left = treeNode3;
		treeNode5.right = treeNode7;

		treeNode15.right = treeNode18;
		System.out.println(System.currentTimeMillis());
		int rangeSumBST = rangeSumBST(treeNode10, 7, 15);
		System.out.println(System.currentTimeMillis());
		System.out.println(rangeSumBST);
	}

	public static int rangeSumBST(TreeNode root, int L, int R) {
		if (root == null || L > R) {
			return 0;
		}
		judge(root, L, R);
		return result;
	}

	public static void judge(TreeNode root, int L, int R) {
		if (root == null) {
			return;
		}
		if (root.val <= R && root.val >= L) {
			result += root.val;
		}
		judge(root.left, L, R);
		judge(root.right, L, R);
	}
}
