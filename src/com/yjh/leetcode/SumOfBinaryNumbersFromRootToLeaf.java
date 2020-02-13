package com.yjh.leetcode;

import java.util.ArrayList;
/*示例：
输入：[1,0,1,0,1,0,1]
输出：22
解释：(100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22*/

public class SumOfBinaryNumbersFromRootToLeaf {
	static ArrayList<String> list = new ArrayList<String>();

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
		judge(root,"");
		int result = 0;
		for (int i = 0; i < list.size(); i++) {
			result+=Integer.parseInt(list.get(i), 2);
		}
		return result;
	}

	public static void judge(TreeNode node,String temp) {
		if (node.left == null && node.right == null) {
			temp+=node.val;
			list.add(temp);
			return;
		}
		temp+=node.val;
		if(node.left!=null){
			judge(node.left, temp);
		}
		if(node.right!=null){
			judge(node.right, temp);
		}
	}
}
