package com.leetcode;

import java.util.Stack;

/**
 * @author JHYe
 * @date 2024/7/12
 * 示例 1：
 * <p>
 * 输入：s = "ab#c", t = "ad#c"
 * 输出：true
 * 解释：s 和 t 都会变成 "ac"。
 * 示例 2：
 * <p>
 * 输入：s = "ab##", t = "c#d#"
 * 输出：true
 * 解释：s 和 t 都会变成 ""。
 * 示例 3：
 * <p>
 * 输入：s = "a#c", t = "b"
 * 输出：false
 * 解释：s 会变成 "c"，但 t 仍然是 "b"。
 */
public class leetcode844 {

    public static void main(String[] args) {
        System.out.println(backspaceCompare2("a##c", "#a#c"));
    }


    public static boolean backspaceCompare2(String s, String t) {

        Character[] sArr = new Character[s.length()];
        Character[] tArr = new Character[t.length()];
        int sIndex = 0, tIndex = 0;
        int length = s.length() >= t.length() ? s.length() : t.length();

        for (int i = 0; i < length; i++) {

            if (i < s.length()) {
                if (s.charAt(i) == '#') {
                    sIndex = sIndex == 0 ? 0 : sIndex - 1;
                    sArr[sIndex] = null;
                } else {
                    sArr[sIndex++] = s.charAt(i);
                }
            }
            if (i < t.length()) {
                if (t.charAt(i) == '#') {
                    tIndex = tIndex == 0 ? 0 : tIndex - 1;
                    tArr[tIndex] = null;
                } else {
                    tArr[tIndex++] = t.charAt(i);
                }
            }

        }
        if (sIndex != tIndex) {
            return false;
        }
        for (int i = 0; i < sIndex; i++) {
            if (!sArr[i].equals(tArr[i])) {
                return false;
            }
        }
        return true;
    }


    public static boolean backspaceCompare1(String s, String t) {

        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();

        int length = s.length() >= t.length() ? s.length() : t.length();

        for (int i = 0; i < length; i++) {

            if (i < s.length()) {
                if (s.charAt(i) == '#') {
                    if (!stackS.isEmpty()) {
                        stackS.pop();
                    }
                } else {
                    stackS.push(s.charAt(i));
                }
            }
            if (i < t.length()) {
                if (t.charAt(i) == '#') {
                    if (!stackT.isEmpty()) {
                        stackT.pop();
                    }
                } else {
                    stackT.push(t.charAt(i));
                }
            }

        }
        if (stackS.size() != stackT.size()) return false;
        else {
            while (!stackS.isEmpty()) {
                Character popS = stackS.pop();
                Character popT = stackT.pop();
                if (popS.charValue() != popT.charValue())
                    return false;

            }
        }
        return true;
    }

    public static boolean backspaceCompare0(String s, String t) {

        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        //处理s
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!stackS.isEmpty()) {
                    stackS.pop();
                }
            } else {
                stackS.push(s.charAt(i));
            }
        }
        //处理t
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!stackT.isEmpty()) {
                    stackT.pop();
                }
            } else {
                stackT.push(t.charAt(i));
            }
        }
        if (stackS.size() != stackT.size()) return false;
        else {
            while (!stackS.isEmpty()) {
                Character popS = stackS.pop();
                Character popT = stackT.pop();
                if (popS.charValue() != popT.charValue())
                    return false;

            }
        }
        return true;
    }

}
