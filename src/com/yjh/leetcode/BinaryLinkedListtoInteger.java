package com.yjh.leetcode;

public class BinaryLinkedListtoInteger {

	public static void main(String[] args) {
//		getDecimalValue(head)
	}

	public static int getDecimalValue(ListNode head) {
		String str = "";
		ListNode temp = head;
		while (temp!=null) {
			str+=temp.val;
			temp = temp.next;
		}
		return Integer.parseInt(str, 2);
	}
}
