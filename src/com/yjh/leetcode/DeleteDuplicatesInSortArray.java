package com.yjh.leetcode;


/*给定数组 nums = [1,1,2], 

函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。 

你不需要考虑数组中超出新长度后面的元素。*/
public class DeleteDuplicatesInSortArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,3,3,4,4,5,5,5};
		removeDuplicates(nums);
	}

	public static int removeDuplicates(int[] nums) {

		if(nums.length==0 || nums.length==1){
			return nums.length;
		}
		int i = 0;
		for (int j = 1; j < nums.length; j++) {

			if(nums[i]!=nums[j]){
				i++;
				nums[i] = nums[j];
			}
		}
		return i+1;
	}
}
