package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SelfDivisor {

	public static void main(String[] args) {
		List<Integer> selfDividingNumbers = selfDividingNumbers(1, 22);
		for (Integer integer : selfDividingNumbers) {
			System.out.println(integer);
		}
	}

	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		for (int i = left; i <= right; i++) {
			String valueOf = String.valueOf(i);
			for (int j = 0; j <= valueOf.length(); j++) {
				if (j == valueOf.length()) {
					list.add(i);
					break;
				}
				if (valueOf.charAt(j) == '0') {
					break;
				} else {
					if (i % (valueOf.charAt(j) - '0') != 0) {
						break;
					} else {
						continue;
					}
				}
			}
		}
		return list;
	}
}
