package com.yjh.leetcode;

public class ArraySplitI {

	public static void main(String[] args) {
		int[] nums = {1,4,3,2};
		int arrayPairSum = arrayPairSum(nums);
		System.out.println(arrayPairSum);
	}

	public static int arrayPairSum(int[] nums) {
		sort(nums);
		int res = 0;
		for (int i = 0; i < nums.length-1; i+=2) {
			int temp = Math.min(nums[i], nums[i+1]);
			res+=temp;
		}
		return res;
	}

	public static void sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int insertVal = arr[i];
			int insertIndex = i - 1;
			while (insertIndex>=0 && insertVal<arr[insertIndex]) {
				arr[insertIndex+1] = arr[insertIndex];
				insertIndex--;
			}
			arr[insertIndex+1] = insertVal;
		}
	}
}
