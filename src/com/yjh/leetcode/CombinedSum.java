package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinedSum {
	static List<List<Integer>> res = new ArrayList<List<Integer>>();

	public static void main(String[] args) {
		int[] candidates = { 2, 3, 6, 7 };
		List<List<Integer>> combinationSum = combinationSum(candidates, 7);
		for (List<Integer> list : combinationSum) {
			for (Integer integer : list) {
				System.out.print(integer);
			}
			System.out.println();
		}
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		judge2(0, candidates, target, new ArrayList<Integer>());
		return res;
	}

	public static void judge(int start, int[] candidates, int target, List<Integer> list) {
		if (target < 0) {
			return;
		}
		if (target == 0) {
			res.add(new ArrayList<>(list));
		} else {
			for (int i = start; i < candidates.length; i++) {
				list.add(candidates[i]);
				// 因为每个数字都可以使用无数次，所以递归还可以从当前元素开始
				judge(i, candidates, target - candidates[i], list);
				list.remove(list.size() - 1);
			}
		}
	}

	public static void judge2(int start, int[] candidates, int target, List<Integer> list) {
		if (target < 0) {
			return;
		}
		if (target == 0) {
			res.add(new ArrayList<>(list));
		} else {
			for (int i = start; i < candidates.length; i++) {
				list.add(candidates[i]);
				judge2(i, candidates, target - candidates[i], list);
				list.remove(list.size() - 1);
			}
		}
	}

}
