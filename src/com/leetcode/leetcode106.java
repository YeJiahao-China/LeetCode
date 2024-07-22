package com.leetcode;

import java.util.List;

/**
 * @author JHYe
 * @date 2024/7/17
 * <p>
 * 反转链表
 */
public class leetcode106 {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode listNode = reverseList(listNode1);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode p1 = head;
        ListNode p2 = head.next;

        while (p2 != null) {

            ListNode temp = p2.next;
            if (p1 ==head) p1.next = null;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }
        return p1;
    }
}
