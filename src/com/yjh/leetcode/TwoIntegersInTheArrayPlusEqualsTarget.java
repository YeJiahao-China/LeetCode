package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

//你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
public class TwoIntegersInTheArrayPlusEqualsTarget {

	public static void main(String[] args) {
		int[] nums = { 0, 4, 3, 0 };
		int target = 0;
		int[] twoSum = twoSum(nums, target);
		for (int i : twoSum) {
			System.out.println(i);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}
		int index = 1;
		for (int i = 0; i < list.size(); i++) {
			index = i + 1;
			while (index < list.size()) {
				if (list.get(i) + list.get(index) == target) {
					set.add(i);
					set.add(index);
					index++;
				} else {
					index++;
				}
			}
		}
		Iterator<Integer> iterator = set.iterator();
		int[] res = new int[set.size()];
		int i = 0;
		while (iterator.hasNext()) {
			res[i] = iterator.next();
			i++;
		}
		return res;
	}
}
