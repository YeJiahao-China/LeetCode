package com.yjh.leetcode;

import java.util.Stack;

/*给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 
# 代表退格字符。

示例 1：
输入：S = "ab#c", T = "ad#c"
输出：true
解释：S 和 T 都会变成 “ac”。
示例 2：

输入：S = "ab##", T = "c#d#"
输出：true
解释：S 和 T 都会变成 “”。*/

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
