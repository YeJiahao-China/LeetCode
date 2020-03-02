package com.yjh.leetcode;

import java.util.ArrayList;

public class NextLargerNodeInTheList {

	public static void main(String[] args) {
		/*
		 * 输入：[2,7,4,3,5] 输出：[7,0,5,5,0]
		 */
		/*
		 * 输入：[1,7,5,1,9,2,5,1] 输出：[7,9,9,9,0,5,0,0]
		 */
		ListNode node1_1 = new ListNode(1);
		ListNode node7 = new ListNode(7);
		ListNode node5 = new ListNode(5);
		ListNode node1_2 = new ListNode(1);
		ListNode node9 = new ListNode(9);
		ListNode node2 = new ListNode(2);
		ListNode node5_1 = new ListNode(5);
		ListNode node1_3 = new ListNode(1);

		node1_1.next = node7;
		node7.next = node5;
		node5.next = node1_2;
		node1_2.next = node9;
		node9.next = node2;
		node2.next = node5_1;
		node5_1.next = node1_3;

		int[] arr = nextLargerNodes(node1_1);
		for (int ele : arr) {
			System.out.println(ele);
		}
	}

	public static int[] nextLargerNodes(ListNode head) {
		ArrayList<Integer> list = new ArrayList<>();
		ListNode cur = head;
		ListNode next = cur.next;
		while (cur != null) {
			if (cur.next == null) {
				list.add(0);
				break;
			}
			while (next != null && next.val <= cur.val) {
				if (next.val > cur.val) {
					break;
				}
				next = next.next;
			}
			if (next != null) {
				list.add(next.val);
			} else {
				list.add(0);
			}
			cur = cur.next;
			next = cur.next;
		}
		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}
}
