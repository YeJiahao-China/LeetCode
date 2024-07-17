package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JHYe
 * @date 2024/7/2
 * <p>
 * <p>
 * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
 * <p>
 * 子序列 是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列
 * <p>
 * 示例 1：
 * 输入：nums = [10,9,2,5,3,7,101,18]
 * 输出：4
 * 解释：最长递增子序列是 [2,3,7,101]，因此长度为 4 。
 * <p>
 * 示例 2：
 * 输入：nums = [0,1,0,3,2,3]
 * 输出：4
 * <p>
 * 示例 3：
 * 输入：nums = [7,7,7,7,7,7,7]
 * 输出：1
 */
public class leetcode300 {

    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));

    }


    public static int lengthOfLIS(int[] nums) {

        int ret = 0;
        int[] dp = new int[nums.length]; // dp每个位置对应nums每个位置结尾的最长子序列
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    // 此时num[i]可以接到num[j]后面，比如说i=3，nums[i]=3  j从0开始，nums[i]可以接到0/1/0后面，但是要取个最大值，因为需要最长
                    dp[i] = Math.max(dp[i], dp[j]);
                }
            }
            dp[i]++;
            ret = Math.max(ret,dp[i]);
        }
       return ret;
    }

//    public static int lengthOfLIS(int[] nums) {
//
//        int n = nums.length, ans = 0;
//        int[] f = new int[n]; // f数组表示对应nums每个位置上的最长子序列的长度
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                if (nums[j] < nums[i]) {
//                    f[i] = Math.max(f[i], f[j]);
//                }
//            }
//            ans = Math.max(ans, ++f[i]);
//        }
//        return ans;

//        int ret = 1;
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length - 1; i++) {
//            list.add(nums[i]);
//            // 每一轮
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j]>list.get(list.size()-1)){
//                    list.add(nums[j]);
//                }
//            }
//            //一轮结束
//            ret = Math.max(ret, list.size());
//
//        }
//        return ret;

//        int ret = 1;
//        if (nums.length == 1) {
//            return ret;
//        }
//        if (nums.length == 0) {
//            return 0;
//        }
//        int left = 0;
//        while (left < nums.length - 1) {
//            // 每一轮
//            int right = left + 1;
//            int temp0 = nums[left];
//            int temp1 = nums[left + 1];
//            int length = 1;
//            while (right < nums.length) {
//                if (nums[right] > temp1) {
//                    length++;
//                    temp0 = temp1;
//                    temp1 = nums[right];
//                } else if (nums[right] < temp1 && nums[right] >= temp0) {
//                    length++;
//                    temp1 = nums[right];
//                }
//                right++;
//            }
//            ret = Math.max(ret, length);
//            left++;
//        }
//        return ret;

}
