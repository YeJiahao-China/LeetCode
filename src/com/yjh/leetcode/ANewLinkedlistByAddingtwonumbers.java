package com.yjh.leetcode;

import java.util.Stack;

public class ANewLinkedlistByAddingtwonumbers {

	public static void main(String[] args) {
		/*
		 * ListNode listNode2 = new ListNode(2); ListNode listNode4 = new
		 * ListNode(4); ListNode listNode3 = new ListNode(3); ListNode listNode5
		 * = new ListNode(5); ListNode listNode6 = new ListNode(6); ListNode
		 * listNode41 = new ListNode(4);
		 * 
		 * listNode2.next = listNode4; listNode4.next = listNode3;
		 * listNode5.next = listNode6; listNode6.next = listNode41;
		 */
		/*
		 * [9] [1,9,9,9,9,9,9,9,9,9]
		 */

		ListNode listNode = new ListNode(9);
		ListNode listNode1 = new ListNode(1);
		ListNode listNode91 = new ListNode(9);
		ListNode listNode92 = new ListNode(9);
		ListNode listNode93 = new ListNode(9);
		ListNode listNode94 = new ListNode(9);
		ListNode listNode95 = new ListNode(9);
		ListNode listNode96 = new ListNode(9);
		ListNode listNode97 = new ListNode(9);
		ListNode listNode98 = new ListNode(9);
		ListNode listNode99 = new ListNode(9);

		listNode1.next = listNode91;
		listNode91.next = listNode92;
		listNode92.next = listNode93;
		listNode93.next = listNode94;
		listNode94.next = listNode95;
		listNode95.next = listNode96;
		listNode96.next = listNode97;
		listNode97.next = listNode98;
		listNode98.next = listNode99;

		ListNode addTwoNumbers = addTwoNumbers(listNode, listNode1);
		System.out.println(addTwoNumbers);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		ListNode temp1 = l1;
		ListNode temp2 = l2;
		while (temp1 != null) {
			stack1.push(temp1.val);
			temp1 = temp1.next;
		}
		while (temp2 != null) {
			stack2.push(temp2.val);
			temp2 = temp2.next;
		}
		String str1 = "";
		String str2 = "";
		while (!stack1.isEmpty()) {
			Integer pop = stack1.pop();
			str1 += pop;
		}
		while (!stack2.isEmpty()) {
			Integer pop = stack2.pop();
			str2 += pop;
		}
		// 针对（9999999991+9）得情况
		// 比较str1和str2得长度 对于长度比较短的字符串采取高位补0的方法
		int length1 = str1.length();
		int length2 = str2.length();
		if (length1 > length2) {
			StringBuffer stringBuffer = new StringBuffer();
			for (int i = 0; i < length1 - length2; i++) {
				stringBuffer.append(0);
			}
			String string = stringBuffer.toString();
			string += str2;
			str2 = string;
		}
		if (length2 > length1) {
			StringBuffer stringBuffer = new StringBuffer();
			for (int i = 0; i < length2 - length1; i++) {
				stringBuffer.append(0);
			}
			String string = stringBuffer.toString();
			string += str1;
			str1 = string;
		}

		// 进行"9999999991"+"0000000009"两个字符串表示的数字相加
		String res = new String();
		String twoStringPlus = twoStringPlus(str1, str2, res, 0);

		char[] charArray = twoStringPlus.toCharArray();
		ListNode head = new ListNode(charArray[0] - '0');
		ListNode headTemp = head;
		for (int i = 1; i < charArray.length; i++) {
			ListNode listNode = new ListNode(charArray[i] - '0');
			headTemp.next = listNode;
			headTemp = listNode;
		}
		return head;
	}

	public static String twoStringPlus(String str1, String str2, String res, int count) {
		if (str1.length() == 0 && str2.length() == 0) {
			if(count!=0){
				res+=count;
			}
			return res;
		}
		int index = str1.length() - 1;
		int parseInt1 = Integer.parseInt(str1.substring(index));
		int parseInt2 = Integer.parseInt(str2.substring(index));
		int i = parseInt1 + parseInt2 + count;
		if (i > 10) {
			res += (i - 10);
			count = 1;
		}
		if (i == 10) {
			res += 0;
			count = 1;
		}
		if (i < 10) {
			res += i;
			count = 0;
		}
		
		return twoStringPlus(str1.substring(0,index),str2.substring(0, index),res,count);
	}
}

class ListNode {
	public int val;
	public ListNode next;

	ListNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		return "ListNode [val=" + val + "]";
	}

	
}