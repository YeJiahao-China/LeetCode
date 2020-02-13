package com.yjh.leetcode;

import java.util.ArrayList;

public class MiddleNodeOfLinkedList {

	public static void main(String[] args) {

	}

	public static ListNode middleNode(ListNode head) {
		ArrayList<ListNode> list = new ArrayList<ListNode>();
		ListNode temp = head;
		while (temp != null) {
			list.add(temp);
			temp = temp.next;
		}
		
		return list.get(list.size()/2);
	}
}
