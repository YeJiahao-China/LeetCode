package com.yjh.leetcode;

public class ConvertToLowercase {

	public static void main(String[] args) {
		String lowerCase = toLowerCase("LOVE");
		System.out.println(lowerCase);
	}

	public static String toLowerCase(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))){
				char temp = (char)(str.charAt(i)+32);
				res+=temp;
			}else {
				res+=str.charAt(i);
			}
		}
		return res;
	}
}
