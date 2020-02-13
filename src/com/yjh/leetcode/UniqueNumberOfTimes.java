package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*���룺arr = [1,2,2,1,1,3]
�����true
���ͣ��ڸ������У�1 ������ 3 �Σ�2 ������ 2 �Σ�3 ֻ������ 1 �Ρ�û���������ĳ��ִ�����ͬ��*/

public class UniqueNumberOfTimes {

	public static void main(String[] args) {
		int[] arr = { 1, 2};
		boolean uniqueOccurrences = uniqueOccurrences(arr);
		System.out.println(uniqueOccurrences);
	}

	public static boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) == null) {
				map.put(arr[i], 1);
			} else {
				Integer count = map.get(arr[i]);
				count++;
				map.put(arr[i], count);
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			list.add(entry.getValue());
			set.add(entry.getValue());
		}
		return list.size() == set.size();
	}
}
