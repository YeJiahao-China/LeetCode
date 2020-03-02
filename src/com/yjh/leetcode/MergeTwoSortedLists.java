package com.yjh.leetcode;

//将两个有序的链表合并为一个新链表，要求新的链表是通过拼接两个链表的节点来生成的。
public class MergeTwoSortedLists {

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);

		ListNode listNode5 = new ListNode(5);
		ListNode listNode6 = new ListNode(6);
		ListNode listNode7 = new ListNode(7);
		ListNode listNode8 = new ListNode(8);
		ListNode listNode9 = new ListNode(9);

		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;

		listNode5.next = listNode6;
		listNode6.next = listNode7;
		listNode7.next = listNode8;
		listNode8.next = listNode9;

		ListNode mergeTwoLists = mergeTwoLists(listNode1, listNode5);
		ListNode temp = mergeTwoLists;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}

	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode cur = head;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				cur.next = l1;
				l1 = l1.next;
			}else {
				cur.next = l2;
				l2 = l2.next;
			}
			cur = cur.next;
		}
		cur.next = l1 == null ? l2 : l1;
		return head.next;
	}
}
