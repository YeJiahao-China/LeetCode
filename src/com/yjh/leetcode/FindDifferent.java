package com.yjh.leetcode;

public class FindDifferent {

	public static void main(String[] args) {
		String s = "a";
		String t = "aa";
		char findTheDifference = findTheDifference(s, t);
		System.out.println(findTheDifference);
	}

	public static char findTheDifference(String s, String t) {
		for (Character c : s.toCharArray()) {
			t = t.replaceFirst(c.toString(), "");
		}
		return t.toCharArray()[0];

	}
}
