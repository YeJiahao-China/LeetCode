package com.yjh.leetcode;

public class DiameterOfBinaryTree {
	int ans;
	public static void main(String[] args) {
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode2 = new TreeNode(1);
		TreeNode treeNode3 = new TreeNode(1);
		TreeNode treeNode4 = new TreeNode(1);
		TreeNode treeNode5 = new TreeNode(1);

		treeNode1.left = treeNode2;
		treeNode1.right = treeNode3;	
		treeNode2.left = treeNode4;
		treeNode2.right = treeNode5;

		int diameterOfBinaryTree = diameterOfBinaryTree(treeNode1);
		System.out.println(diameterOfBinaryTree);
	}

	public static int diameterOfBinaryTree(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = 0;
		int rightHeight = 0;
		if (root.left != null) {
			leftHeight = height(root.left);
		}
		if (root.right != null) {
			rightHeight = height(root.right);
		}
		return leftHeight + rightHeight;
	}

	// 计算root结点的左右子树的最大深度
	public static int height(TreeNode node) {
		return Math.max(node.left == null ? 0 : height(node.left), node.right == null ? 0 : height(node.right)) + 1;
	}

	/*public int diameterOfBinaryTreeLC(TreeNode root) {
		ans = 1;
		depth(root);
		return ans - 1;
	}

	public int depth(TreeNode node) {
		if (node == null)
			return 0;
		int L = depth(node.left);
		int R = depth(node.right);
		ans = Math.max(ans, L + R + 1);
		return Math.max(L, R) + 1;
	}*/

}
