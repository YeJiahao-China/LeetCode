package com.yjh.leetcode;

public class RegionAndRetrievalImmutableArray {

	int[] nums;

	public static void main(String[] args) {

	}

	public RegionAndRetrievalImmutableArray(int[] nums) {
		super();
		this.nums = nums;
	}

	public int sumRange(int i, int j) {
		int res = 0;
		for (int k = i; k <= j; k++) {
			res+=nums[k];
		}
		return res;
	}
}
