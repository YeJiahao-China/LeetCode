package com.yjh.leetcode;

import java.util.ArrayList;

/*给定一个包括 n 个整数的数组 nums 和 一个目标值 target。
找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。

例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.

与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).*/
public class TheSumOfTheThreeClosestNumbers {

	public static void main(String[] args) {
		int[] nums = { 1, 1, -1, -1, 3 };
		int threeSumClosest = threeSumClosest(nums, 3);
		System.out.println(threeSumClosest);
	}

	public static int threeSumClosest(int[] nums, int target) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		// 穷举法
		for (int i = 0; i <= nums.length - 3; i++) {
			int end = i + 3;
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			for (int j = i; j < end; j++) {
				arrayList.add(nums[j]);
			}
			list.add(arrayList);
		}
		ArrayList<Integer> res = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (int j = 0; j < list.get(i).size(); j++) {
				count += list.get(i).get(j);
			}
			res.add(count);
		}
		int index = res.size() - 1;
		int difference = Math.abs(res.get(index) - target);
		for (int i = res.size() - 1; i >= 0; i--) {
			if (difference >= Math.abs(res.get(i) - target)) {
				difference = Math.abs(res.get(i) - target);
				index = i;
			}
		}
		return res.get(index);
	}
}
