package com.yjh.leetcode;

public class MobileZero {

	public static void main(String[] args) {
		int[] nums = { 0,0,1 };
		moveZeroes(nums);
		for (int i : nums) {
			System.out.println(i);
		}
	}

	public static void moveZeroes(int[] nums) {
		int correctIndex = 0;
		for (int i = 0; i < nums.length; i++) {

			// 从前往后遍历 遇到第一次不为0的数就放置在数组为0的位置
			if (nums[i] != 0 && i != correctIndex && nums[correctIndex]==0) {
				int temp = nums[i];
				nums[i] = nums[correctIndex];
				nums[correctIndex] = temp;
				correctIndex++;
			}
			if(nums[correctIndex] != 0){
				correctIndex++;
			}
		}
	}
}
