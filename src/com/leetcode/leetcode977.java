package com.leetcode;

/**
 * @author JHYe
 * @date 2024/7/12
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100]
 * 排序后，数组变为 [0,1,9,16,100]
 * 示例 2：
 * 输入：nums = [-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 */
public class leetcode977 {

    public static void main(String[] args) {
        int[] ints = sortedSquares(new int[]{-7,-3,2,3,11});
        for (int i = 0; i <ints.length ; i++) {
            System.out.println(ints[i]);
        }
    }

    public static int[] sortedSquares(int[] nums) {
        // 定义双指针left和right 依次比较nums[left]的平方和nums[right]平方的大小，赋值到ret中
        int left = 0;
        int right = nums.length - 1;
        int[] ret = new int[nums.length];
        int index = ret.length - 1;
        while (left < right) {
            int leftMulti = nums[left] * nums[left];
            int rightMulti = nums[right] * nums[right];
            if (leftMulti < rightMulti) {
                ret[index--] = rightMulti;
                right--;
            } else if (leftMulti > rightMulti) {
                ret[index--] = leftMulti;
                left++;
            } else {
                ret[index--] = leftMulti;
                ret[index--] = rightMulti;
                left++;
                right--;
            }
        }
        ret[0] = nums[left] * nums[left];
        return ret;
    }

}
