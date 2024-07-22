package com.leetcode;

import java.util.List;

/**
 * @author JHYe
 * @date 2024/7/18
 *
 * 面试题 02.07. 链表相交
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。
 * 4 -> 1
 *              8 -> 4 -> 5 -> null
 * 5 -> 0 -> 1
 * 注意，函数返回结果后，链表必须 保持其原始结构 。
 */
public class leetcode0207 {

    public static void main(String[] args) {


    }

    public static ListNode getIntersectionNode(ListNode headA,ListNode headB){
        // 合并链表实现同步移动  比较巧妙
        ListNode pA = headA;
        ListNode pB = headB;

        while (pA!=pB){
            // 比如现在pA指向null，此时pB指向5，随后pA指向headB，pB指向null
            // 接下来pB指向headA，pA指向0，此时就pA和pB就达到了同一个起始位置
            // 即经过第一轮遍历，pA和pB经过交换头结点就能达到同一起始位置
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        // 要不存在共同结点，要不pA == pB都为null
        return pA;
    }


    public static ListNode getIntersectionNode0(ListNode headA,ListNode headB){
        if (headA==null || headB == null) return null;
        if (headA == headB) return headA;
        // 先求出两个链表的长度
        int lengthA = 0;
        int lengthB = 0;
        ListNode countA = headA;
        ListNode countB = headB;

        while (countA!=null){
            lengthA++;
            countA = countA.next;
        }

        while (countB!=null){
            lengthB++;
            countB = countB.next;
        }

        // 让长度较长的链表的头结点移动到与短链表对齐的位置
        ListNode curA = headA;
        ListNode curB = headB;
        if (lengthA>lengthB){
            int i = lengthA - lengthB;
            while (i>0){
                curA = curA.next;
                i--;
            }
        }
        if (lengthA<lengthB){
            int i = lengthB - lengthA;
            while (i>0){
                curB = curB.next;
                i--;
            }
        }
        // 可以比较了
        while (curA!=curB && curA!=null && curB != null){
            curA = curA.next;
            curB = curB.next;
        }

        return curA==null || curB == null ? null : curA;
    }

}
