package com.yjh.leetcode;

public class ReverseWordIIIInString {

	public static void main(String[] args) {
		String reverseWords = reverseWords("Let's take LeetCode contest");
		System.out.println(reverseWords);
	}

	public static String reverseWords(String s) {
//		String[] split = s.split(" ");
//		String res = "";
//		for (int i = 0; i < split.length; i++) {
//
//			String word = split[i];
//			for (int j = word.length() - 1; j >= 0; j--) {
//				res+=word.charAt(j);
//			}
//			if(i!=split.length-1){
//				res+=" ";
//			}
//		}
//		return res;
		
		// leetcode½â·¨
		String words[] = s.split(" ");
        StringBuilder res=new StringBuilder();
        for (String word: words)
            res.append(new StringBuffer(word).reverse().toString() + " ");
        return res.toString().trim();

	}
}
