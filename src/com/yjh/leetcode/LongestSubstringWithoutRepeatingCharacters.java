package com.yjh.leetcode;

import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		int lengthOfLongestSubstring = lengthOfLongestSubstring("au");
		System.out.println(lengthOfLongestSubstring);
	}

	public static int lengthOfLongestSubstring(String s) {
		if(s.length()<=1){
			return s.length();
		}
		ArrayList<Character> list = new ArrayList<Character>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			int index = i + 1;
			list.clear();
			list.add(s.charAt(i));
			while (index < s.length()) {
				if (!list.contains(s.charAt(index))) {
					list.add(s.charAt(index));
					index++;
				} else {
					arrayList.add(list.size());
					break;
				}
			}
			arrayList.add(list.size());
		}
		int res = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) >= res) {
				res = arrayList.get(i);
			}
		}
		return res;
	}
}
