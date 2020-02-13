package com.yjh.leetcode;

import java.util.ArrayList;

//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

/*示例 1:

输入: 123
输出: 321
 示例 2:

输入: -123
输出: -321
示例 3:

输入: 120
输出: 21*/

public class IntReverse {

	public static void main(String[] args) {
		//Line 21: java.lang.NumberFormatException: For input string: "9646324351"
		int reverse = reverse(1534236469);
		System.out.println(reverse);
	}

	public static int reverse(int x) {
		String valueOf = String.valueOf(x);
		char[] charArray = valueOf.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();
		// flag代表该数字是正整数还是负整数
		boolean flag = false;
		int end = 0;
		if (charArray[0] == '-') {
			flag = true;
			end = 1;
		}
		for (int i = charArray.length - 1; i >= end; i--) {
			list.add(charArray[i]);
		}
		String resStr = new String();
		int j = 0;
		for (; j < list.size(); j++) {
			resStr += String.valueOf(list.get(j));
		}
		double parseInt = Double.parseDouble(resStr);
		double temp = flag == true ? -parseInt : parseInt;
		int res = 0;
		int max=(1<<31)-2;
		int min=-0x7fffffff;
		if(temp<=max && temp>=min){
			res = (int)temp;
			return res;
		}else {
			return 0;
		}
	}
}
