package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author JHYe
 * @date 2024/7/18
 * <p>
 * 给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * <p>
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 * <p>
 * 不允许修改 链表。
 */
public class leetcode142 {

    public static void main(String[] args) {
        ListNode listNode3 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode0 = new ListNode(0);
        ListNode listNode4 = new ListNode(4);

        listNode3.next = listNode2;
        listNode2.next = listNode0;
        listNode0.next = listNode4;
        listNode4.next = listNode2;

        System.out.println(detectCycle(listNode3).val);
    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        // 定义一个fast和slow指针，slow指针一次移动一个结点，fast指针一次移动两个结点 终究会在环内相遇
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                // 有环
                ListNode index0 = fast;
                ListNode index1 = head;
                while (index0!=index1){
                    index0 = index0.next;
                    index1 = index1.next;
                }
                return index0;
            }

        }
        return null;
    }


    public static ListNode detectCycle0(ListNode head) {
        if (head == null || head.next == null) return null;
        Map<ListNode, Integer> map = new HashMap<>();// 用来记录各个结点被访问的次数 ，当出现第一个访问次数为2的结点就返回索引

        int index = 0;
        ListNode cur = head;

        while (cur != null && map.get(cur) == null) {

            map.put(cur, 1);

            cur = cur.next;
        }

        return cur;
    }

}
