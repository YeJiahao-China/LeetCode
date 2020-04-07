package com.yjh.leetcode;

import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

public class PreorderTraversalOfNTree {

	public static void main(String[] args) {
	}

	public static List<Integer> preorder(Node root) {
		ArrayList<Integer> list = new ArrayList<>();
		if(root == null){
			return list;
		}
		Stack<Node> stack = new Stack<Node>();
		stack.add(root);
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			list.add(node.val);
			List<Node> children = node.children;
			if (children != null && children.size() != 0) {
				for (int i = children.size() - 1; i >= 0; i--) {
					stack.add(children.get(i));
				}
			}

		}
		return list;
	}
}
