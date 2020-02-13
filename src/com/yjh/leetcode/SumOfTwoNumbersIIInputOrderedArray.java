package com.yjh.leetcode;

public class SumOfTwoNumbersIIInputOrderedArray {

	public static void main(String[] args) {
		int[] nums = { -1, 0 };
		int[] twoSum = twoSum(nums, -1);
		for (int i : twoSum) {
			System.out.println(i);
		}
	}

	public static int[] twoSum(int[] numbers, int target) {
		int[] res = new int[2];
		if (numbers.length <= 1) {
			return res;
		}
		int index = numbers.length - 1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > target && numbers[i]!=0) {
				index = i;
				break;
			}
		}
		for (int i = 0; i <= index - 1; i++) {
			for (int j = i + 1; j < index + 1; j++) {
				if (numbers[i] + numbers[j] == target) {
					res[0] = i + 1;
					res[1] = j + 1;
					break;
				}
			}
		}
		return res;
	}
}
