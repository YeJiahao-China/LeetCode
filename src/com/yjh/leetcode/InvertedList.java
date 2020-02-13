package com.yjh.leetcode;

public class InvertedList {

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);
		ListNode listNode5 = new ListNode(5);
		
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;
		
		ListNode reverseList = reverseList(listNode1);
		System.out.println(reverseList);
	}

	public static ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pre = null;
		ListNode cur = head;
		ListNode next = cur.next;

		while (true) {
			cur.next = pre;
			pre = cur;
			cur = next;
			next = next.next;
			if(next == null){
				cur.next = pre;
				break;
			}
		}
		return cur;
	}
}
