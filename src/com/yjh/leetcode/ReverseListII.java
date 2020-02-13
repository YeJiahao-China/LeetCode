package com.yjh.leetcode;

/*
输入: 1->2->3->4->5->NULL, m = 2, n = 4
输出: 1->4->3->2->5->NULL*/

public class ReverseListII {

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);
//		ListNode listNode5 = new ListNode(5);
		
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
//		listNode4.next = listNode5;
		
		ListNode reverseBetween = reverseBetween(listNode1, 1, 4);
		ListNode temp = reverseBetween;
		while (temp!=null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	public static ListNode reverseBetween(ListNode head, int m, int n) {
		if (m == n || head == null || head.next == null) {
			return head;
		}
		int index = 1;
		ListNode temp = head;
		ListNode nodeM = null;
		ListNode nodeN = null;
		while (true) {
			if (index == m) {
				nodeM = temp;
				index++;
				temp = temp.next;
				while (true) {
					if(index==n){
						nodeN = temp;
						break;
					}
					temp = temp.next;
					index++;
				}
				//交换值
				int valM = nodeM.val;
				int valN = nodeN.val;
				nodeN.val = valM;
				nodeM.val = valN;
				break;
			} else {
				index++;
			}
			temp = temp.next;
		}
		return head;
	}
}
