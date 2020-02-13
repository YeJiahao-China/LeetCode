package com.yjh.leetcode;

import java.util.ArrayList;

public class CircularLinkedList {

	public static void main(String[] args) {

	}

	public boolean hasCycle(ListNode head) {
		if(head==null){
			return false;
		}
		boolean flag = false;
		ArrayList<ListNode> list = new ArrayList<ListNode>();
		ListNode temp = head.next;
		list.add(head);
		while (temp!=null) {
			if(!list.contains(temp)){
				list.add(temp);
				temp = temp.next;
			}else {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
