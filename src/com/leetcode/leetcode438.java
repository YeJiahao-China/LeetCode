package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author JHYe
 * @date 2024/7/22
 * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
 * 异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。
 * <p>
 * 示例 1:
 * 输入: s = "cbaebabacd", p = "abc"
 * 输出: [0,6]
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
 * <p>
 * 示例 2:
 * 输入: s = "abab", p = "ab"
 * 输出: [0,1,2]
 * 解释:
 * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的异位词。
 * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的异位词。
 * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的异位词。
 */
public class leetcode438 {

    public static void main(String[] args) {
        findAnagrams("cbaebabacd", "abc");
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int step = p.length();
        int[] intsp = new int[26];
        for (int i = 0; i < p.length(); i++) {
            intsp[p.charAt(i) - 'a']++;
        }
        // 每次截取p长度的子字符串判断是否是异位词
        for (int i = 0; i <= s.length() - step; i++) {
            int[] ints = new int[26];
            for (int j = i; j < i + step; j++) {
                ints[s.charAt(j) - 'a']++;
            }
            if (Arrays.equals(ints,intsp)) list.add(i);
        }
        return list;
    }
}
