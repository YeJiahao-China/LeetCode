package com.leetcode;


import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author JHYe
 * @date 2024/7/2
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * 找出该数组中满足其总和大于等于 target 的长度最小的
 * 子数组
 * [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 * <p>
 * 示例 1：
 * 输入：target = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 * <p>
 * 示例 2：
 * 输入：target = 4, nums = [1,4,4]
 * 输出：1
 * <p>
 * 示例 3：
 * 输入：target = 11, nums = [1,1,1,1,1,1,1,1]
 * 输出：0
 */
public class leetcode209 {

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }


    // 双指针
    public static int minSubArrayLen2(int target, int[] nums) {
        //  2, 3, 1, 2, 4, 3
        int start = 0, end = 0;
        int ret = Integer.MAX_VALUE;
        int sum = 0;
        while (end<nums.length){

            sum+=nums[end++];
            while (sum>=target){
                ret = Math.min(ret,end-start);
                sum-=nums[start++];
            }
        }
        return  ret==Integer.MAX_VALUE ? 0 : ret;
    }


    // 双指针
    public static int minSubArrayLen(int target, int[] nums) {
        //  2, 3, 1, 2, 4, 3
        // end负责添加元素，start负责减少元素
        int sum = 0;
        int ret = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        while (end < nums.length) {
            sum += nums[end++];
            while (sum >= target) {
                // 满足条件，就一直让start减少元素
                ret = Math.min(ret, end - start);
                sum -= nums[start++];
            }
        }
        return ret == Integer.MAX_VALUE ? 0 : ret;
    }


    // 5ms 不算优秀
    public static int minSubArrayLen1(int target, int[] nums) {
        int sum = 0;
        int ret = Integer.MAX_VALUE;
        Queue<Integer> queue = new LinkedList<>();
        int index = 0;
        queue.add(nums[index]);
        sum += nums[index];
        while (!queue.isEmpty()) {
            if (sum >= target) {
                // 更新ret
                ret = Math.min(ret, queue.size());
                // 去掉第一个元素
                Integer poll = queue.poll();
                sum -= poll;
            } else {
                if (index >= nums.length - 1) {
                    break;
                } else {
                    index++;
                    sum += nums[index];
                    queue.add(nums[index]);
                }
            }
        }
        return ret == Integer.MAX_VALUE ? 0 : ret;
    }

    // 暴力解法 超时
    public static int minSubArrayLen0(int target, int[] nums) {
        int sum = 0;
        int ret = Integer.MAX_VALUE;
        for (int left = 0; left < nums.length; left++) {
            // 以left为终点，从0开始计算和为target的最短数组长度
            for (int right = left; right < nums.length; right++) {
                sum += nums[right];
                if (sum >= target) {
                    ret = Math.min(ret, right - left + 1);
                    break;
                }
            }
            sum = 0;
        }

        return ret == Integer.MAX_VALUE ? 0 : ret;
    }
}
