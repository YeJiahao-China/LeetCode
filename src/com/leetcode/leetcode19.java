package com.leetcode;

/**
 * @author JHYe
 * @date 2024/7/17
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * 示例 1：
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 示例 2：
 * 输入：head = [1], n = 1
 * 输出：[]
 * 示例 3：
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 * <p>
 * 进阶：你能尝试使用一趟扫描实现吗？
 */
public class leetcode19 {

    public static void main(String[] args) {

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        //链表为 7 -> 3 -> 6 -> 8 -> 9 -> null
        // 为什么要先让f移动n+1个位置
        // 比如需要删除倒数第二个结点8 ，那我们需要知道8前面的节点也是s指针指向的位置 f只管往后移动到null 此时f与s相差3(n+1)
        // 比如需要删除倒数第一个结点9， 那我们需要知道9前面的节点也是s指针指向的位置 f只管往后移动到null 此时f与s相差2(n+1)
        // 为什么要创建虚拟头结点呢
        //链表为 1 只有一个元素 要删除倒数第一个结点
        // 如果创建虚拟头结点0  0 -> 1 -> null
        // 此时f指向null，s指向0，需要把s.next = s.next.next 返回0.next即可
        if (head==null) return null;
        ListNode virtual = new ListNode(0);
        virtual.next = head;
        ListNode s = virtual;
        ListNode f = virtual;
        for (int i = 0; i <= n; i++) {
            f = f.next;
        }
        while (f != null) {
            f = f.next;
            s = s.next;
        }
        s.next = s.next.next;
        return virtual.next;
    }
}
