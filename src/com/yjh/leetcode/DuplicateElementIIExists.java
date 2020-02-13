package com.yjh.leetcode;

/*给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，
使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。

示例 1:

输入: nums = [1,2,3,1], k = 3
输出: true*/
public class DuplicateElementIIExists {

	public static void main(String[] args) {
		int[] nums = { 99, 99 };
		boolean containsNearbyDuplicate = containsNearbyDuplicate(nums, 2);
		System.out.println(containsNearbyDuplicate);
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		boolean res = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j] && Math.abs(i - j) <= k && Math.abs(i - j) >= 0 && i != j) {
					res = true;
				}
			}
		}
		return res;
	}
}
