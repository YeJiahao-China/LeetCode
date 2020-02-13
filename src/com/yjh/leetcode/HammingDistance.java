package com.yjh.leetcode;

public class HammingDistance {
	static String strX;
	static String strY;

	public static void main(String[] args) {
		int hammingDistance = hammingDistance(1, 4);
		System.out.println(hammingDistance);
	}

	public static int hammingDistance(int x, int y) {
		int res = 0;
		String binaryStringX = Integer.toBinaryString(x);
		String binaryStringY = Integer.toBinaryString(y);
		judge(binaryStringX, binaryStringY);
		for (int i = 0; i < strX.length(); i++) {
			if (strX.charAt(i) != strY.charAt(i)) {
				res++;
			}
		}
		return res;
	}

	public static void judge(String binaryStringX, String binaryStringY) {
		if (binaryStringX.length() > binaryStringY.length()) {
			String temp = "";
			for (int i = 0; i < binaryStringX.length() - binaryStringY.length(); i++) {
				temp += "0";
			}
			temp += binaryStringY;
			strX = binaryStringX;
			strY = temp;
		} else if (binaryStringX.length() < binaryStringY.length()) {
			String temp = "";
			for (int i = 0; i < binaryStringY.length() - binaryStringX.length(); i++) {
				temp += "0";
			}
			temp += binaryStringX;
			strX = temp;
			strY = binaryStringY;
		} else {
			strX = binaryStringX;
			strY = binaryStringY;
		}
	}
}
