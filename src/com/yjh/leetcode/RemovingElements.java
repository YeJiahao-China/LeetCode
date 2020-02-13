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

		// ��������ָ�� i��j
		// iָ��ԭ���жϵ�ǰ�����������Ƿ���Ŀ��ֵ
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
