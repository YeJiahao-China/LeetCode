package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.Stack;

/*给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
示例 1:

输入: 1->2->3->3->4->4->5
输出: 1->2->5
示例 2:

输入: 1->1->1->2->3
输出: 2->3*/

public class DeleteDuplicateElementIIInSortingList {

	public static void main(String[] args) {
		/*ListNode listNode11 = new ListNode(1);
		ListNode listNode21 = new ListNode(2);
		ListNode listNode22 = new ListNode(2);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);

		listNode11.next = listNode21;
		listNode21.next = listNode22;*/
		/*
		 * listNode13.next = listNode2; listNode2.next = listNode3;
		 */

		/*ListNode deleteDuplicates = deleteDuplicates(listNode11);
		ListNode temp = deleteDuplicates;
		while (temp != null) {
			System.out.println(temp.toString());
			temp = temp.next;
		}*/
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		// 利用栈来解决
		Stack<ListNode> stack = new Stack<>();
		ArrayList<ListNode> list = new ArrayList<>();
		ListNode temp = head;
		while (temp != null) {
			list.add(temp);
			temp = temp.next;
		}
		int index = 0;
		while (index <= list.size() - 1) {
			if (stack.isEmpty()) {
				stack.push(list.get(index));
				index++;
			} else {
				ListNode peek = stack.peek();
				if (peek.val == list.get(index).val) {
					// 此时要看list.get(index)的下一位是否跟peek的值相等 如果相等继续比较下一位
					// 如果不相等 就stack.pop() 然后push(list.get(index))
					do {
						index++;
					} while (index <= list.size() - 1 && peek.val == list.get(index).val);
					stack.pop();
					if (index <= list.size() - 1) {
						stack.push(list.get(index));
						index++;
					}
				} else {
					stack.push(list.get(index));
					index++;
				}
			}
		}
		for (int i = 0; i <= stack.size() - 1; i++) {
			if(i==stack.size()-1){
				stack.get(i).next = null;
			}else {
				stack.get(i).next = stack.get(i + 1);
			}
		}
		return stack.isEmpty() ? null : stack.get(0);
	}

}
