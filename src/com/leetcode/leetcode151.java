package com.leetcode;

import java.util.Stack;

/**
 * @author JHYe
 * @date 2024/7/5
 * 给你一个字符串 s ，请你反转字符串中 单词 的顺序。
 * 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
 * 返回 单词 顺序颠倒且 单词 之间用单个空格连接的结果字符串。
 * 注意：输入字符串 s中可能会存在前导空格、尾随空格或者单词间的多个空格。返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。
 * 示例 1：
 * 输入：s = "the sky is blue"
 * 输出："blue is sky the"
 * <p>
 * 示例 2：
 * 输入：s = "  hello world  "
 * 输出："world hello"
 * 解释：反转后的字符串中不能存在前导空格和尾随空格。
 * <p>
 * 示例 3：
 * 输入：s = "a good   example"
 * 输出："example good a"
 * 解释：如果两个单词间有多余的空格，反转后的字符串需要将单词间的空格减少到仅有一个。
 */
public class leetcode151 {

    public static void main(String[] args) {
        System.out.println(reverseWords0("a good   example"));

    }

    private static char c = ' ';

    // 使用快慢指针
    public static String reverseWords0(String s) {
        StringBuffer ans = new StringBuffer();
        // i慢指针 j快指针  从后往前找
        int j = 0;
        for (int i = s.length() - 1; i >= 0;) {
            j = i;
            if (s.charAt(i) != c) {
                while (j>=0 && s.charAt(j)!=c){
                    j--;
                }
                String substring = s.substring(j + 1, i + 1);
                ans.append(" ").append(substring);
            }
            i = j-1;
        }
        return ans.toString().trim();
    }


    public static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
//        String trim = s.trim();
        int index = 0;
        StringBuffer stringBuffer = new StringBuffer();
        while (index < s.length()) {

            char c = s.charAt(index);
            if (c != ' ') {
                stringBuffer.append(c);
            } else {
                if (stringBuffer.length() != 0) {
                    String s1 = " " + stringBuffer.toString();
                    stack.push(s1);
                    stringBuffer = new StringBuffer();
                }
            }
            index++;
        }
        stack.push(stringBuffer.toString());
        stringBuffer = new StringBuffer();
        while (!stack.isEmpty()) {
            stringBuffer.append(stack.pop());
        }
        return stringBuffer.toString().trim();
    }
}
