package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.Collections;

/*将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

示例：

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4*/

public class MergeTwoOrderedLists {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l4;

		ListNode L1 = new ListNode(1);
		ListNode L3 = new ListNode(3);
		ListNode L4 = new ListNode(4);
		L1.next = L3;
		L3.next = L4;

		ListNode mergeTwoLists = mergeTwoLists(l1, L1);
		System.out.println(mergeTwoLists);
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null && l2!=null){
			return l2;
		}
		if(l2==null && l1!=null){
			return l1;
		}
		if(l1==null && l2==null){
			return null;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		ListNode temp1 = l1;
		while (temp1 != null) {
			list.add(temp1.val);
			temp1 = temp1.next;
		}
		ListNode temp2 = l2;
		while (temp2 != null) {
			list.add(temp2.val);
			temp2 = temp2.next;
		}

		// 按照非递减排序
		Collections.sort(list);
		ListNode head = new ListNode(list.get(0));
		ListNode temp = head;
		for (int i = 1; i < list.size(); i++) {
			ListNode next = new ListNode(list.get(i));
			temp.next = next;
			temp = next;
		}

		return head;
	}

}
