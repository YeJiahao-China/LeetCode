package com.yjh.leetcode;

import java.util.ArrayList;

public class TheSameTree {

	static ArrayList<TreeNode> listp = new ArrayList<TreeNode>();
    static ArrayList<TreeNode> listq = new ArrayList<TreeNode>();
	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		TreeNode pleft = new TreeNode(2);
		TreeNode pright = new TreeNode(3);
		p.left = pleft;
		p.right = pright;
		
		TreeNode q = new TreeNode(1);
		TreeNode qleft = new TreeNode(2);
		TreeNode qright = new TreeNode(3);
		q.left = qleft;
		q.right = qright;
		
		boolean sameTree = isSameTree(p, q);
		System.out.println(sameTree);
	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {
		
		if(p==null && q==null){
			return true;
		}
		if(p==null || q==null){
			return false;
		}
		if(p.val == q.val){
			return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
		}else {
			return false;
		}
	}

	
}
