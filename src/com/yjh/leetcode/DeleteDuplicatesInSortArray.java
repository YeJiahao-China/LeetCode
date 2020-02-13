package com.yjh.leetcode;


/*�������� nums = [1,1,2], 

����Ӧ�÷����µĳ��� 2, ����ԭ���� nums ��ǰ����Ԫ�ر��޸�Ϊ 1, 2�� 

�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�*/
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
