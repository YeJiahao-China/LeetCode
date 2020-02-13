package com.yjh.leetcode;

import java.util.HashMap;

/*给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符：

字符（'a' - 'i'）分别用（'1' - '9'）表示。
字符（'j' - 'z'）分别用（'10#' - '26#'）表示。 
返回映射之后形成的新字符串。

题目数据保证映射始终唯一。
示例 1：

输入：s = "10#11#12"
输出："jkab"
解释："j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".*/
public class DecodeLetterToIntegerMapping {

	public static void main(String[] args) {
		String freqAlphabets = freqAlphabets("25#");
		System.out.println(freqAlphabets);
	}

	public static String freqAlphabets(String s) {
		String res = "";
		HashMap<String, Character> map = new HashMap<String, Character>();
		int benchmark = 97;
		for (int i = 1; i <= 9; i++) {
			map.put(String.valueOf(i), (char) benchmark);
			benchmark++;
		}
		for (int i = 10; i <= 26; i++) {
			map.put("" + i + "#", (char) benchmark);
			benchmark++;
		}

		for (int i = 0; i < s.length();) {
			if (i + 2 < s.length()) {
				if (s.charAt(i + 2) == '#') {
					res += map.get(s.substring(i, i + 3));
					i += 3;
				} else {
					res += map.get(String.valueOf(s.charAt(i)));
					i++;
				}
			} else {
				res += map.get(String.valueOf(s.charAt(i)));
				i++;
			}
		}
		return res;
	}
}
