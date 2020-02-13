package com.yjh.leetcode;

public class RemovingElements {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 2, 2, 2 };
		int val = 2;

		int res = removeElement(nums, val);
		System.out.println("------------------");
		System.out.println(res);
	}

	public static int removeElement(int[] nums, int val) {

		// 定义两个指针 i和j
		// i指针原来判断当前索引的数字是否是目标值
		int i = 0;
		int j = 1;
		for (; i < nums.length; i++) {
			if (nums[i] == val) {
				while (j < nums.length && nums[j] == val) {
					j++;
				}
				if (j >= nums.length || nums[j] == val) {
					break;
				}
				if (j < nums.length) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					j++;
				}
			} else {
				j++;
			}

		}
		for (int ele : nums) {
			System.out.println(ele);
		}
		return i;
	}

}
