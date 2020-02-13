package com.yjh.leetcode;

import java.util.Stack;

/*���� S �� T �����ַ����������Ƿֱ����뵽�հ׵��ı��༭�����ж϶����Ƿ���ȣ������ؽ���� 
# �����˸��ַ���

ʾ�� 1��
���룺S = "ab#c", T = "ad#c"
�����true
���ͣ�S �� T ������ ��ac����
ʾ�� 2��

���룺S = "ab##", T = "c#d#"
�����true
���ͣ�S �� T ������ ������*/

public class CompareStringsWithBackspace {

	public static void main(String[] args) {
		boolean backspaceCompare = backspaceCompare("a##c", "#a#c");
		System.out.println(backspaceCompare);
	}

	public static boolean backspaceCompare(String S, String T) {

		Stack<Character> judgeS = judgeS(S);
		Stack<Character> judgeT = judgeT(T);

		System.out.println(judgeS.toString());
		System.out.println(judgeT.toString());

		if (judgeS.size() != judgeT.size()) {
			return false;
		} else {
			while (!judgeS.isEmpty() && !judgeT.isEmpty()) {
				if (judgeS.pop() != judgeT.pop()) {
					return false;
				}
			}
			return true;
		}
	}

	public static Stack<Character> judgeS(String S) {
		Stack<Character> s = new Stack<>();
		int index = 0;
		while (index <= S.length() - 1) {
			if (s.isEmpty()) {
				if (S.charAt(index) != '#') {
					s.push(S.charAt(index));
				}
				index++;
			} else {
				if (S.charAt(index) == '#') {
					s.pop();
				} else {
					s.push(S.charAt(index));
				}
				index++;
			}
		}
		return s;
	}

	public static Stack<Character> judgeT(String T) {
		Stack<Character> t = new Stack<>();
		int index = 0;
		while (index <= T.length() - 1) {
			if (t.isEmpty()) {
				if (T.charAt(index) != '#') {
					t.push(T.charAt(index));
				}
				index++;
			} else {
				if (T.charAt(index) == '#') {
					t.pop();
				} else {
					t.push(T.charAt(index));
				}
				index++;
			}
		}
		return t;
	}
}
