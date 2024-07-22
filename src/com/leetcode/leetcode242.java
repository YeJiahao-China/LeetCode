package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author JHYe
 * @date 2024/7/22
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * <p>
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 * 示例 1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 * 输入: s = "rat", t = "car"
 * 输出: false
 */
public class leetcode242 {

    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }


    // 优化hash
    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) return false;
        int[] sints = new int[26];
        int[] tints = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sints[s.charAt(i) - 'a']++;
            tints[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i <26 ; i++) {
            if (sints[i] != tints[i]){
                return false;
            }
        }
        return  true;
    }

    // 先排序试试 3ms
    public static boolean isAnagram1(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) return false;
        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();
        Arrays.sort(schars);
        Arrays.sort(tchars);
        for (int i = 0; i < schars.length; i++) {
            if (schars[i] != tchars[i]) {
                return false;
            }
        }
        return true;

    }


    // hashmap挺慢 17ms
    public static boolean isAnagram0(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) return false;

        Map<Character, Integer> smap = new HashMap<>(s.length());
        Map<Character, Integer> tmap = new HashMap<>(s.length());

        for (int i = 0; i < s.length(); i++) {
            smap.compute(s.charAt(i), (k, v) -> v == null ? 1 : 1 + v);
            tmap.compute(t.charAt(i), (k, v) -> v == null ? 1 : 1 + v);
        }

        if (smap.size() != tmap.size()) return false;

        for (Map.Entry<Character, Integer> entry : smap.entrySet()
        ) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            Integer integer = tmap.get(key);
            if (integer == null || !value.equals(integer)) {
                return false;
            }
        }

        return true;
    }

}
