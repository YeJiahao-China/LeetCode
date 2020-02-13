package com.yjh.leetcode;

public class AddOne {

	public static void main(String[] args) {
		int[] digits = { 1, 2, 9 };
		int[] plusOne = plusOne(digits);
		for (int ele : plusOne) {
			System.out.println(ele);
		}
	}

	public static int[] plusOne(int[] digits) {

		String str = new String();
		for (int i = 0; i < digits.length; i++) {
			str += digits[i];
		}
		String reString = new String();
		String twoStringPlus = twoStringPlus(str, reString, 1);
		char[] charArray = twoStringPlus.toCharArray();
		int[] res = new int[charArray.length];
		int index = 0;
		for (int i = charArray.length - 1; i >= 0; i--) {
			res[index] = Integer.parseInt(String.valueOf(charArray[i]));
			index++;
		}
		return res;
	}

	public static String twoStringPlus(String str1, String res, int count) {
		if (str1.length() == 0) {
			if (count != 0) {
				res += count;
			}
			return res;
		}
		int index = str1.length() - 1;
		int parseInt1 = Integer.parseInt(str1.substring(index));
		int i = parseInt1 + count;
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

		return twoStringPlus(str1.substring(0, index), res, count);
	}
}
