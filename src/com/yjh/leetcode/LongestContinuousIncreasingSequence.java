package com.yjh.leetcode;
/*����: [1,3,5,4,7]
���: 3
����: ��������������� [1,3,5], ����Ϊ3��
���� [1,3,5,7] Ҳ�������������, �������������ģ���Ϊ5��7��ԭ�����ﱻ4������*/
public class LongestContinuousIncreasingSequence {

	public static void main(String[] args) {
		int[] nums = { 2, 1 };
		int findLengthOfLCIS = findLengthOfLCIS(nums);
		System.out.println(findLengthOfLCIS);
	}

	public static int findLengthOfLCIS(int[] nums) {
		if (nums.length <= 1)
			return nums.length;
		int ans = 1;
		int count = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i + 1] > nums[i]) {
				count++;
			} else {
				count = 1;
			}
			ans = count > ans ? count : ans;
		}
		return ans;
	}
}
