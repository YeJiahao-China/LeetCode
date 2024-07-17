package com.leetcode;

/**
 * @author JHYe
 * @date 2024/7/12
 * 示例 1：
 *
 * 输入：nums = [1,1,2]
 * 输出：2, nums = [1,2,_]
 * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
 *
 * 示例 2：
 *
 * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
 * 输出：5, nums = [0,1,2,3,4]
 * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
 */
public class leetcode26 {


    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    public static int removeDuplicates(int[] nums) {
//        [0,0,1,1,1,2,2,3,3,4]
        // 定义慢指针i，快指针j i每次挪动一位 ，j负责往后挪动找到非重复的数字赋值给++i
        int i = 0;
        int j = 0;
        while (j<nums.length){
            while (j<nums.length && nums[i] == nums[j]){
                j++;
            }
            i++;
            if (j<nums.length) nums[i] = nums[j];

        }
        return i;

    }
}
