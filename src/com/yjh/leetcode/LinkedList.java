package com.yjh.leetcode;


public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode tempA = headA;
		ListNode tempB = headB;
		ListNode res = null;
		while (tempA!=null) {
			tempB = headB;
			while (tempB!=null) {
				if(tempB==tempA){
					res = tempB;
					return res;
				}else {
					tempB  =tempB.next;
				}
			}
			tempA = tempA.next;
		}
		return res;
	}
}
