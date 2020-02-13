package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.Stack;

/*给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。*/

public class ValidBrackets {

	public static void main(String[] args) {
		boolean valid = isValid("[({(())}[()])]");
		System.out.println(valid);
	}

	public static boolean isValid(String s) {

		ArrayList<Integer> arrayList = new ArrayList<>();
        for (Character c : s.toCharArray()) {
            arrayList.add(convertParentheseToInt(c));
        }

        Stack<Integer> stack = new Stack<>();

        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (i - stack.pop() != 1) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

   static int convertParentheseToInt(Character c) {
        switch (String.valueOf(c)) {
            case "(":
                return 0;
            case ")":
                return 1;
            case "[":
                return 4;
            case "]":
                return 5;
            case "{":
                return 8;
            case "}":
                return 9;
            default:
        }
        return -1;
    }
}
