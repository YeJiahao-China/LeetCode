package com.yjh.leetcode;

/*给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。
如果剩余少于 k 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。

示例:

输入: s = "abcdefg", k = 2
输出: "bacdfeg"
*/
public class ReverseStringII {

	static String res = "";

	public static void main(String[] args) {
		String reverseStr = reverseStr("abcdefg", 2);
		System.out.println(reverseStr);
	}

	public static String reverseStr(String s, int k) {
		judge(s, k);
		return res;
	}

	public static void judge(String s, int k) {
		int length = s.length();
		if(length<=0){
			return;
		}
		if (length < k) {
			for (int i = s.length()-1; i >=0; i--) {
				res+=s.charAt(i);
			}
			return;
		}
		if(length<2*k && length>=k){
			char[] charArray = s.toCharArray();
			for (int i = 0; i < k/2; i++) {
				char temp = charArray[i];
				charArray[i] = charArray[k-i-1];
				charArray[k-i-1] = temp;
			}
			for (int i = 0; i < charArray.length; i++) {
				res+=charArray[i];
			}
			return;
		}
		char[] charArray = s.toCharArray();
		for (int i = 0; i < k/2; i++) {
			char temp = charArray[i];
			charArray[i] = charArray[k-i-1];
			charArray[k-i-1] = temp;
		}
		for (int i = 0; i < 2*k; i++) {
			res+=charArray[i];
		}
		judge(s.substring(2*k), k);
	}
}
