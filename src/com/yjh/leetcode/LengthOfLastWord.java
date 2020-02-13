package com.yjh.leetcode;

public class LengthOfLastWord {

	public static void main(String[] args) {
		lengthOfLastWord("Hello World");
	}

	public static int lengthOfLastWord(String s) {
		String[] split = s.split(" ");
		int length = split.length;
		if(length==0){
			return 0;
		}else {
			return split[length-1].length();
		}
	}
}
