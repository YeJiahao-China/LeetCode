package com.yjh.leetcode;

import java.util.ArrayList;

public class DeleteDuplicateElementsInSortedList {

	public static void main(String[] args) {
		ListNode listNode11 = new ListNode(1);
		ListNode listNode12 = new ListNode(1);
		ListNode listNode13 = new ListNode(1);
		ListNode listNode21 = new ListNode(2);
		ListNode listNode22 = new ListNode(2);
		ListNode listNode23 = new ListNode(2);
		ListNode listNode24 = new ListNode(2);
		ListNode listNode31 = new ListNode(3);
		ListNode listNode32 = new ListNode(3);
		ListNode listNode33 = new ListNode(3);

		listNode11.next = listNode12;
		listNode12.next = listNode13;
		listNode13.next = listNode21;
		listNode21.next = listNode22;
		listNode22.next = listNode23;
		listNode23.next = listNode24;
		listNode24.next = listNode31;
		listNode31.next = listNode32;
		listNode32.next = listNode33;

		/*
		 * listNode11.next = listNode12; listNode12.next = listNode21;
		 */

		ListNode deleteDuplicates = deleteDuplicates(listNode11);
		ListNode temp = deleteDuplicates;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	/*
	 * public static ListNode deleteDuplicates(ListNode head) { if (head == null
	 * || head.next == null) { return head; } ListNode cur = head; ListNode next
	 * = cur.next; while (next!=null) { if (cur.val == next.val) { while (next
	 * != null && next.val == cur.val) { next = next.next; } if(next==null){
	 * cur.next = next; break; } cur.next = next; cur = next; next = next.next;
	 * }else { cur = cur.next; next = next.next; } } return head; }
	 */

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode temp = head;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (temp != null) {
			if (!list.contains(temp.val)) {
				list.add(temp.val);
			}
			temp = temp.next;
		}
		if (list.size() == 1) {
			head = new ListNode(list.get(0));
			return head;
		}
		ArrayList<ListNode> arrayList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			arrayList.add(new ListNode(list.get(i)));
		}
		for (int i = 0; i <= arrayList.size() - 2; i++) {
			arrayList.get(i).next = arrayList.get(i+1);
		}
		return arrayList.get(0);
	}
}
