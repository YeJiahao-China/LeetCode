package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversalOfNTree {

	public static void main(String[] args) {

	}

	public static List<Integer> postorder(Node root) {
		Stack<Node> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		if(root == null)
			return list;
		stack.add(root);
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			list.add(0, node.val);
			List<Node> children = node.children;
			if (children != null && children.size() != 0) {
				for (int i = 0; i < children.size(); i++) {
					stack.add(children.get(i));
				}
			}
		}
		return list;
	}
}
