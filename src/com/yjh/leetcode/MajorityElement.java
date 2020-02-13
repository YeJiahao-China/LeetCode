package com.yjh.leetcode;

import java.util.HashMap;
import java.util.Map;

//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		int majorityElement = majorityElement(nums);
		System.out.println(majorityElement);
	}

	public static int majorityElement(int[] nums) {

		int len = nums.length/2;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == null) {
				map.put(nums[i], 1);
			} else {
				Integer count = map.get(nums[i]);
				count++;
				map.put(nums[i], count);
			}
		}
		int res = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > len) {
				res = entry.getKey();
				break;
			}
		}
		return res;
	}

}
