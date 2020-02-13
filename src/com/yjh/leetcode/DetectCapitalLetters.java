package com.yjh.leetcode;

public class DetectCapitalLetters {

	public static void main(String[] args) {

	}

	public static boolean detectCapitalUse(String word) {

		boolean ans = true;
		char firstChar = word.charAt(0);
		if ((firstChar >= 'A') && (firstChar <= 'Z')) {
			if (word.length() >= 2) {
				char secondChar = word.charAt(1);
				if ((secondChar >= 'A') && (secondChar <= 'Z')) {
					for (int i = 2; i < word.length(); i++) {
						char currChar = word.charAt(i);
						if (!((currChar >= 'A') && (currChar <= 'Z'))) {
							ans = false;
							break;
						}
						;
					}
					;
				} else {
					for (int i = 2; i < word.length(); i++) {
						char currChar = word.charAt(i);
						if ((currChar >= 'A') && (currChar <= 'Z')) {
							ans = false;
							break;
						}
						;
					}
					;
				}
			}
			;
		} else {
			for (int i = 1; i < word.length(); i++) {
				char currChar = word.charAt(i);
				if ((currChar >= 'A') && (currChar <= 'Z')) {
					ans = false;
					break;
				}
				;
			}
			;
		}
		;
		return ans;

	}
}
