package com.yjh.leetcode;

/*����һ���ַ�����һ������ k������Ҫ�Դ��ַ�����ͷ�����ÿ�� 2k ���ַ���ǰk���ַ����з�ת��
���ʣ������ k ���ַ�����ʣ�������ȫ����ת�������С�� 2k �����ڻ���� k ���ַ�����תǰ k ���ַ�������ʣ����ַ�����ԭ����

ʾ��:

����: s = "abcdefg", k = 2
���: "bacdfeg"
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
