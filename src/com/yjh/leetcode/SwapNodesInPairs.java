package com.yjh.leetcode;

/*��������������ÿ�������ڵĽڵ㽻��һ�Σ����������ͷָ��
����,
����1->2->3->4����Ӧ�÷�������2->1->4->3��
��������㷨ֻ��ʹ�ó������Ŀռ䡣�㲻���޸��б��е�ֵ��ֻ���޸Ľڵ㱾��*/
public class SwapNodesInPairs {

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);

		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;

		ListNode swapPairs = swapPairsAnother(listNode1);
		ListNode temp = swapPairs;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	public static ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode[] arr = new ListNode[1000];
		int index = 0;
		ListNode temp = head;
		while (temp != null) {
			arr[index] = temp;
			index++;
			temp = temp.next;
		}
		for (int i = 0; i <= index - 2; i += 2) {
			if (i + 1 <= index - 1) {
				ListNode node = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = node;
			}
		}
		for (int i = 0; i <= index - 1; i++) {
			arr[i].next = arr[i + 1];
		}
		return arr[0];
	}

	public static ListNode swapPairsAnother(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode dummy = new ListNode(0);
		ListNode cur = head;
		ListNode pre = dummy;
		while (cur != null && cur.next != null) {
			ListNode pNext = cur.next;
			cur.next = pNext.next;
			pNext.next = cur;
			pre.next = pNext;
			pre = cur;
			cur = cur.next;
		}
		return dummy.next;
	}
}
