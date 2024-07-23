package com.leetcode;

import java.util.ArrayList;

/**
 * @author JHYe
 * @date 2024/7/23
 * 给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 * 示例 2:
 * <p>
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[4,9]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 */
public class leetcode350 {

    public static void main(String[] args) {
        intersect(new int[]{1,2,2,1},new int[]{2,2});
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int length = 1001;
        int[] ints1 = new int[length];
        int[] ints2 = new int[length];

        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            ints1[num]++;
        }

        for (int i = 0; i < nums2.length; i++) {
            int num = nums2[i];
            ints2[num]++;
        }
        for (int i = 0; i < length; i++) {
            if (ints1[i] != 0 && ints2[i] != 0) {
                int minCount = ints1[i] > ints2[i] ? ints2[i] : ints1[i];
                for (int j = 0; j <minCount ; j++) {
                    list.add(i);
                }
            }
        }
        int [] result = new int [list.size()];
        int j = 0;
        for(int i : list){
            result[j++] = i;
        }
        return result;
    }
}
