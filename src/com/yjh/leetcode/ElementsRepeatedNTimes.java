package com.yjh.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
	返回重复了 N 次的那个元素。
 */
public class ElementsRepeatedNTimes {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 3 };
		int repeatedNTimes = repeatedNTimes(A);
		System.out.println(repeatedNTimes);
	}

	public static int repeatedNTimes(int[] A) {
		int result = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			if (map.get(A[i]) == null) {
				map.put(A[i], 1);
			} else {
				Integer count = map.get(A[i]);
				count++;
				map.put(A[i], count);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == A.length / 2) {
				result = entry.getKey();
			}
		}
		return result;
	}
}
