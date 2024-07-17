package com.leetcode;

/**
 * @author JHYe
 * @date 2024/7/2
 */

/**
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 * <p>
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * <p>
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 * 示例 1：
 * <p>
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 * 示例 2：
 * <p>
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 * 示例 3：
 * <p>
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 */
public class leetcode34 {

    public static void main(String[] args) {
        int[] ints = searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        System.out.println(ints[0] + "," + ints[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int index0 = -1;
        int index1 = -1;
        int[] ret = new int[]{index0, index1};
        int left = 0, right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index0 = mid;
                index1 = mid;
                // 找到左边的索引
                while (index0 >= 0 && nums[index0] == target) {
                    index0--;
                }
                // 找到右边的索引
                while (index1 <= nums.length - 1 && nums[index1] == target) {
                    index1++;
                }
                ret[0] = index0 + 1;
                ret[1] = index1 - 1;
                break;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return ret;
    }


    public static int[] searchRange0(int[] nums, int target) {

        int index0 = doSearchRange(nums, target);
        if (index0 < 0 || index0 >= nums.length || nums[index0] != target) {
            return new int[]{-1, -1};
        }
        int index1 = doSearchRange(nums, target + 1) - 1;
        return new int[]{index0, index1};
    }

    public static int doSearchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {

            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
