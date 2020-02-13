package com.yjh.leetcode;

public class HappinessNumber {

	public static void main(String[] args) {
		boolean happy = isHappy(16);
		System.out.println(happy);
	}

	public static boolean isHappy(int n) {
		if (n == 1)
			return true;
		if ((n == 4) || (n == 16) || (n == 37) || (n == 58) || (n == 89) || (n == 145) || (n == 42) || (n == 20))
			return false;
		int sum = 0;
		do {
			int remainder = n % 10;
			sum += remainder * remainder;
			n = n / 10;
		} while (n > 0);
		return isHappy(sum);

	}
}