package com.yjh.leetcode;

public class MaximumNumberOf6And9 {

	public static void main(String[] args) {

		int maximum69Number = maximum69Number(9669);
		System.out.println(maximum69Number);

	}

	public static int maximum69Number(int num) {
		char[] numArr = String.valueOf(num).toCharArray();
		for (int i = 0; i < numArr.length; i++) {

			if (numArr[i] == '6') {
				numArr[i] = '9';
				break;
			} else {
				continue;
			}
		}
		String res = "";
		for (int i = 0; i < numArr.length; i++) {
			res += numArr[i];
		}
		return Integer.parseInt(res);
	}
}
