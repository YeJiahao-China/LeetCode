package com.yjh.leetcode;

import java.util.HashSet;

public class ThereAreDuplicateElements {

	public static void main(String[] args) {
		
	}

	public static boolean containsDuplicate(int[] nums) {
		if(nums.length==0 || nums.length==1){
			return false;
		}
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		return set.size()==nums.length ? false : true;
	}
}
