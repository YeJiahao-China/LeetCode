package com.yjh.leetcode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = { "abca", "abc" };
		String longestCommonPrefix = longestCommonPrefix(strs);
		System.out.println(longestCommonPrefix);
	}

	public static String longestCommonPrefix(String[] strs) {
		String reString = new String();
		if (strs.length <= 0 || strs == null) {
			return reString;
		}
		int minLen = strs[0].length();
		for (String string : strs) {
			if (minLen > string.length()) {
				minLen = string.length();
			}
		}
		for (int i = 0; i < minLen; i++) {
			int j = 0;
			for (; j < strs.length - 1; j++) {
				if (strs[j].charAt(i) == strs[j + 1].charAt(i)) {
					continue;
				} else {
					return reString;
				}
			}
			reString += strs[j].charAt(i);
		}
		return reString;
	}
}
