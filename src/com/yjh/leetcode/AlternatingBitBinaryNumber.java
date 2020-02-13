package com.yjh.leetcode;

public class AlternatingBitBinaryNumber {

	public static void main(String[] args) {
		boolean hasAlternatingBits = hasAlternatingBits(7);
		System.out.println(hasAlternatingBits);
	}

	public static boolean hasAlternatingBits(int n) {
		boolean res = true;
		String binaryString = Integer.toBinaryString(n);
		for (int i = 0; i < binaryString.length()-1; i++) {
			if(binaryString.charAt(i) == binaryString.charAt(i+1)){
				res = false;
				break;
			}
		}
		return res;
	}
}
