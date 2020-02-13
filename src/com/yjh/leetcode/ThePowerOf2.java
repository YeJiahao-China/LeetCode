package com.yjh.leetcode;

public class ThePowerOf2 {

	public static void main(String[] args) {

		boolean powerOfTwo = isPowerOfTwo(33554432);
		System.out.println(powerOfTwo);

	}

	public static boolean isPowerOfTwo(int n) {
		String nStr = String.valueOf(n);
		boolean res = judge(nStr);
		return res;
	}

	public static boolean judge(String nStr) {
		if (nStr.length() == 1 && nStr.equals("1")) {
			return true;
		}
		char charAt = nStr.charAt(nStr.length()-1);
		if(charAt == '0' || charAt=='2' ||charAt=='4' ||charAt=='6' ||charAt=='8'){
			int parseInt = Integer.parseInt(nStr);
			return judge(String.valueOf(parseInt/2));
		}else {
			return false;
		}
	}
}
