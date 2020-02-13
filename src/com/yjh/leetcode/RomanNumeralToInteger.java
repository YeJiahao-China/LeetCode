package com.yjh.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralToInteger {

	static HashMap<Character, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		int i = romanToInt("MCMXCIV");
		System.out.println(i);
	}

	public static int romanToInt(String s) {
		int res = 0;
		char[] charArray = s.toCharArray();
		/*
		 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。 
		 * X 可以放在 L (50) 和 C (100) 的左边，来表示40 和 90。
		 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
		 */
		for (int i = charArray.length - 1; i >= 0; i--) {
			if (i >= 1 && charArray[i] == 'V' && charArray[i - 1] == 'I') {
				res += 4;
				i--;
				continue;
			}
			if (i >= 1 && charArray[i] == 'X' && charArray[i - 1] == 'I') {
				res += 9;
				i--;
				continue;
			}
			if (i >= 1 && charArray[i] == 'L' && charArray[i - 1] == 'X') {
				res += 40;
				i--;
				continue;
			}
			if (i >= 1 && charArray[i] == 'C' && charArray[i - 1] == 'X') {
				res += 90;
				i--;
				continue;
			}
			if (i >= 1 && charArray[i] == 'D' && charArray[i - 1] == 'C') {
				res += 400;
				i--;
				continue;
			}
			if (i >= 1 && charArray[i] == 'M' && charArray[i - 1] == 'C') {
				res += 900;
				i--;
				continue;
			}

			int mappingRelation = mappingRelation(charArray[i]);
			res += mappingRelation;
		}
		return res;
	}

	public static int mappingRelation(char c) {

		/*
		 * I 1 V 5 X 10 L 50 C 100 D 500 M 1000
		 */
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getKey() == c) {
				return entry.getValue();
			}
		}
		return 0;
	}
}
