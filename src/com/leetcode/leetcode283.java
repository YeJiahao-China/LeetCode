package com.leetcode;

/**
 * @author JHYe
 * @date 2024/7/12
 * 示例 1:

 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 示例 2:
 *
 * 输入: nums = [0]
 * 输出: [0]
 */
public class leetcode283 {


    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0});
    }

    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while ( j<nums.length){

            while (j<nums.length && nums[j]==0){
                j++;
            }
            if (j<nums.length) {
                nums[i] = nums[j++];
                i++;
            }
//            i++;
        }
        // 处理i后面的元素  全部赋值为0
        for (int k = i; k <nums.length ; k++) {
            nums[k] = 0;
        }

        for (int k = 0; k <nums.length ; k++) {
            System.out.println(nums[k]);
        }
    }

}
