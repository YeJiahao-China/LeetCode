package com.yjh.leetcode;

public class SingleNumber {

	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		int maxArea = maxArea(height);
		System.out.println(maxArea);
	}

	public static int maxArea(int[] height) {
		int res = 0;
		for (int i = 0; i < height.length - 1; i++) {
			for (int j = i + 1; j < height.length; j++) {
				int high = height[i] > height[j] ? height[j] : height[i];
				if (high * (j - i) > res) {
					res = high * (j - i);
				}
			}
		}
		return res;
	}
}
