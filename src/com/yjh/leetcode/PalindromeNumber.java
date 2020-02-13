package com.yjh.leetcode;

public class PalindromeNumber {

	public static void main(String[] args) {

	}

	public static boolean isPalindrome(int x) {
		
		String valueOf = String.valueOf(x);
		if(valueOf.length()==1){
			return true;
		}
		char[] charArray = valueOf.toCharArray();
		String string = new String();
		for (int i = charArray.length - 1; i >= 0; i--) {
			string+=String.valueOf(charArray[i]);
		}
		return valueOf.equals(string) ? true : false;
	}
}
