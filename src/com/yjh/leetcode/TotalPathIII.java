package com.yjh.leetcode;

public class TotalPathIII {
	static int result;

	public static void main(String[] args) {
		TreeNode treeNode10 = new TreeNode(10);
		TreeNode treeNode5 = new TreeNode(5);
		TreeNode treeNode_3 = new TreeNode(-3);
		TreeNode treeNode31 = new TreeNode(3);
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode11 = new TreeNode(11);
		TreeNode treeNode32 = new TreeNode(3);
		TreeNode treeNode_2 = new TreeNode(-2);
		TreeNode treeNode1 = new TreeNode(1);
		
		treeNode10.left = treeNode5;
		treeNode10.right = treeNode_3;
		
		treeNode5.left = treeNode31;
		treeNode5.right= treeNode2;
		
		treeNode_3.right = treeNode11;
		
		treeNode31.left = treeNode32;
		treeNode31.right = treeNode_2;
		
		treeNode2.right = treeNode1;
		
		int pathSum = pathSum(treeNode10, 8);
		System.out.println(pathSum);
		
	}

	public static int pathSum(TreeNode root, int sum) {
		if (root == null) {
			return 0;
		}
		pathSumSub(root, sum);
		return result;
	}

	public static void pathSumSub(TreeNode root, int sum) {
		if (root == null) {
			return;
		}
		judge(root, sum, 0);
		if (root.left != null) {
			pathSumSub(root.left, sum);
		}
		if (root.right != null) {
			pathSumSub(root.right, sum);
		}
	}

	public static void judge(TreeNode root, int sum, int temp) {
		if (root == null) {
			return;
		}
		temp += root.val;
		if (temp == sum) {
			result++;
		}
		judge(root.left, sum, temp);
		judge(root.right, sum, temp);
	}
}
