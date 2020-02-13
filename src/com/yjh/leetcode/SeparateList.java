package com.yjh.leetcode;

import java.util.ArrayList;

/*
 * ÊäÈë: head = 1->4->3->2->5->2, x = 3
Êä³ö: 1->2->2->4->3->5
 */
public class SeparateList {

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode4 = new ListNode(4);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode21 = new ListNode(2);
		ListNode listNode5 = new ListNode(5);
		ListNode listNode22 = new ListNode(2);
		
		listNode1.next = listNode4;
		listNode4.next = listNode3;
		listNode3.next = listNode21;
		listNode21.next = listNode5;
		listNode5.next = listNode22;
		
		ListNode partition = partition(listNode1, 3);
		ListNode temp = partition;
		while (temp!=null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	public static ListNode partition(ListNode head, int x) {
		if(head==null || head.next==null){
			return head;
		}
		ArrayList<ListNode> listLeft = new ArrayList<>();
		ArrayList<ListNode> listRight = new ArrayList<>();
		ListNode temp = head;
		while (temp != null) {
			if (temp.val < x) {
				listLeft.add(temp);
			} else {
				listRight.add(temp);
			}
			temp = temp.next;
		}
		ArrayList<ListNode> list = new ArrayList<>();
		list.addAll(listLeft);
		list.addAll(listRight);
		for (int i = 0; i <= list.size() - 1; i++) {
			if (i == list.size() - 1) {
				list.get(i).next = null;
			} else {
				list.get(i).next = list.get(i + 1);
			}
		}
		return list.get(0);
	}
}
