package com.yjh.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * �ڴ�СΪ 2N ������ A ���� N+1 ����ͬ��Ԫ�أ�������һ��Ԫ���ظ��� N �Ρ�
	�����ظ��� N �ε��Ǹ�Ԫ�ء�
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
