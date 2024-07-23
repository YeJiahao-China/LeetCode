package com.leetcode;

import java.util.*;

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
        findAnagrams("baa", "aa");
    }


    public static List<Integer> findAnagrams(String s, String t) {
        List<Integer> res = new ArrayList<>();
        Map<Character, Integer> tmap = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
        }
        int valid = tmap.size();
        int dvalid = 0;
        int left = 0;
        int right = 0;

        while (right < s.length()) {

            char c = s.charAt(right);
            right++;
            if (tmap.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (tmap.get(c).equals(window.get(c))) {
                    dvalid++;
                }
            }

            while (right - left >= t.length()) {
                if (dvalid == valid) {
                    // 可以添加left
                    res.add(left);
                }
                // 往右移动
                char leftC = s.charAt(left);
                // 如果左侧的字符是目标字符
                if (tmap.containsKey(leftC)){
                    if (tmap.get(leftC).equals(window.get(leftC))){
                        dvalid--;
                    }
                    window.put(leftC,window.get(leftC)-1);
                }
                left++;
            }

        }
        return res;
    }

    // 有点慢了
    public static List<Integer> findAnagrams0(String s, String p) {
        List<Integer> list = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        int step = p.length();
        int[] intsp = new int[26];
        // 每次截取p长度的子字符串判断是否是异位词
        int[] ints = new int[26];
        for (int i = 0; i <= s.length() - step; i++) {
            for (int j = i; j < i + step; j++) {
                int index = s.charAt(j) - 'a';
                ints[index]++;
            }
            if (Arrays.equals(ints, intsp)) list.add(i);

        }
        return list;
    }
}
