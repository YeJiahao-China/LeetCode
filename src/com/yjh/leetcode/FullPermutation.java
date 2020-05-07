package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FullPermutation {

	static ArrayList<List<Integer>> res = new ArrayList<>();

	public static void main(String[] args) {
		int[] nums = { 1, 2,3,4};
		List<List<Integer>> permute = permute(nums);
		for (List<Integer> list : permute) {
			for (Integer integer : list) {
				System.out.print(integer);
			}
			System.out.println();
		}
	}

	public static List<List<Integer>> permute(int[] nums) {
		ArrayList<Integer> list = new ArrayList<>();
		int len = nums.length;
		boolean[] arr = new boolean[len];
		judge(len, 0, list, arr, nums);
		return res;
	}

	public static void judge(int len, int depth, ArrayList<Integer> list, boolean[] arr, int[] nums) {
		if (depth == len) {
			res.add(new ArrayList<>(list));
			return;
		}
		for (int i = 0; i < len; i++) {
			if (!arr[i]) {
				list.add(nums[i]);
				arr[i] = true;
				judge(len, depth + 1, list, arr, nums);
				arr[i] = false;
				list.remove(list.size()-1);
			}
		}
	}
}
