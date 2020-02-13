package com.yjh.leetcode;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };
		int[] intersection = intersection(nums1, nums2);
		for (int ele : intersection) {
			System.out.println(ele);
		}
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums2[j] == nums1[i] && !list.contains(nums2[j])) {
					list.add(nums1[i]);
					break;
				}
			}
		}
		int[] res = new int[list.size()];
		if (list.size() == 0) {
			return res;
		} else {
			for (int i = 0; i < list.size(); i++) {
				res[i] = list.get(i);
			}
			return res;
		}
	}
}
