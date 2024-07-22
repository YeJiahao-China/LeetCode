package com.leetcode;


import java.util.*;

/**
 * @author JHYe
 * @date 2024/7/22
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * <p>
 * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
 * 示例 1:
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * <p>
 * 示例 2:
 * 输入: strs = [""]
 * 输出: [[""]]
 * <p>
 * 示例 3:
 * 输入: strs = ["a"]
 * 输出: [["a"]]
 */
public class leetcode49 {

    public static void main(String[] args) {
        groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

    //  用排序来做
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(strs.length);
        for (int i = 0; i < strs.length; i++) {

            String str = strs[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = String.valueOf(chars);
            if (!map.containsKey(key)) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            } else {
                map.get(key).add(str);
            }
        }
        List<List<String>> ret = new ArrayList<>(map.values());
        return ret;
    }


    // 有点慢
    public static List<List<String>> groupAnagrams1(String[] strs) {
        List<List<String>> ret = new ArrayList<>();
        int[] counted = new int[strs.length]; //已经被统计的位置
        int[][] ints = new int[strs.length][26];
        // 统计每个单词的对应的字母hash
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            for (int j = 0; j < str.length(); j++) {
                ints[i][str.charAt(j) - 'a']++;
            }
        }
        for (int i = 0; i < ints.length; i++) {
            int[] anInt = ints[i];
            if (counted[i] == 0) {
                // 找到跟anInt各个位置相同的字符串
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                counted[i] = 1;
                for (int j = i + 1; j < ints.length; j++) {
                    if (counted[j] == 0) {
                        boolean equals = Arrays.equals(anInt, ints[j]);
                        if (equals) {
                            list.add(strs[j]);
                            counted[j] = 1;
                        }
                    }
                }
                ret.add(list);
            }
        }
        return ret;
    }


    // 有点慢
    public static List<List<String>> groupAnagrams0(String[] strs) {
        List<List<String>> ret = new ArrayList<>();
        int[] counted = new int[strs.length]; //已经被统计的位置
        int[][] ints = new int[strs.length][26];
        // 统计每个单词的对应的字母hash
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            for (int j = 0; j < str.length(); j++) {
                ints[i][str.charAt(j) - 'a']++;
            }
        }
        for (int i = 0; i < ints.length; i++) {
            int[] anInt = ints[i];
            if (counted[i] == 0) {
                // 找到跟anInt各个位置相同的字符串
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                counted[i] = 1;
                for (int j = i + 1; j < ints.length; j++) {
                    boolean flag = false;
                    if (counted[j] == 0) {
                        for (int k = 0; k < 26; k++) {
                            if (ints[j][k] != ints[i][k]) {
                                flag = true;
                                break;
                            }
                        }
                        if (!flag) {
                            counted[j] = 1;
                            list.add(strs[j]);
                        }
                    }
                }
                ret.add(list);
            }
        }
        return ret;
    }
}
