package com.leetcode;


/**
 * @author JHYe
 * @date 2024/7/4
 */
public class leetcode5 {

    public static void main(String[] args) {
        // 如果字符串向前和向后读都相同，则它满足 回文性
        // 输入：s = "babad"
        //输出："bab"
        //解释："aba" 同样是符合题意的答案。
        System.out.println(longestPalindrome("aacabdkacaa")); // aca
    }

    //  中心扩散算法
    public static String longestPalindrome(String s) {
        if (s.length() == 1) return s;
        int maxStart = 0;
        int maxLen = 0;
        int len = 1;
        for (int i = 0; i < s.length(); i++) {
            int left = i - 1;
            int right = i + 1;
            len = 1; //每一轮的初始长度最短的就是字符本身
            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                left--;
                len++;
            }
            while (right < s.length() && s.charAt(right) == s.charAt(i)) {
                right++;
                len++;
            }

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                len += 2;
                left--;
                right++;
            }
            if (len > maxLen) {
                maxLen = len;
                maxStart = left;
            }
        }
        return s.substring(maxStart + 1, maxLen + maxStart + 1);
    }


    public static String longestPalindrome0(String s) {
        if (s.length() == 1) return s;
        String ret = null;
        int i = 0;
        int j = i + 1;
        StringBuffer sb = new StringBuffer();
        while (i < s.length()) {
            char start = s.charAt(i);
            sb.append(start);
            for (; j < s.length(); j++) {
                sb.append(s.charAt(j));
                if (s.charAt(j) == start) {

                    StringBuffer tempSb = new StringBuffer(sb);

                    String sub = sb.toString();
                    StringBuffer reverse = sb.reverse();
                    String subReverse = reverse.toString();
//                    ret = judge(s, i, j, ret);
                    if (sub.equals(subReverse)) {
                        if (ret == null) ret = sub;
                        else ret = ret.length() >= sub.length() ? ret : sub;
                    }

                    sb = tempSb;
                }
            }
            sb = new StringBuffer();
            j = (++i) + 1;
        }
        return ret == null ? String.valueOf(s.charAt(0)) : ret;
    }


    public static String judge(String s, int i, int j, String ret) {
        int left = i;
        int right = j;
        boolean b = true;
        while (left <= right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                b = false;
                break;
            }
        }
        if (b) {
            String substring = s.substring(i, j + 1);
            if (ret != null) {
                return ret.length() >= j - i + 1 ? ret : substring;
            } else {
                return substring;
            }
        }
        return ret;
    }
}
