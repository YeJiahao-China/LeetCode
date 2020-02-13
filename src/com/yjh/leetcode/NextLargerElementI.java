package com.yjh.leetcode;
/*给定两个没有重复元素的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。
找到 nums1 中每个元素在 nums2 中的下一个比其大的值。

nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出-1。
示例1：
输入: nums1 = [4,1,2], nums2 = [1,3,4,2].
输出: [-1,3,-1]
解释:
    对于num1中的数字4，你无法在第二个数组中找到下一个更大的数字，因此输出 -1。
    对于num1中的数字1，第二个数组中数字1右边的下一个较大数字是 3。
  对于num1中的数字2，第二个数组中没有下一个更大的数字，因此输出 -1。*/

public class NextLargerElementI {

	public static void main(String[] args) {
		int[] nums1 = { 2, 4 };
		int[] nums2 = { 1, 2, 3, 4 };
		int[] nextGreaterElement = nextGreaterElement(nums1, nums2);
		for (int i : nextGreaterElement) {
			System.out.println(i);
		}
	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] res = new int[nums1.length];
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				// 找到nums1中的元素在nums2中的位置
				if (nums2[j] == nums1[i]) {
					res[i] = -1;
					// 判断此时nums1中的元素在nums2中的位置是否在最右边
					// 如果在最右边说明没有比当前nums1中的元素大的 直接res[i] = -1;
					if (j == nums2.length - 1) {
						break;
					} else {
						// 如果不在nums2的最右边 则需要对j+1的位置开始遍历 找到比nums[i]大的
						for (int k = j + 1; k < nums2.length; k++) {
							if (nums2[k] > nums1[i]) {
								res[i] = nums2[k];
								break;
							}
						}
					}
				}
			}
		}
		return res;
	}
}
