package com.yjh.leetcode;

/*��дһ���������������ǽ�������ַ�����ת�����������ַ������ַ����� char[] ����ʽ������

��Ҫ�����������������Ŀռ䣬�����ԭ���޸��������顢ʹ�� O(1) �Ķ���ռ�����һ���⡣

����Լ��������е������ַ����� ASCII ����еĿɴ�ӡ�ַ���*/

public class ReverseString {

	public static void main(String[] args) {

	}

	public static void reverseString(char[] s) {
		if(s.length==1 || s.length==0){
			return ;
		}
		int mid = s.length / 2;
		for (int i = 0; i < mid; i++) {
			int j = s.length-1-i;
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
	}	
}
