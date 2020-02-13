package com.yjh.leetcode;

public class MembersAdd {

	public static void main(String[] args) {
		int addDigits = addDigits(38);
		System.out.println(addDigits);
	}

	public static int addDigits(int num) {
		return (num - 1) % 9 + 1;
	}
}
