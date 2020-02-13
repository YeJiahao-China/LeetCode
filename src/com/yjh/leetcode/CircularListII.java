package com.yjh.leetcode;

import java.util.ArrayList;

public class CircularListII {

	public static void main(String[] args) {

	}

	public static ListNode detectCycle(ListNode head) {
		ArrayList<ListNode> list = new ArrayList<>();
		ListNode result = null;
		ListNode temp = head;
		while (temp!=null) {
			if(!list.contains(temp)){
				list.add(temp);
			}else {
				result = temp;
			}
			temp = temp.next;
		}
		return result;
	}
}
