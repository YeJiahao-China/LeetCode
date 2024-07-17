package com.leetcode;

import java.util.Arrays;

/**
 * @author JHYe
 * @date 2024/7/4
 * <p>
 * <p>
 * 给定字符串 s 和字符串数组 words, 返回  words[i] 中是s的子序列的单词个数 。
 * 字符串的 子序列 是从原始字符串中生成的新字符串，可以从中删去一些字符(可以是none)，而不改变其余字符的相对顺序。
 * <p>
 * 例如， “ace” 是 “abcde” 的子序列。
 * 示例 1:
 * 输入: s = "abcde", words = ["a","bb","acd","ace"]
 * 输出: 3
 * 解释: 有三个是 s 的子序列的单词: "a", "acd", "ace"。
 * <p>
 * 输入: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
 * 输出: 2
 */
public class leetcode792 {

    public static void main(String[] args) {
        System.out.println(numMatchingSubseq("abcde", new String[]{"a","bb","acd","ace"}));
    }

    public static int numMatchingSubseq(String s, String[] words) {
        int ret = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean b = doNumMatchingSubseq(s, word);
            if (b) ret++;
        }
        return ret;
    }

    public static boolean doNumMatchingSubseq(String s, String word) {
        // "abcde"  "bb"
        for (int i = 0, j = 0; j < s.length(); j++) {
            if (word.charAt(i) == s.charAt(j)) {
                if (++i == word.length()) {
                    // 判断结束了
                    return true;
                }
            }
        }
        return false;
    }

}
