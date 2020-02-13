package com.yjh.leetcode;

import java.util.ArrayList;

/*删除链表中等于给定值 val 的所有节点。

示例:

输入: 1->2->6->3->4->5->6, val = 6
输出: 1->2->3->4->5*/
// 1,2,6,3,4,5,6
public class RemoveLinkedListElements {
	// 1,2,2,1
	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode61 = new ListNode(6);
		ListNode listNode3 = new ListNode(3);

		ListNode listNode4 = new ListNode(4);
		ListNode listNode5 = new ListNode(5);
		ListNode listNode62 = new ListNode(6);

		listNode1.next = listNode2;
		listNode2.next = listNode61;
		listNode61.next = listNode3;

		listNode3.next = listNode4;
		listNode4.next = listNode5;
		listNode5.next = listNode62;

		ListNode removeElements = removeElements(listNode1, 6);
		ListNode temp = removeElements;
		while (temp!=null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	public static ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return head;
		}
		ArrayList<ListNode> list = new ArrayList<ListNode>();
		ListNode temp = head;
		while (temp != null) {
			// temp的val不等于val就添加进list中
			if (temp.val != val) {
				list.add(temp);
			}
			temp = temp.next;
		}
		if (list.size() == 0) {
			head  = null;
			return head;
		}
		for (int i = 0; i < list.size(); i++) {
			list.get(i).next = null;
		}
		for (int i = 0; i < list.size() - 1; i++) {
			list.get(i).next = list.get(i+1);
		}
		return list.get(0);
	}
}
