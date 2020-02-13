package com.yjh.leetcode;


public class MaximumNumberOfConsecutive1 {

	public static void main(String[] args) {
//		int[] nums = {1,1,0,1,1,1};
		
		int[] nums = {0,0,0};
		int findMaxConsecutiveOnes = findMaxConsecutiveOnes(nums);
		System.out.println(findMaxConsecutiveOnes);

	}
	public static int findMaxConsecutiveOnes(int[] nums) {
		
		String str = "";
		for (int i = 0; i < nums.length; i++) {
			str+=nums[i];
		}
		
		String[] split = str.split("0");
		int res = 0;
		for (int i = 0; i < split.length; i++) {
			if(split[i].length() > res){
				res = split[i].length();
			}
		}
		
		return res;
	}
}
