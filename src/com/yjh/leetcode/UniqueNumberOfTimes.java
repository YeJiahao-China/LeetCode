package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*输入：arr = [1,2,2,1,1,3]
输出：true
解释：在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1 次。没有两个数的出现次数相同。*/

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
