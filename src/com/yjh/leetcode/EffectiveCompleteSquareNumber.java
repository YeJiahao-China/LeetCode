package com.yjh.leetcode;

public class EffectiveCompleteSquareNumber {

	public static void main(String[] args) {
		// 2147483647
		int num = 2147483647;
		boolean perfectSquare = isPerfectSquare(num);
		System.out.println(perfectSquare);
	}

	public static boolean isPerfectSquare(int num) {
		if(num<0){
			return false;
		}
		return judge(num/2, num);
	}

	public static boolean judge(int start, int num) {
		if (start * start == 0) {
			return false;
		} else if (start * start == num) {
			return true;
		} else {
			return judge(--start, num);
		}
	}
}
