package com.leetcode;

import java.util.Arrays;

/**
 * @author JHYe
 * @date 2024/7/22
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 * 如果可以，返回 true ；否则返回 false 。
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 * <p>
 * 示例 1：
 * 输入：ransomNote = "a", magazine = "b"
 * 输出：false
 * 示例 2：
 * <p>
 * 输入：ransomNote = "aa", magazine = "ab"
 * 输出：false
 * 示例 3：
 * <p>
 * 输入：ransomNote = "aa", magazine = "aab"
 * 输出：true
 */
public class leetcode383 {

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || magazine == null || ransomNote.length() > magazine.length()) return false;
        int[] ints0 = new int[26];
        int[] ints1 = new int[26];
        // ints1应该比对应位置上的ints0的数字要大
        for (int i = 0; i < magazine.length(); i++) {
            if (i < ransomNote.length()) {
                ints0[ransomNote.charAt(i) - 'a']++;
            }
            ints1[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (ints0[i]!=0){
                if (ints0[i] > ints1[i]) return false;
            }
        }
        return true;
    }

}
