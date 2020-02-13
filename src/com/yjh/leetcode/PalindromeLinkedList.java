package com.yjh.leetcode;

import java.util.ArrayList;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		ListNode listNode11 = new ListNode(-129);
		/*ListNode listNode21 = new ListNode(2);
		ListNode listNode22 = new ListNode(2);*/
		ListNode listNode12 = new ListNode(-129);
		
		/*listNode11.next = listNode21;
		listNode21.next = listNode22;
		listNode22.next = listNode12;*/
		listNode11.next = listNode12;
		
		boolean palindrome = isPalindrome(listNode11);
		System.out.println(palindrome);
	}

	public static boolean isPalindrome(ListNode head) {
		if(head==null || head.next==null){
			return true;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		ListNode temp = head;
		while (temp!=null) {
			list.add(temp.val);
			temp = temp.next;
		}
		boolean res = true;
		for (int i = 0; i < list.size()/2; i++) {
			if(list.get(i).intValue()!=list.get(list.size()-i-1).intValue()){
				res = false;
				break;
			}
		}
		return res;
	}
}
