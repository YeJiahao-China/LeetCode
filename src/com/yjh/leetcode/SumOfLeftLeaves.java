package com.yjh.leetcode;

public class SumOfLeftLeaves {
	static int res = 0;
	public static void main(String[] args) {
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode9 = new TreeNode(9);
		/*TreeNode treeNode20 = new TreeNode(20);
		TreeNode treeNode15 = new TreeNode(15);
		TreeNode treeNode7 = new TreeNode(7);*/
		
		treeNode3.left = treeNode9;
//		treeNode3.right = treeNode20;
//		treeNode20.left = treeNode15;
//		treeNode20.right = treeNode7;
		
		int sumOfLeftLeaves = sumOfLeftLeaves(treeNode3);
		System.out.println(sumOfLeftLeaves);
	}

	public static int sumOfLeftLeaves(TreeNode root) {
		if(root==null){
			return 0;
		}
		judge(root,false);
		return res;
	}
	
	/*public static void judge(TreeNode root){
		if(root == null || root.left==null ){
			return ;
		}
		res += root.left.val;
		judge(root.left);
		judge(root.right);
	}*/
	
	
	public static void judge(TreeNode root,boolean flag){
		if(flag && root.left==null && root.right == null){
			res+=root.val;
			return;
		}
		if(root == null){
			return;
		}
		judge(root.left, true);
		judge(root.right, false);
	}
}
