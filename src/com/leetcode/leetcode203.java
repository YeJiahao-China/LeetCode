package com.leetcode;

/**
 * @author JHYe
 * @date 2024/7/17
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 * 示例 1：
 * 输入：head = [1,2,6,3,4,5,6], val = 6
 * 输出：[1,2,3,4,5]
 * 示例 2：
 * <p>
 * 输入：head = [], val = 1
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：head = [7,7,7,7], val = 7
 * 输出：[]
 */
public class leetcode203 {

    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        // 先确定head的起始位置
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) return null;
        ListNode cur = head;
        ListNode curNext = cur.next;
        while (curNext != null ) {

            cur.next = curNext;
            while (curNext!=null && curNext.val == val){
                curNext = curNext.next;
                cur.next = curNext;
            }

            cur = cur.next;

        }

        return head;
    }


}

