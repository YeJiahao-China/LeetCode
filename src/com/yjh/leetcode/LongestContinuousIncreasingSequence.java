package com.yjh.leetcode;
/*输入: [1,3,5,4,7]
输出: 3
解释: 最长连续递增序列是 [1,3,5], 长度为3。
尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为5和7在原数组里被4隔开。*/
public class LongestContinuousIncreasingSequence {

	public static void main(String[] args) {
		int[] nums = { 2, 1 };
		int findLengthOfLCIS = findLengthOfLCIS(nums);
		System.out.println(findLengthOfLCIS);
	}

	public static int findLengthOfLCIS(int[] nums) {
		if (nums.length <= 1)
			return nums.length;
		int ans = 1;
		int count = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i + 1] > nums[i]) {
				count++;
			} else {
				count = 1;
			}
			ans = count > ans ? count : ans;
		}
		return ans;
	}
}
