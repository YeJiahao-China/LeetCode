package com.yjh.leetcode;

import java.util.ArrayList;

public class ReturnToTheLastKNodes {

	public static void main(String[] args) {
	}

	public static int kthToLast(ListNode head, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		ListNode temp = head;
		while (temp != null) {
			list.add(temp.val);
			temp = temp.next;
		}
		return list.get(list.size() - k);
	}
}
