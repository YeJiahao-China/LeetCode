package com.yjh.leetcode;

public class SearchInsertLocation {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		int searchInsert = searchInsert(nums, 0);
		System.out.println(searchInsert);
	}

	public static int searchInsert(int[] nums, int target) {

		int res = -1;
		int index = 0;
		// �����������target������ֻ�û���ҵ�target˵��target������
		while (index < nums.length) {
			if (nums[index] >= target) {
				res = index;
				break;
			}
			index++;
		}
		if(index==nums.length){
			res = index;
		}
		return res;
	}

}
