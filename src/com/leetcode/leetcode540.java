package com.leetcode;

/**
 * @author JHYe
 * @date 2024/7/3
 */
public class leetcode540 {

    public static void main(String[] args) {
        singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8});
    }

    public static void singleNonDuplicate(int[] nums) {
//        1,1,2,3,3,4,4,8,8  每个元素都为2个的正常情况下 偶数索引是第一个数紧接着后面就是第二个数
//        1,2,2,3,3,4,4,8,8  缺2情况下  length = 9 mid=4 arr[mid] = 最后一个3 这就不对，节奏被打乱了说明前面有数字的个数仅为1个
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            // mid为偶数，num[mid]应该是第一个数
            if (mid % 2 == 0 ) {
                if ( nums[mid] != nums[mid + 1]){
                    //定位到左边
                    right = mid;
                }else {
                    //定位到右边
                    left = mid+1;
                }
            } else {
                if ( nums[mid] != nums[mid - 1]){
                    //定位到左边
                    right = mid;
                }else {
                    //定位到右边
                    left = mid+1;
                }
            }
        }
    }


    public static int singleNonDuplicate0(int[] nums) {
//        1,1,2,3,3,4,4,8,8  length = 9 mid=4 arr[mid] = 3
//        1,1,2,3,3,4,4,8,8 length = 10 mid =5  arr[mid] = 4
//        1,1,2,2,3,3,4,4,8  length = 9 mid=4 arr[mid] = 3

//        1,1,2,2,3,3,4,4,8,8  每个元素都为2个的正常情况下  length = 10 mid=5 arr[mid] = 最后一个3
//        1,1,2,3,3,4,4,8,8  缺2情况下  length = 9 mid=4 arr[mid] = 最后一个3

//        1,1,2,2,3,3,4,4,8,8  每个元素都为2个的正常情况下  length = 10 mid=5 arr[mid] = 最后一个3
//        1,1,2,2,3,3,4,4,8   缺8情况下  length = 9 mid=4 arr[mid] = 最后一个3
        if (nums.length == 1) return nums[0];
        for (int i = 0; i < nums.length; i += 2) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return Integer.MIN_VALUE;
    }
}
