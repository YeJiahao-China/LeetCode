package com.yjh.leetcode;

public class NumberOfBits1 {

	public static void main(String[] args) {
		int hammingWeight = hammingWeight(100);
		System.out.println(hammingWeight);
	}

	public static int hammingWeight(int n) {
		String binaryString = Integer.toBinaryString(n);
		int res = 0;
		char[] charArray = binaryString.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='1'){
				res++;
			}
		}
		return res;
	}
}
