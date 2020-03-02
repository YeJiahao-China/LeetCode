package com.yjh.leetcode;

import java.util.Arrays;

public class ReconstructionOfBinaryTree {

	public static void main(String[] args) {
		// 前序遍历 preorder = [3,9,20,15,7]
		// 中序遍历 inorder = [9,3,15,20,7]
		int[] preorder = { 3, 9, 20, 15, 7 };
		int[] inorder = { 9, 3, 15, 20, 7 };

		TreeNode buildTree = buildTree(preorder, inorder);
		preorder(buildTree);
	}

	public static TreeNode buildTree(int[] preorder, int[] inorder) {
		if (preorder == null || inorder == null) {
			return null;
		}
		TreeNode root = new TreeNode(preorder[0]);
		for (int i = 0; i < inorder.length; i++) {
			if (inorder[i] == root.val) {
				root.left = buildTree(Arrays.copyOfRange(preorder, 1, i + 1), Arrays.copyOfRange(inorder, 0, i));
				root.right = buildTree(Arrays.copyOfRange(preorder, i + 1, preorder.length),
						Arrays.copyOfRange(inorder, i + 1, inorder.length));
			
				break;
			}
		}
		return root;
	}

	public static void preorder(TreeNode root) {
		System.out.println(root.val);
		if (root.left != null) {
			preorder(root.left);
		}
		if (root.right != null) {
			preorder(root.right);
		}
	}
}
