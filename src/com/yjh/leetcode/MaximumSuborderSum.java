package com.yjh.leetcode;

public class MaximumSuborderSum {

	public static void main(String[] args) {

	}

	public static int maxSubArray(int[] nums) {
		
		//¶¯Ì¬¹æ»®
		int len = nums.length;
		int[] res = new int[len];
		int max = nums[0];
		res[0] = nums[0];
		for (int i = 1; i < len; i++) {
			int temp = res[i-1]+nums[i];
			if(temp>nums[i]){
				res[i] = temp;
			}else {
				res[i] = nums[i];
			}
			if(res[i]>max){
				max = res[i];
			}
		}
		return max;
	}
}
