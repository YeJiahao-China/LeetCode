package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author JHYe
 * @date 2024/7/23
 * 给定两个数组 nums1 和 nums2 ，返回 它们的
 * 交集
 * 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 示例 2：
 * <p>
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 * 解释：[4,9] 也是可通过的
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 */
public class leetcode349 {

    public static void main(String[] args) {
        intersection(new int[]{1,2,2,1},new int[]{2,2});
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int length = 1001;
        int[] ints1 = new int[length];
        int[] ints2 = new int[length];

        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            if (ints1[num] == 0) ints1[num] = 1;
        }

        for (int i = 0; i < nums2.length; i++) {
            int num = nums2[i];
            if (ints2[num] == 0) ints2[num] = 1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (ints1[i]!=0 && ints2[i]!=0 && ints1[i] == ints2[i]) list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
